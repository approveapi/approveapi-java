/*
 * ApproveAPISwagger
 * The simple API to request a user's approval on anything via email + sms.
 *
 * OpenAPI spec version: 1.0.1
 * Contact: dev@approveapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.approveapi;

import com.approveapi.ApiException;
import com.approveapi.CreatePromptRequest;
import com.approveapi.Error;
import com.approveapi.Prompt;
import com.approveapi.PromptStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApproveApi
 */
@Ignore
public class ApproveApiTest {

    private final ApproveApi api = new ApproveApi();

    
    /**
     * Sending a prompt
     *
     * Creates a prompt and pushes it to the user (sends via email, sms, or other supported protocols).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPromptTest() throws ApiException {
        CreatePromptRequest createPromptRequest = null;
        Prompt response = api.createPrompt(createPromptRequest);

        // TODO: test validations
    }
    
    /**
     * Retrieve a prompt
     *
     * Retrieve the prompt object with the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPromptTest() throws ApiException {
        String id = null;
        Boolean longPoll = null;
        Prompt response = api.getPrompt(id, longPoll);

        // TODO: test validations
    }
    
    /**
     * Check prompt status
     *
     * Returns whether a prompt has been completed by the user. This request does not require authentication, and so can be used client-side without sharing API credentials.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPromptStatusTest() throws ApiException {
        String id = null;
        PromptStatus response = api.getPromptStatus(id);

        // TODO: test validations
    }
    
}
