package com.arun.ws.jaxb.adapter;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.arun.ws.jaxb.JavaTypeConverter;

public class DateAdapter extends XmlAdapter<String, Date> {

	public Date unmarshal(String value) {
		return (JavaTypeConverter.parseStringToDate(value));
	}

	public String marshal(Date value) {
		return (JavaTypeConverter.printDateToString(value));
	}

}
