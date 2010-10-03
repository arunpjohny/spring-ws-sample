package com.arun.ws.common;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BigDecimalWrapper", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "BigDecimalWrapper", namespace = "http://arun.com/ws/commons/", propOrder = { "value" })
public class BigDecimalWrapper {

	@XmlValue
	protected BigDecimal value;

	public BigDecimalWrapper() {
	}

	public BigDecimalWrapper(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
