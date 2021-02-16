package components;

public enum ConditionLevel {
    BRANDNEW(100),
    USED(50),
    COSMETICALLYDAMAGED(75),
    EXTREMELYDAMAGED(25);

    private final int pricePercentage;

    ConditionLevel(int pricePercentage){
        this.pricePercentage = pricePercentage;
    }

    public int getPercentage(){
        return this.pricePercentage;
    }
}
