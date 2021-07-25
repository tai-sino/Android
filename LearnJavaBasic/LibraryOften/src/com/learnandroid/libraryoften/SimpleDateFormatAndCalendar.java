package com.learnandroid.libraryoften;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatAndCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int nam = cal.get(Calendar.YEAR);
		System.out.println("Năm nay là : " + nam);
		int thang = cal.get(Calendar.MONTH);
		System.out.println("Tháng là: " + (thang + 1));
		int ngay = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Hôm nay là: " + ngay);
		
		Date t = cal.getTime();
		//26/02/2016
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Hôm nay: " + sdf.format(t));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println("Hôm nay: " + sdf2.format(t));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss aa");
		System.out.println("Hôm nay: " + sdf3.format(t));
		
	}

}
