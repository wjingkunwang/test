package factorymethod.Demo1;

/**
 * Created by wjk on 16/3/16.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    Human createHuman(Class<? extends Human> c) {
        Human human = null;
        try {
            Class clazz = Class.forName(c.getName());
            human = (Human) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
