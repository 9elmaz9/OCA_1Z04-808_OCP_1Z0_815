package Enthuware.Standart.test7;

public class test33 {
}
/**Given that Daylight Savings Time ends on Nov 1 at 2 AM in US/Eastern time zone, what will the following code print -
 *  LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
 *  ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
 *  date = date.plus(Duration.ofDays(1));
 *  System.out.println(date);
 *
 *  date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
 *  date = date.plus(Period.ofDays(1)); System.out.println(date);
 *  Note: This question refers to ZonedDateTime and Duration, which are not explicitly mentioned in the objectives.
 * However, a few candidates have reported getting a similar question and so we have included it in this question bank.*/


/**2015-11-01T09:00-05:00[US/Eastern]
 * 2015-11-01T10:00-05:00[US/Eastern]*/