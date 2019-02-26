package create_shape.abstract_factory;

import create_shape.abstract_factory.human_factory.FemaleHumanFactory;
import create_shape.abstract_factory.human_factory.HumanFactory;
import create_shape.abstract_factory.human_factory.MaleHumanFactory;

/**
 * 女娲建立起了两条生产线，分别是：
 * 男性生产线
 * 女性生产线
 * @author renyuanliang
 * @data 2019/2/25 16:49
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory fhf = new FemaleHumanFactory();
        //第二条生产线，女性生产线
        HumanFactory mhf = new MaleHumanFactory();
        //生产线建立完毕，开始生产人了:
        Human h1 = fhf.createYellowHuman();
        Human h2 = mhf.createYellowHuman();

        h1.cry();
        h1.laugh();
        h1.sex();

        h2.cry();
        h2.laugh();
        h2.sex();

    }
}
