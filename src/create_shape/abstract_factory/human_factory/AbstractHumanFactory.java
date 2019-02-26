package create_shape.abstract_factory.human_factory;

import create_shape.abstract_factory.Human;
import create_shape.abstract_factory.HumanEnum;

/**
 * 编写一个抽象类，根据enum创建一个人类出来
 * @author renyuanliang
 * @data 2019/2/25 16:20
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    /**
     *  给定一个性别人类，创建一个人类出来 专业术语是产生产品等级
     * @param humanEnum 给定需要生产的产品
     * @return 人类（产品）
     */
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        //如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if(!"".equals(humanEnum.getValue())){
            try {
                human =(Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
