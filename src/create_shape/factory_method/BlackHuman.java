package create_shape.factory_method;

/**
 * ConcreteProduct：具体产品。
 * @author renyuanliang
 * @data 2019/2/22 16:17
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("Black_laugh");
    }

    @Override
    public void cry() {
        System.out.println("Black_cry");
    }

    @Override
    public void talk() {
        System.out.println("Black_talk");
    }
}
