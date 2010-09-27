package com.arun.ws.sample.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( name = "", propOrder = {"request"} )
@XmlRootElement(name = "sampleRequest", namespace = "http://equilibriums.com/sample-spring-ws")
public class SampleRequest{
    
    @XmlElement(namespace = "http://equilibriums.com/sample-spring-ws")
    private String request = null;
    
    public String getRequest(){
        return request;
    }
    
    public void setRequest(String request){
        this.request = request;
    }    
}
