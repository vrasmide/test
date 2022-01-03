package com.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testfindGreatestFromAllData() {
		DataService dataServiceMock=mock(DataService.class);
		
		//dataServiceMock.retrieveAllData()=>new int [] {24,15,3};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {24,15,3});
		SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceMock);
		int result=businessImpl.findGreatestFromAllData();
		
		assertEquals(24,result);
	}

}

