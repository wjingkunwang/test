package adapter;

/**
 * 适配器模式(比如生活中的电源转换器)
 * 日志框架的设计
 *
 *
 * 重构代码:
 * 需要复用以前的类
 *
 * 类适配器:实现目标接口+继承以前的类
 * 类图地址: http://7xpxnz.com1.z0.glb.clouddn.com/%E7%B1%BB%E7%9A%84%E9%80%82%E9%85%8D%E5%99%A8.png
 *
 * 对象的适配器:实现目标接口+成员变量(以前的类)
 * 类图地址:http://7xpxnz.com1.z0.glb.clouddn.com/%E5%AF%B9%E8%B1%A1%E7%9A%84%E9%80%82%E9%85%8D%E5%99%A8.png
 */
public class Test {
    public static void main(String[] args) {
        BeautifulGirl beautifulGirl = new ApplyCosmetics(new UglyGirl());
        beautifulGirl.smile();
    }
}
