package components;

public class Engine {

    private String model;
    private int horsePower;
    private Transition transition;

    public Engine(String model, int horsePower, Transition transition){
        this.model = model;
        this.horsePower=horsePower;
        this.transition = transition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }
}
