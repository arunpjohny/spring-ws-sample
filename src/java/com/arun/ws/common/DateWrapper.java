package com.arun.ws.common;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.arun.ws.jaxb.adapter.DateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DateWrapper", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "DateWrapper", namespace = "http://arun.com/ws/commons/", propOrder = { "value" })
public class DateWrapper {
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateAdapter .class)
    @XmlSchemaType(name = "dateTime")
	protected Date value;

	public DateWrapper() {
	}

	public DateWrapper(Date value) {
		this.value = value;
	}

	public Date getValue() {
		return value;
	}

	public void setValue(Date value) {
		this.value = value;
	}
}
