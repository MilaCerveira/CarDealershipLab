package components;

public class Seat {
     private String fabric;
     private int amount;

     public Seat(String fabric, int amount){
         this.amount = amount;
         this.fabric = fabric;
     }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public int getAmount() {
        return this.amount;
    }
}
