package com.example.Google.ReCaptcha.Validation.servicies;

import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.Google.ReCaptcha.Validation.entity.ReCaptchResponseType;

/* 
 Step 6.) Create a Service class for the Captcha Validation.
*/

/*
 In this step, we will define the method for validating the captcha value which has been received to our application at the time employee 
 registration. Still, we did not create an API to save the new employee detail. So, in the next step, we will Controller class to define all 
 the necessary API.
*/
@Service
public class ReCaptchaValidationService {

    /*
     * If you noticed, in the above code I have uses two final variables.
     * 
     * private static final String GOOGLE_RECAPTCHA_ENDPOINT.
     * private final String RECAPTCHA_SECRET.
     * The value assigned to them is collected from the Google ReCaptcha Site:
     * https://www.google.com/recaptcha/admin
     */

    private static final String GOOGLE_RECAPTCHA_ENDPOINT = "https://www.google.com/recaptcha/api/siteverify";

    private final String RECAPTCHA_SECRET = "Y6Ldtj7IpAAAAAHyRQUQhTonp0ZnUWFX8iHOFdO_G";

    /*
     * And once you click on the submit button, you will redirect to the page where
     * get the two Keys.
     * 
     * Site Key: It should be placed in the .html file or client-side.
     * Secret Key: It should be placed in the server side as shown in above class
     * ReCaptchaValidationService.java
     */

    public boolean validateCaptcha(String captchaResponse) {
        RestTemplate restTemplate = new RestTemplate();

        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap<>();
        requestMap.add("secret", RECAPTCHA_SECRET);
        requestMap.add("response", captchaResponse);

        ReCaptchResponseType apiResponse = restTemplate.postForObject(GOOGLE_RECAPTCHA_ENDPOINT, requestMap,
                ReCaptchResponseType.class);
        if (apiResponse == null) {
            return false;
        }

        return Boolean.TRUE.equals(apiResponse.isSuccess());
    }
}
