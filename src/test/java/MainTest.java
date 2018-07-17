import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class MainTest {

    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void main() {
        Integer actual = main.run();
        assertThat(actual).isEqualTo(1);

    }

    @Test
    public void runresult5() {

    }

    @Test
    public void plusone() {
        Integer expected = 2;
        Integer input = 1;
        Integer actual = main.plusone(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void plusoneNegativeInput() {
        Integer expected = 0;
        Integer input = -1;
        Integer actual = main.plusone(input);
        assertThat(actual).isEqualTo(expected);
    }
}