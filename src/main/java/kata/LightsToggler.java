package kata;

public class LightsToggler {
    
    public static void toggle(Light[][] lights, Coordinate start, Coordinate end) {
        for(int i = start.getX(); i < end.getX(); i++) {
            for(int j = end.getY(); j < end.getY(); j++) {
                Light light = lights[i][j];
                if(light != null) {
                    light.setStatus(!light.getStatus());
                }
            }
        }
    }

}
