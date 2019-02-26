package create_shape.factory_method;

/**
 * @author renyuanliang
 * @data 2019/2/22 16:29
 */
public class NvWa {
    public static void main(String[] args){

        Human writeHuman = HumanFactory.creatHuman(WhiteHuman.class);
        writeHuman.cry();
        writeHuman.laugh();
        writeHuman.talk();

        Human yellowHuman = HumanFactory.creatHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        Human blackHuman = HumanFactory.creatHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        for (int i= 0;i<20;i++){
            Human human = HumanFactory.createHuman();
            human.talk();
            human.laugh();
        }
    }
}
