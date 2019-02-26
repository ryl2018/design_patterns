package create_shape.factory_method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Creator：抽象工厂。它实现了所有操纵产品的方法，但不实现工厂方法。Creator所有的子类都必须要实现factoryMethod()方法。
 * @author renyuanliang
 * @data 2019/2/22 16:19
 */
public class HumanFactory {
    public static Map<String,Human> humans = new HashMap<>();
    /**
     * 指定生产类型
     * @param c
     *        所要创建对象所属类的字节码对象
     * @return  产品对象
     */
    public static Human creatHuman(Class c){
        Human human = null;
        try {
            //延迟始化
            if(humans.containsKey(c.getSimpleName())){
                human = humans.get(c.getSimpleName());
                System.out.println("类的简单名字："+c.getSimpleName());
            }else{
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(),human);
            }
            //human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("color Error");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("type Error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("human Not Found");
            e.printStackTrace();
        }
        return  human;
    }

    /**
     * 随机生产产品
     * @return
     */
    public static Human createHuman(){
        Human human = null;
        List<Class> allClassByInterface = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(allClassByInterface.size());
        human = creatHuman(allClassByInterface.get(rand));
        return human;
    }
}
