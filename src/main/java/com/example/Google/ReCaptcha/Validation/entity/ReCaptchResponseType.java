package com.example.Google.ReCaptcha.Validation.entity;

import lombok.Getter;
import lombok.Setter;
/*
* Step 7: Create a class to declare the ReCaptcha variables.
*
* Here we are declaring some variables that can be used to display the message after the ReCaptcha validation.
*/

@Getter
@Setter
public class ReCaptchResponseType {

    private boolean success;
    private String challenge_ts;
    private String hostname;

}
