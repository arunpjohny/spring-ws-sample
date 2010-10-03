package com.arun.test.ws.invoice;

import java.io.IOException;
import java.util.Date;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.arun.ws.invoice.model.InvoiceCountRequest;
import com.arun.ws.invoice.model.InvoiceCountResponse;

public class InvoiceCountRequestTest {

	private WebServiceTemplate webServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}

	public void request() throws IOException {

		try {
			InvoiceCountRequest request = new InvoiceCountRequest();
			request.setFromDate(new Date());
			request.setToDate(new Date());
			request.getCodes().add("code1");
			request.getCodes().add("code2");
			request.getCodes().add("code3");

			InvoiceCountResponse response = (InvoiceCountResponse) webServiceTemplate
					.marshalSendAndReceive(request);

			System.out.println("result: " + response);
			
			System.out.println("Contents of the map");
			for (Entry<String, Object> entry : response.getCountMap().entrySet()) {
				System.out.println(entry.getKey()+" : " + entry.getValue());
			}
			
		} catch (SoapFaultClientException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml", InvoiceCountRequestTest.class);
		InvoiceCountRequestTest echoClient = (InvoiceCountRequestTest) applicationContext
				.getBean("client");
		echoClient.request();
	}

}
