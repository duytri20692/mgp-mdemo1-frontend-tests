package com.mgp.mdemo1.frontend.tests.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import static com.mgp.mdemo1.frontend.tests.common.Hooks.dotenv;
import static com.mgp.mdemo1.frontend.tests.common.Hooks.sessionId;

public class MyListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // Set the test status (pass or fail) on BrowserStack after the test method invocation
        if (method.isTestMethod()) {
            String status = testResult.isSuccess() ? "passed" : "failed";
            setTestStatus(sessionId, status);
        }
    }

    private void setTestStatus(String sessionId, String status) {
        // Set BrowserStack credentials
        String userName = dotenv.get("BROWSERSTACK_USER_NAME");
        String accessKey = dotenv.get("BROWSERSTACK_ACCESS_KEY");

        // Create the request body
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("status", status);

        // Make a PUT request to update the test status
        try {
            URL url = new URL("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json");
            HttpRequest.Builder builder = HttpRequest.newBuilder(url.toURI())
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Basic " + Base64.getEncoder().encodeToString((userName + ":" + accessKey).getBytes()))
                    .PUT(HttpRequest.BodyPublishers.ofString(new ObjectMapper().writeValueAsString(requestBody)));
            HttpRequest request = builder.build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Test status updated: " + response.statusCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
