package com.arun.ws.sample.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( name = "", propOrder = {"response"} )
@XmlRootElement(name = "sampleResponse", namespace = "http://equilibriums.com/sample-spring-ws")
public class SampleResponse{
    
    @XmlElement(namespace = "http://equilibriums.com/sample-spring-ws")
    private String response = null;
    
    public String getResponse(){
        return response;
    }
    
    public void setResponse(String response){
        this.response = response;
    }    
}
