package tutorial;

/**
 * Created by viholovko on 20.01.16.
 */
public class Car
{
    private Engine engine;
    private String message;
    public Car(Engine engine){
        this.engine = engine;
    }
    public void accelerate(){
        engine.increaseRpm();

        if (engine.getRpm() > 5000 ) {
            message = "Slow Down!";
        }
    }

    public String getMessage() {
        return message;
    }
}
