package conInterface;

/**
 * Created by Valeria on 23/04/2018.
 */
public class FactoryPizza {

    public static IPizza make(String type){

        IPizza pizza;
        switch (type){
            case "carne":
                pizza = new Carne();
                break;
            case "hawaiana":
                pizza = new Hawaiana();
                break;
            case "tradicional":
                pizza = new Tradicional();
                break;
            default:
                pizza = new Tradicional();
                break;
        }
        return pizza;
    }
}
