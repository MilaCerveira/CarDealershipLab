package components;

public class Tyres {

    private int size;
    private int amount;

    public Tyres(int size){
        this.size = size;
        this.amount = 4;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }
}
