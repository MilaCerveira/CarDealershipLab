package components;

public enum ConditionLevel {
    BRANDNEW(0),
    USED(0),
    COSMETICALLYDAMAGED(500),
    EXTREMELYDAMAGED(2000);

    private final int damageCost;

    ConditionLevel(int damageCost){
        this.damageCost = damageCost;
    }

    public int getDamageCost(){
        return this.damageCost;
    }
}
