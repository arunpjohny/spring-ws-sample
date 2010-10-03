package com.arun.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FloatWrapper", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "FloatWrapper", namespace = "http://arun.com/ws/commons/", propOrder = { "value" })
public class FloatWrapper {

	@XmlValue
	protected Float value;

	public FloatWrapper() {
	}

	public FloatWrapper(Float value) {
		this.value = value;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}
}
