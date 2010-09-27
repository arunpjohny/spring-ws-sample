package com.arun.test.ws.sample;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.arun.ws.sample.model.SampleRequest;
import com.arun.ws.sample.model.SampleResponse;

public class SampleRequestTest {

	private WebServiceTemplate webServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}

	public void request() throws IOException {

		try {
			SampleRequest request = new SampleRequest();
			
			SampleResponse response = (SampleResponse) webServiceTemplate
					.marshalSendAndReceive(request);

			System.out.println("result: " + response);
		} catch (SoapFaultClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml", SampleRequestTest.class);
		SampleRequestTest echoClient = (SampleRequestTest) applicationContext
				.getBean("client");
		echoClient.request();
	}

}
