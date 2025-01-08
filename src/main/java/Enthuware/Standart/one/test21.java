package Enthuware.Standart.one;

public class test21 {
}
//Which of the following are valid declarations in a class?

//abstract int absMethod(int param) throws Exception;

/**
 * Вопрос:
 * Какие из приведенных деклараций являются допустимыми в классе?
 *
 * Разбор:
 * abstract int absMethod(int param) throws Exception;
 *
 * Допустимо. Абстрактные методы могут быть объявлены с модификатором abstract. Они не имеют тела и могут бросать исключения. Это корректная декларация.
 * abstract native int absMethod(int param) throws Exception;
 *
 * Неверно. Метод не может быть одновременно abstract и native.
 * abstract означает, что метод должен быть реализован в подклассе.
 * native означает, что реализация метода предоставляется в коде на языке, отличном от Java (например, на C/C++). Такие методы уже реализованы и не могут быть абстрактными.
 * float native getVariance() throws Exception;
 *
 * Неверно. Метод с модификатором native не может бросать исключения (throws) в декларации. Кроме того, native методы должны иметь тело или быть объявленными с ; в классе.
 * abstract private int absMethod(int param) throws Exception;
 *
 * Неверно. Абстрактные методы не могут быть private, потому что private делает метод недоступным для подклассов, а абстрактный метод должен быть реализован в подклассе.
 * Правильный ответ:
 * abstract int absMethod(int param) throws Exception;*/