package com.arun.ws.invoice.endpoint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.arun.ws.invoice.model.InvoiceCountRequest;
import com.arun.ws.invoice.model.InvoiceCountResponse;

@Endpoint
@Component("InvoiceCountRequestEndPoint")
public class InvoiceCountRequestEndPoint {
	private static Log log = LogFactory
			.getLog(InvoiceCountRequestEndPoint.class);

	@PayloadRoot(localPart = "invoiceCountRequest", namespace = "http://arun.com/ws/invoice-ops/")
	public InvoiceCountResponse memberDetails(InvoiceCountRequest request) {
		if (log.isDebugEnabled()) {
			log.debug("Inside InvoiceCountRequestEndPoint");
		}
		InvoiceCountResponse response = new InvoiceCountResponse();

		return response;
	}
}
