package create_shape.abstract_factory.white_human;

/**
 * Product：具体产品。
 * @author renyuanliang
 * @data 2019/2/25 15:57
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("白人女性");
    }
}
