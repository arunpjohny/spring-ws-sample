package com.arun.ws.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SimpleMap", namespace = "http://arun.com/ws/commons/")
@XmlType(name = "SimpleMap", namespace = "http://arun.com/ws/commons/", propOrder = { "entry" })
public class SimpleMap {

	@XmlElement(name = "Entry")
	protected List<SimpleMapEntry> entry;

	public List<SimpleMapEntry> getEntry() {
		if (entry == null) {
			entry = new ArrayList<SimpleMapEntry>();
		}
		return this.entry;
	}

}
