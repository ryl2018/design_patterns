package create_shape.abstract_factory.yellow_human;

/**
 * Product：具体产品。
 * @author renyuanliang
 * @data 2019/2/25 15:43
 */
public class YellowMaleHuman extends AbstractYellowHuman{
    @Override
    public void sex() {
        System.out.println("黄种人男性");
    }
}
