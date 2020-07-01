package com.hba.test;

import com.hba.accessor.SingerAccessor;
import com.hba.entities.Singer;
import com.hba.helper.SessionFactoryHelper;

public class HBAnnoGetTest {
	public static void main(String[] args) {
		try {
			SingerAccessor accessor = new SingerAccessor();
			Singer singer = accessor.getSinger(1);
			System.out.println(singer);
			
		}finally {
			SessionFactoryHelper.closeSessionFactory();
		}
		
	}
}
