package processor;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ProcessorTest {
    private final String INSTRUCTION_FILE_PATH = getClass().getClassLoader().getResource("instruction.txt").getPath().substring(1);
    private Processor processor;

    @Before
    public void setUp() {
        processor = new Processor();
    }

    @Test
    public void Processor() {
        Integer actual = processor.run(INSTRUCTION_FILE_PATH);
        assertThat(actual).isEqualTo(1);

    }

    @Test
    public void processInstructionAddPositive() {
        Integer previousValue = 0;
        Integer expected = 2;
        Integer actual = processor.processInstruction(previousValue, "add 2");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void processInstructionAddNegative() {
        Integer previousValue = 0;
        Integer expected = -2;
        Integer actual = processor.processInstruction(previousValue, "add -2");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void processInstructionMultiply() {
        Integer previousValue = 1;
        Integer expected = 5;
        Integer actual = processor.processInstruction(previousValue, "multiply 5");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void processInstructionMultiply0() {
        Integer previousValue = 0;
        Integer expected = 0;
        Integer actual = processor.processInstruction(previousValue, "multiply 5");
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void processInstructionDivide() {
        Integer previousValue = 10;
        Integer expected = 5;
        Integer actual = processor.processInstruction(previousValue, "divide 2");
        assertThat(actual).isEqualTo(expected);
    }
}