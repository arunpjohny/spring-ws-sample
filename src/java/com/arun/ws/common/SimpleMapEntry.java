package com.arun.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SimpleMapEntry", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "SimpleMapEntry", namespace = "http://arun.com/ws/commons/", propOrder = { "any" })
public class SimpleMapEntry {

	@XmlAnyElement(lax = true)
	protected Object any;
	@XmlAttribute(name = "key")
	protected String key;

	public SimpleMapEntry() {
	}

	public SimpleMapEntry(String key, Object value) {
		this.key = key;
		this.any = value;
	}

	public Object getAny() {
		return any;
	}

	public void setAny(Object value) {
		this.any = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String value) {
		this.key = value;
	}

}
