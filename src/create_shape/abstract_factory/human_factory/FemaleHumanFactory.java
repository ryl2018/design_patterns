package create_shape.abstract_factory.human_factory;

import create_shape.abstract_factory.Human;
import create_shape.abstract_factory.HumanEnum;

/**
 * 女性创建工厂
 * @author renyuanliang
 * @data 2019/2/25 16:43
 */
public class FemaleHumanFactory extends AbstractHumanFactory{
    /**
     * 制造一个黄色女性人类
     * @return Human
     */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }

    /**
     * 制造一个白色女性人类
     * @return Human
     */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    /**
     * 制造一个黑色女性人类
     * @return Human
     */
    @Override
    public Human createBlockwHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
