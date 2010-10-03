package com.arun.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StringWrapper", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "StringWrapper", namespace = "http://arun.com/ws/commons/", propOrder = { "value" })
public class StringWrapper {

	@XmlValue
	protected String value;

	public StringWrapper() {
	}

	public StringWrapper(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
