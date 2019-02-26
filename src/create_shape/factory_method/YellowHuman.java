package create_shape.factory_method;

/**
 * ConcreteProduct：具体产品。
 * @author renyuanliang
 * @data 2019/2/22 16:14
 */
public class YellowHuman implements Human{
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
