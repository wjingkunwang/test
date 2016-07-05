package factorymethod.Demo1;

/**
 * Created by wjk on 16/3/16.
 */
public abstract class AbstractHumanFactory {
    abstract Human createHuman(Class<? extends Human> c);
}
