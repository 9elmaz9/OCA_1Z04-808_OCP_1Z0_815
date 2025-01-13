package Enthuware.Standart.one;

public class test41 {
}
//Which of the following are true regarding the new Date-Time API of Java 8?

//It uses the calendar system defined in ISO-8601 as the default calendar.
//Most of the actual date related classes in the Date-Time API such as LocalDate, LocalTime, and LocalDateTime are immutable.

/**
 * Вопрос:
 * Какие из следующих утверждений верны относительно нового API даты и времени (Date-Time API) в Java 8?
 *
 * Разбор:
 * 1. ISO-8601 как стандартный календарь:
 * Новый API даты и времени в Java 8 (пакет java.time) использует календарную систему ISO-8601 по умолчанию.
 * Это международный стандарт представления дат и времени.
 * 2. Immutable классы:
 * Классы LocalDate, LocalTime и LocalDateTime являются immutable (неизменяемыми).
 * Это означает, что их значения нельзя изменить после создания.
 * 3. Информация о часовых поясах:
 * LocalDate не хранит информацию о времени и часовом поясе.
 * LocalDateTime также не включает информацию о часовом поясе.
 * Для работы с часовыми поясами используется класс ZonedDateTime.
 * 4. Конструкторы:
 * В новом API не используется конструктор для создания объектов.
 * Вместо этого используются статические фабричные методы, например:
 * java
 * Copy code
 * LocalDate date = LocalDate.of(2024, 11, 18);
 * LocalTime time = LocalTime.of(14, 30);
 * Анализ вариантов:
 * It uses the calendar system defined in ISO-8601 as the default calendar.
 *
 * Верно. API использует ISO-8601 как стандартный календарь.
 * Most of the actual date related classes in the Date-Time API such as LocalDate, LocalTime, and LocalDateTime are immutable.
 *
 * Верно. Эти классы неизменяемы.
 * LocalDateTime includes time zone information but LocalDate does not.
 *
 * Неверно. LocalDateTime не включает информацию о часовом поясе.
 * To create a LocalDate or a LocalDateTime object, you can use one of their several constructors.
 *
 * Неверно. Используются фабричные методы, а не конструкторы.
 * Правильные ответы:
 * It uses the calendar system defined in ISO-8601 as the default calendar.
 * Most of the actual date related classes in the Date-Time API such as LocalDate, LocalTime, and LocalDateTime are immutable.*/