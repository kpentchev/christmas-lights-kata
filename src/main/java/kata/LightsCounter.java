package kata;

public class LightsCounter {
    
    public static long countOn(Light[][] lights) {
        long counter = 0;
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {
                Light item = lights[i][j];
                if (item != null && item.getStatus()) {
                    counter += 1;
                } 
            } 
        }
        return counter;                
    }
    
    public static long countOff(Light[][] lights) {
        long counter = 0;
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {
                Light item = lights[i][j];
                if (item == null || !item.getStatus()) {
                    counter += 1;
                } 
            } 
        }
        return counter;                
    }
    
    
}
