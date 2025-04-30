package Enthuware.Standart.test6;

public class test28 {
}
/**What will the following line of code print?
 * System.out.println(LocalDate.of(2015, Month.JANUARY, 01)
 * .format(DateTimeFormatter.ISO_DATE_TIME));*/

//Exception at run time.

/**Observe that you are creating a LocalDate and not a LocalDateTime.
 * LocalDate doesn't have time component and therefore, you cannot format it with a formatter that expects time component such as DateTimeFormatter.ISO_DATE_TIME.
 * Thus, it will print java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay exception message.
 * If you use DateTimeFormatter.ISO_DATE, it will print 2015-01-01 .
 * Also, remember that a LocalDateTime object can be formatted using a DateTimeFormatter.ISO_DATE though.*/

