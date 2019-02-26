package create_shape.factory_method;

/**
 * ConcreteProduct：具体产品。
 * @author renyuanliang
 * @data 2019/2/22 16:16
 */
public class WhiteHuman implements Human {
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
