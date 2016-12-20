package kata;

public interface Grid {
    
    void toggle(Coordinate start, Coordinate end);
    
    void turnOn(Coordinate start, Coordinate end);
    
    void turnOff(Coordinate start, Coordinate end);
        
    long countOn();
    
    long countOff();
    
}
