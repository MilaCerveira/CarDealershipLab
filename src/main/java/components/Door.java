package components;

public class Door {

    private boolean isLocked;
    private boolean isClosed;

    public Door(){
        this.isLocked = false;
        this.isClosed = true;
    }

    public void unlock(){
        this.isLocked = false;
    }

    public void lock(){
        this.isLocked = true;
    }

    public void openDoor(){
        this.isClosed = false;
    }

    public void closeDoor(){
        this.isClosed = true;
    }
}
