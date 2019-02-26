package create_shape.abstract_factory.black_human;

/**
 * Product：具体产品。
 * @author renyuanliang
 * @data 2019/2/25 15:53
 */
public class BlackFemaleHuman extends AbstractBlackHuman{

    @Override
    public void sex() {
        System.out.println("黑人女性");
    }
}
