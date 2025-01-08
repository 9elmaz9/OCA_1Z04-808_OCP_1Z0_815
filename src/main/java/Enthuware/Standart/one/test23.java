package Enthuware.Standart.one;

public class test23 {
}
//A try statement must always have a ............. associated with it.
//catch, finally or both

/**
 * A try without resources must have either a catch or a finally.
 *
 * It may have both as well. Thus, the following constructs are valid:
 * 1. try{ } catch(Exception e){}// no finally
 * 2. try{ } finally{}// no catch
 * 3. try{ } catch(Exception e){} finally{}
 * 4. A catch can catch multiple exceptions: try{ } catch(Exception1|Exception2|Exception3 e){}
 * Note: try with resources (which is not on this exam) may omit catch as well as finally blocks.*/

/**
 * Вопрос:
 * A try statement must always have a ............ associated with it.
 *
 * Разбор:
 * catch:
 *
 * Блок catch используется для обработки исключений, выброшенных в блоке try.
 * Однако блок try может работать без блока catch, если имеется блок finally.
 * throws:
 *
 * throws используется в сигнатуре метода для указания, что метод может выбросить исключение.
 * Это не связано с конструкцией try.
 * finally:
 *
 * Блок finally используется для выполнения кода независимо от того, было ли исключение или нет.
 * Блок try может существовать без блока catch, если есть блок finally.
 * catch, finally or both:
 *
 * Конструкция try всегда должна сопровождаться хотя бы одним блоком: catch, finally, или обоими.
 * Пример:
 * java
 * Copy code
 * try {
 *     // Код, который может выбросить исключение
 * } catch (Exception e) {
 *     // Обработка исключения
 * } finally {
 *     // Код, который выполнится в любом случае
 * }
 * throw:
 *
 * throw используется для выброса исключения, но это не является обязательной частью конструкции try.
 * Правильный ответ:
 * catch, finally or both*/