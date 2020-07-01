package com.hba.test;

import java.util.Date;

import com.hba.accessor.SingerAccessor;
import com.hba.entities.Singer;

public class HBAnnoSaveTest {
	public static void main(String[] args) {
		SingerAccessor accessor = new SingerAccessor();
		Singer singer = new Singer(2, "Shreya Ghoshal", new Date(), "MALE", "5896230", "shreya@gmail.com", "JAZZ", "Hindi");
		int result = accessor.saveSinger(singer);
		if (result == 0) {
			System.out.println("Record is not Stored ");
		}else {
			System.out.println("Record is Stored successfully");
		}

	}
}
