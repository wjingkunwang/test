package innerClass;

/**
 * 生成一个内部类对象的时候,此对象与制造它的外部类对象有一种联系,所以它能访问其外围对象的所有成员,
 * 而不需要任何特殊条件,此外,内部类还拥有外围类所有变量的访问权.
 */

//迭代器
public interface Selector {
    boolean end();

    Object current();

    void next();
}

