package com.arun.ws.invoice.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.arun.ws.jaxb.adapter.SimpleMapAdaptor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "http://arun.com/ws/invoice-ops/", name = "invoiceCountResponse")
@XmlType(name = "invoiceCountResponse", propOrder = { "countMap" })
public class InvoiceCountResponse {
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(SimpleMapAdaptor.class)
	private final Map<String, Object> countMap = new HashMap<String, Object>();

	public Map<String, Object> getCountMap() {
		return countMap;
	}

	public void setCountMap(Map<String, Object> value) {
		this.countMap.clear();
		this.countMap.putAll(value);
	}

}
