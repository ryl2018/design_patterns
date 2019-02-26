package create_shape.abstract_factory.white_human;

import create_shape.abstract_factory.Human;

/**
 * AbstractProduct：抽象产品。这是一个产品家族，每一个具体工厂都能够生产一整组产品。
 * @author renyuanliang
 * @data 2019/2/25 15:09
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("White_laugh");
    }

    @Override
    public void cry() {
        System.out.println("White_cry");
    }

    @Override
    public void talk() {
        System.out.println("White_talk");
    }
}
