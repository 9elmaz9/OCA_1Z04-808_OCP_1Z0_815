package Enthuware.Standart.test5;

public class test51 {
}
//    You want to print the date that represents upcoming tuesday from now even if the current day is a tuesday. Which of the following lines of code accomplishe(s) this?

/**
 System.out.println(LocalDate.now()
 .with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));*/

/**
 System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY)
 .adjustInto(LocalDate.now()));*/

/**The JavaDoc description of java.time.temporal.TemporalAdjusters is very helpful:
 *  Adjusters are a key tool for modifying temporal objects. They exist to externalize the process
 *  of adjustment, permitting different approaches, as per the strategy design pattern.
 *  Examples might be an adjuster that sets the date avoiding weekends, or one that sets the date to the last day of the month.
 *  There are two equivalent ways of using a TemporalAdjuster. The first is to invoke the method on the interface directly.
 *  The second is to use Temporal.with(TemporalAdjuster):
 *  // these two lines are equivalent, but the second approach is recommended
 *  temporal = thisAdjuster.adjustInto(temporal);
 *  temporal = temporal.with(thisAdjuster);
 *
 *  It is recommended to use the second approach, with(TemporalAdjuster), as it is a lot clearer to read in code.
 *  This class contains a standard set of adjusters, available as static methods. These include: finding the first
 *  or last day of the month finding the first day of next month finding the first or last day of the year finding
 *  the first day of next year finding the first or last day-of-week within a month, such as "first Wednesday in
 *  June" finding the next or previous day-of-week, such as "next Thursday"*/