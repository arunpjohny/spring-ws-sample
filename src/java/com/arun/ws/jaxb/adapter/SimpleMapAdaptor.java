package com.arun.ws.jaxb.adapter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.arun.ws.common.BigDecimalWrapper;
import com.arun.ws.common.DateWrapper;
import com.arun.ws.common.FloatWrapper;
import com.arun.ws.common.IntegerWrapper;
import com.arun.ws.common.SimpleMap;
import com.arun.ws.common.SimpleMapEntry;
import com.arun.ws.common.StringWrapper;

public class SimpleMapAdaptor extends
		XmlAdapter<SimpleMap, Map<String, Object>> {

	@Override
	public SimpleMap marshal(Map<String, Object> v) throws Exception {
		SimpleMap myMap = new SimpleMap();
		List<SimpleMapEntry> aList = myMap.getEntry();
		for (Map.Entry<String, Object> e : v.entrySet()) {
			Object value = e.getValue();
			if (value instanceof BigDecimal) {
				value = new BigDecimalWrapper((BigDecimal) value);
			} else if (value instanceof Date) {
				value = new DateWrapper((Date) value);
			} else if (value instanceof Float) {
				value = new FloatWrapper((Float) value);
			} else if (value instanceof Integer) {
				value = new IntegerWrapper((Integer) value);
			} else if (value instanceof String) {
				value = new StringWrapper((String) value);
			}
			aList.add(new SimpleMapEntry(e.getKey(), value));
		}
		return myMap;
	}

	@Override
	public Map<String, Object> unmarshal(SimpleMap v) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		for (SimpleMapEntry e : v.getEntry()) {
			Object value = e.getAny();
			if (value instanceof BigDecimalWrapper) {
				value = ((BigDecimalWrapper) value).getValue();
			} else if (value instanceof DateWrapper) {
				value = ((DateWrapper) value).getValue();
			} else if (value instanceof FloatWrapper) {
				value = ((FloatWrapper) value).getValue();
			} else if (value instanceof IntegerWrapper) {
				value = ((IntegerWrapper) value).getValue();
			} else if (value instanceof StringWrapper) {
				value = ((StringWrapper) value).getValue();
			}
			map.put(e.getKey(), value);
		}
		return map;
	}
}