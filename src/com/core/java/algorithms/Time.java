package com.core.java.algorithms;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Time {

	public static void main(String[] args) {

		Date currentDate = new Date();
		System.out.println("Date :: " + currentDate);

		// Convert util.Date to ZonedDateTime
		ZonedDateTime dateToZoned = ZonedDateTime.ofInstant(Instant.ofEpochMilli(currentDate.getTime()), ZoneId.of("UTC"));
		System.out.println("Date converted to zoned :: " + dateToZoned);

		// Create ZonedDatetime from current time.Instant
		ZonedDateTime currentDateTimeZoned = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("+00:00"));
		System.out.println("Instant zoned :: " + currentDateTimeZoned);

		// Convert ZonedDateTime to util.Date
		long epoch = currentDateTimeZoned.toInstant().toEpochMilli();
		System.out.println("Epoch from zoned :: " + epoch);
		System.out.println("Date from zoned :: " + new Date(epoch));

	}

}
