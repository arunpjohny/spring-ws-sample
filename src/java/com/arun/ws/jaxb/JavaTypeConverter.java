package com.arun.ws.jaxb;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang.StringUtils;

public class JavaTypeConverter {
	public static Date parseStringToDate(String value) {
		if (StringUtils.isEmpty(value)) {
			return null;
		}

		Calendar parseDateTime = DatatypeConverter.parseDateTime(value);
		return parseDateTime.getTime();
	}

	public static String printDateToString(Date value) {
		if (value == null) {
			return null;
		}

		Calendar cl = Calendar.getInstance();
		cl.setTime(value);
		return DatatypeConverter.printDateTime(cl);
	}
}
