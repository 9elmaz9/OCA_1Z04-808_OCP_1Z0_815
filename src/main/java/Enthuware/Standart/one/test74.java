package Enthuware.Standart.one;

public class test74 {
}
//Which of the following classes should you use to represent just a date without any time or zone information?

//java.time.LocalDate

/**Java 8 introduces a new package java.time to deal with dates. The old classes such as java.util.Date are not recommended anymore.

 Briefly:
 java.time Package: This is the base package of new Java Date Time API. All the commonly used classes such as LocalDate, LocalTime, LocalDateTime, Instant, Period, Duration are part of this package. All of these classes are immutable and thread safe.

 java.time.format Package: This package contains classes used for formatting and parsing date time objects such as java.time.format.DateTimeFormatter.

 (The following two are not important for the exam.)

 java.time.zone Package: This package contains classes for supporting different time zones and their rules.

 java.time.chrono Package: This package defines generic APIs for non ISO calendar systems. We can extend AbstractChronology class to create our own calendar system.
 java.time.temporal Package: This package contains temporal objects and we can use it for find out specific date or time related to date/time object. For example, we can use these to find out the first or last day of the month. You can identify these methods easily because they always have format “withXXX”.*/

/**
 * Для представления только даты без времени и информации о зоне следует использовать класс java.time.LocalDate.
 *
 * Обоснование:
 * java.util.Date: Этот класс включает информацию о времени и давно считается устаревшим.
 * java.sql.Date: Предназначен для использования в JDBC и тоже включает время (даже если оно обнулено).
 * java.time.Date: Такого класса не существует в API Java.
 * java.time.LocalDate: Часть нового API даты и времени (Java 8 и выше). Этот класс предназначен именно для работы с датами без времени и зоны.
 * Правильный ответ:
 * java.time.LocalDate*/