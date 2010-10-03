package com.arun.ws.invoice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.arun.ws.jaxb.adapter.DateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "http://arun.com/ws/invoice-ops/", name = "invoiceCountRequest")
@XmlType(name = "invoiceCountRequest", propOrder = { "fromDate", "toDate",
		"codes" })
public class InvoiceCountRequest {

	@XmlElement(required = true, type = String.class)
	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlSchemaType(name = "dateTime")
	protected Date fromDate;
	@XmlElement(required = true, type = String.class)
	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlSchemaType(name = "dateTime")
	protected Date toDate;
	@XmlElement(required = true)
	protected List<String> codes;

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date value) {
		this.fromDate = value;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date value) {
		this.toDate = value;
	}

	public List<String> getCodes() {
		if (codes == null) {
			codes = new ArrayList<String>();
		}
		return this.codes;
	}

}
