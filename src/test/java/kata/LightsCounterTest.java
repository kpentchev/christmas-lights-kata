package kata;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LightsCounterTest {

    @Test
    public void testEmpty() {
       Light[][] lights = new Light[1][1];
       assertThat(LightsCounter.countOn(lights), is(0L));
    }
    
    @Test
    public void testCount() {
       Light[][] lights = new Light[1][1];
       lights[0][0] = Light.on();
       assertThat(LightsCounter.countOn(lights), is(1L));
    }
    
    @Test
    public void testCountOffEmpty() {
        Light[][] lights = new Light[1][1];
        assertThat(LightsCounter.countOff(lights), is(1L));
    }
    
    @Test
    public void testCountOff() {
       Light[][] lights = new Light[1][1];
       lights[0][0] = Light.off();
       assertThat(LightsCounter.countOff(lights), is(1L));
    }
    
    @Test
    public void testCountOff0() {
       Light[][] lights = new Light[1][1];
       lights[0][0] = Light.on();
       assertThat(LightsCounter.countOff(lights), is(0L));
    }
    
}
