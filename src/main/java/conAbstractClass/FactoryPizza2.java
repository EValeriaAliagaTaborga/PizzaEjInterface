package conAbstractClass;

/**
 * Created by Valeria on 23/04/2018.
 */
public class FactoryPizza2 {

    public static Pizza make(String type){

        Pizza pizza;
        switch (type){
            case "carne":
                pizza = new Carne2();
                break;
            case "hawaiana":
                pizza = new Hawaiana2();
                break;
            case "tradicional":
                pizza = new Tradicional2();
                break;
            default:
                pizza = new Tradicional2();
                break;
        }
        return pizza;
    }
}
