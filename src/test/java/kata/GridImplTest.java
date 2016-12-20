package kata;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GridImplTest {

    @Test
    public void test() {
        Grid grid = GridImpl.ofDimension(999, 999);
        assertThat(grid.countOn(), is(0L));
        
        grid.turnOn(new Coordinate(0, 0), new Coordinate(999, 999));
        grid.toggle(new Coordinate(0, 0), new Coordinate(999, 0));
        grid.turnOff(new Coordinate(499, 499), new Coordinate(500, 500));
        
        assertThat(grid.countOn(), is(998996));
    }

}
