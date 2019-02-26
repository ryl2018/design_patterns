package create_shape.abstract_factory.human_factory;

import create_shape.abstract_factory.Human;

/**
 * 这次定一个接口，应该要造不同性别的人，需要不同的生产线
 * 那这个八卦炉必须可以制造男人和女人
 * @author renyuanliang
 * @data 2019/2/25 16:09
 */
public interface HumanFactory {
    /**
     * 制造一个黄色人类
     * @return  Human
     */
    Human createYellowHuman();
    /**
     * 制造一个白色人类
     * @return  Human
     */
    Human createWhiteHuman();
    /**
     * 制造一个黑色人类
     * @return  Human
     */
    Human createBlockwHuman();
}
