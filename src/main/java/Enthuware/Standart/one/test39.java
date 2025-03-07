package Enthuware.Standart.one;

public class test39 {
}
//Identify the correct statements.

//LocalDate, LocalTime, and LocalDateTime implement TemporalAccessor.

/**
 * Here are some points that you should keep in mind about the new Date/Time classes introduced in Java 8 -
 * 1. They are in package java.time and they have no relation at all to the old java.util.Date and java.sql.Date.
 * 2. java.time.temporal.TemporalAccessor is the base interface that is implemented by LocalDate, LocalTime, and LocalDateTime concrete classes.
 * This interface defines read-only access to temporal objects, such as a date, time, offset or some combination of these, which are represented by the interface TemporalField.
 * 3. LocalDate, LocalTime, and LocalDateTime classes do not have any parent/child relationship among themselves.
 * As their names imply, LocalDate contains just the date information and no time information, LocalTime contains only time and no date,
 * while LocalDateTime contains date as well as time. None of them contains zone information. For that, you can use ZonedDateTime.
 * These classes are immutable and have no public constructors. You create objects of these classes using their static factory methods such as of(...) and from(TemporalAccessor ).
 * For example, LocalDate ld = LocalDate.of(2015, Month.JANUARY, 1); or LocalDate ld = LocalDate.from(anotherDate); or LocalDateTime ldt = LocalDateTime.of(2015, Month.JANUARY, 1, 21, 10);
 * //9.10 PM  Since you can't modify them once created, if you want to create new object with some changes to the original, you can use the instance method named with(...).
 * For example, LocalDate sunday = ld.with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.SUNDAY));
 * 4. Formatting of date objects into String and parsing of Strings into date objects is done by java.time.format.DateTimeFormatter class.
 * This class provides public static references to readymade DateTimeFormatter objects through the fields named ISO_DATE, ISO_LOCAL_DATE, ISO_LOCAL_DATE_TIME, etc.
 * For example -  LocalDate d1 = LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
 * The parameter type and return type of the methods of DateTimeFormatter class is the base interface TemporalAccessor instead of concrete classes such as LocalDate or LocalDateTime.
 * So you shouldn't directly cast the returned values to concrete classes like this - LocalDate d2 = (LocalDate) DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01");
 * //this will compile //but may or may not throw a ClassCastException at runtime. You should do like this - LocalDate d2 = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01"));
 * 5. Besides dates, java.time package also provides Period and Duration classes. Period is used for quantity or amount of time in terms of years, months and days,
 * while Duration is used for quantity or amount of time in terms of hour, minute, and seconds.  Durations and periods differ in their treatment of daylight savings time when added to ZonedDateTime.
 * A Duration will add an exact number of seconds, thus a duration of one day is always exactly 24 hours. By contrast, a Period will add a conceptual day, trying to maintain the local time.
 * For example, consider adding a period of one day and a duration of one day to 18:00 on the evening before a daylight savings gap.
 * The Period will add the conceptual day and result in a ZonedDateTime at 18:00 the following day. By contrast,
 * the Duration will add exactly 24 hours, resulting in a ZonedDateTime at 19:00 the following day (assuming a one hour DST gap).*/

/**Вопрос:
 Какое утверждение верно для классов LocalDate, LocalTime и LocalDateTime?

 Разбор:
 LocalDate, LocalTime, и LocalDateTime не наследуют java.util.Date.

 В Java 8 была добавлена новая API для работы с датами и временем — java.time.
 Эти классы принадлежат новому пакету java.time и не связаны с java.util.Date напрямую.
 LocalDate, LocalTime, и LocalDateTime реализуют TemporalAccessor.

 Все три класса (LocalDate, LocalTime, LocalDateTime) реализуют интерфейс TemporalAccessor, который предоставляет методы для доступа к данным о времени (например, год, месяц, день, часы).
 LocalDateTime не расширяет java.util.Date.

 Новый API создан, чтобы заменить старый класс java.util.Date, но он никак не наследует его.
 Оба LocalDate и LocalTime не зависят от LocalDateTime.

 Эти классы являются независимыми и не расширяют друг друга.
 Анализ вариантов:
 LocalDate, LocalTime, and LocalDateTime extend Date.

 Неверно. Они не связаны с классом java.util.Date.
 LocalDate, LocalTime, and LocalDateTime implement TemporalAccessor.

 Верно. Все три класса реализуют интерфейс TemporalAccessor.
 Both LocalDate and LocalTime extend LocalDateTime, which extends java.util.Date.

 Неверно. Эти классы независимы и не связаны с java.util.Date.
 LocalDate, LocalTime, and LocalDateTime implement TemporalAccessor and extend java.util.Date.

 Неверно. Они реализуют TemporalAccessor, но не расширяют java.util.Date.
 Правильный ответ:
 LocalDate, LocalTime, and LocalDateTime implement TemporalAccessor.
 * */