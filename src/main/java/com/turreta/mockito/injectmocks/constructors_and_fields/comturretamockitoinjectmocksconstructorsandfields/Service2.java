package com.turreta.mockito.injectmocks.constructors_and_fields.comturretamockitoinjectmocksconstructorsandfields;

import java.util.ArrayList;
import java.util.List;

public class Service2
{
	public List<String> getDataById(String s)
	{
		List<String> data = new ArrayList();
		data.add("Data 3");
		data.add("Data 4");
		return data;
	}
}
