package com.arun.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IntegerWrapper", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "IntegerWrapper", namespace = "http://arun.com/ws/commons/", propOrder = { "value" })
public class IntegerWrapper {

	@XmlValue
	protected Integer value;

	public IntegerWrapper() {
	}

	public IntegerWrapper(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
