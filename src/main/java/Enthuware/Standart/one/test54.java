package Enthuware.Standart.one;

public class test54 {
}
//Select the correct order of restrictiveness for access modifiers...
//        (First one should be least restrictive)

//public < protected < package (i.e. no modifier) < private


/**Members with default accessibility are only accessible within the class itself and from classes in the same package.
 Protected members are in addition accessible from subclasses. Members with private accessibility are only accessible
 within the class itself.*/

/**
 * Давайте рассмотрим корректный порядок ограничений модификаторов доступа в Java — от наименее строгого к самому строгому:
 *
 * public:
 *
 * Наименее строгий.
 * Доступ возможен из любого места, без каких-либо ограничений.
 * protected:
 *
 * Доступен внутри того же пакета (как package-private) и для всех подклассов, даже если они находятся в других пакетах.
 * package-private (без модификатора):
 *
 * Доступен только внутри того же пакета. Отсутствие ключевого слова означает данный уровень доступа.
 * private:
 *
 * Самый строгий модификатор.
 * Доступен только внутри самого класса.
 * Правильный ответ:
 * public < protected < package (i.e. no modifier) < private*/