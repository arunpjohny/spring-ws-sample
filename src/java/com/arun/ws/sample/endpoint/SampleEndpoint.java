package com.arun.ws.sample.endpoint;

import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.arun.ws.sample.model.SampleRequest;
import com.arun.ws.sample.model.SampleResponse;

@Endpoint
@Component
public class SampleEndpoint{
     
    @PayloadRoot(localPart = "sampleRequest", namespace = "http://equilibriums.com/sample-spring-ws")
    public SampleResponse processSampleRequest(SampleRequest request){
        SampleResponse result = new SampleResponse();
        result.setResponse( "Request was: " + request.getRequest() );
        return result;
    }
}
