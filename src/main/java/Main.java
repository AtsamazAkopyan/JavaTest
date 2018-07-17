import processor.Processor;

/***
 A java program that reads arithmetic instructions from file "instruction.txt" and calculates a result that the program
 then prints. There are four possible arithmetic instructions, "add", "multiply", "divide" and "subtract". Instructions
 that do not match are ignored. At the end of all instructions "apply x" is written. 'x' is a number on which all the
 instructions are applied, ignoring mathematical precedence.
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        String fileName = "instruction.txt";
        Integer result = processor.run(fileName);
        System.out.print(result);
    }

}
