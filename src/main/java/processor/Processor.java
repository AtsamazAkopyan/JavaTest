package processor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;


public class Processor {
    public static final String INSTRUCTION_FILE_PATH = "./instruction.txt";
    private Integer sum = 0;

    public Processor() {
    }

    private void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer run(String fileName) {
        //Opening file to read
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        setSum(Integer.parseInt(lines.get(lines.size() - 1).split(" ")[1]));
        lines.stream().map(line -> processInstruction(sum, line)).forEach(this::setSum);
        return sum;
    }

    /**
     * performs an arithmetic instruction on a previous/initial value
     *
     * @param previousValue the previous value that the operation will be performed on
     * @param line          the string representation of the arithmetic operation
     * @return returns the result of the operation on the previous value
     */
    public Integer processInstruction(Integer previousValue, String line) {
        //Saving applied number i.e. last instruction.
        String[] instruction = line.split(" ");
        String instructType = instruction[0];
        Integer sum = previousValue;

        //Applying instructions
        instruction = line.split(" ");
        if (instructType.equals("add")) {
            sum += Integer.parseInt(instruction[1]);
        }
        if (instructType.equals("multiply")) {
            sum *= Integer.parseInt(instruction[1]);
        }
        if (instructType.equals("divide")) {
            sum /= Integer.parseInt(instruction[1]);
        }
        if (instructType.equals("subtract")) {
            sum -= Integer.parseInt(instruction[1]);
        }

        return sum;
    }
}