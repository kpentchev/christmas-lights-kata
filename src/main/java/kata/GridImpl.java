package kata;

public class GridImpl implements Grid {
    private final Light[][] lights;
        
    private GridImpl(int w, int l) {
        lights = new Light[w][l];
        
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {
                lights[i][j] = Light.off();
            }
        }
    }
    
    public static GridImpl ofDimension(int w, int l) {
        return new GridImpl(w, l);
    }



    public void turnOn(Coordinate start, Coordinate end) {
        // TODO Auto-generated method stub
        
    }

    public void turnOff(Coordinate start, Coordinate end) {
        // TODO Auto-generated method stub
        
    }

    public void toggle(Coordinate start, Coordinate end) {
        // TODO Auto-generated method stub
        
    }

    public long countOn() {
        return LightsCounter.countOn(lights);
    }

    public long countOff() {
        return LightsCounter.countOff(lights);
    }

}
