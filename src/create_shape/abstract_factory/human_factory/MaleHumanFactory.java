package create_shape.abstract_factory.human_factory;

import create_shape.abstract_factory.Human;
import create_shape.abstract_factory.HumanEnum;

/**
 * 男性创建工厂
 * @author renyuanliang
 * @data 2019/2/25 16:29
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    /**
     * 制造一个黄色男性人类
     * @return Human
     */
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    /**
     * 制造一个白色男性人类
     * @return Human
     */
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    /**
     * 制造一个黑色男性人类
     * @return Human
     */
    @Override
    public Human createBlockwHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
