package create_shape.abstract_factory;

/**
 * 世界上有哪些类型的人，列出来
 * JDK 1.5开始引入enum类型也是目的的，吸引C程序员转过来
 * @author renyuanliang
 * @data 2019/2/25 16:01
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloFemaleHuman("create_shape.abstract_factory.yellow_human.YellowFemaleHuman"),

    YelloMaleHuman("create_shape.abstract_factory.yellow_human.YellowMaleHuman"),

    WhiteFemaleHuman("create_shape.abstract_factory.white_human.WhiteFemaleHuman"),

    WhiteMaleHuman("create_shape.abstract_factory.white_human.WhiteMaleHuman"),

    BlackFemaleHuman("create_shape.abstract_factory.black_human.BlackFemaleHuman"),

    BlackMaleHuman("create_shape.abstract_factory.black_human.BlackMaleHuman");

    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
