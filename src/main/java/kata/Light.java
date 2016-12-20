package kata;

public class Light {
    
    private Light(boolean status) {
        this.status = status;
    }
    
    public static Light off() {
        return new Light(false);
    }
    
    public static Light on() {
        return new Light(true);
    }
    
    private boolean status;
        
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }       

}
