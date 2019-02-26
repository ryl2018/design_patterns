package create_shape.abstract_factory.yellow_human;

import create_shape.abstract_factory.Human;

/**
 * AbstractProduct：抽象产品。这是一个产品家族，每一个具体工厂都能够生产一整组产品。
 * @author renyuanliang
 * @data 2019/2/25 15:03
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("Yellow_laugh");
    }

    @Override
    public void cry() {
        System.out.println("Yellow_cry");
    }

    @Override
    public void talk() {
        System.out.println("Yellow_talk");
    }
}
