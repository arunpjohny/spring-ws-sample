package com.arun.ws.invoice.endpoint;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.math.RandomUtils;
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

		for (String code : request.getCodes()) {
			response.getCountMap().put(code, RandomUtils.nextInt());
		}

		// These are some junk values to test whether BigDecimal, Date, Float,
		// Integer and String values can be passed to the map
		response.getCountMap().put("test-bigdecimal", new BigDecimal(11));
		response.getCountMap().put("test-date", new Date());
		response.getCountMap().put("test-float", 1.1f);
		response.getCountMap().put("test-int", 1);
		response.getCountMap().put("test-string", "one");

		return response;
	}
}
