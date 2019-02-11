package com.xiaochen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//getTodayEndTimeMillis();
	}

	private static void getTodayEndTimeMillis() {
		Calendar cale = Calendar.getInstance();
		Date time = cale.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.printf("1-dateFormat:"+dateFormat.format(time));

		Calendar cale2 = Calendar.getInstance();
		cale2.set(Calendar.HOUR,23);
		cale2.set(Calendar.MINUTE,59);
		cale2.set(Calendar.SECOND,59);
		Date endTime = cale2.getTime();
		System.out.printf("\n2-dateFormat:"+dateFormat.format(endTime));

		long hasMillis = (endTime.getTime() - time.getTime());
		System.out.printf("\n3-hasTimeMillis:"+Double.parseDouble(hasMillis+"")/(1000*60));
		System.out.printf("\n4-hasTimeMillis:"+Double.parseDouble((endTime.getTime()-System.currentTimeMillis())+"")/(1000*60));
		System.out.printf("\n5-hasTimeMillis:"+Double.parseDouble((cale2.getTimeInMillis()-cale.getTimeInMillis())+"")/(1000*60));
	}
}
