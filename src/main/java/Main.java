/*
A java program that reads arithmetic instructions from file "instruction.txt" and calculates a result that the program
then prints. There are four possible arithmetic instructions, "add", "multiply", "divide" and "subtract". Instructions
that do not match are ignored. At the end of all instructions "apply x" is written. 'x' is a number on which all the
instructions are applied, ignoring mathematical precedence.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public Integer run() {
        //Opening file to read
        List<String> listOfStrings = new ArrayList<String>();
        File file = new File(getClass().getResource("instruction.txt").getFile());
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Saving read data from file
        while (sc.hasNextLine()) {
            listOfStrings.add(sc.nextLine());
        }

        //Looking for initial value which is stored at the end of file
        String tempStr;
        tempStr = listOfStrings.get(listOfStrings.size() - 1);

        //Saving applied number i.e. last instruction.
        String[] instruction = tempStr.split(" ");
        int sum = Integer.parseInt(instruction[1]);

        //Applying instructions
        for (int i = 0; i < listOfStrings.size() - 1; i++) {
            tempStr = listOfStrings.get(i);
            instruction = tempStr.split(" ");
            if (instruction[0].equals("add")) {
                sum += Integer.parseInt(instruction[1]);
            }
            if (instruction[0].equals("multiply")) {
                sum *= Integer.parseInt(instruction[1]);
            }
            if (instruction[0].equals("divide")) {
                sum /= Integer.parseInt(instruction[1]);
            }
            if (instruction[0].equals("subtract")) {
                sum -= Integer.parseInt(instruction[1]);
            }
        }
        System.out.println("Result of the arithmetic instructions: " + sum);
        return sum;
    }

    public Integer runwithresult5() {
        //Opening file to read
        List<String> listOfStrings = new ArrayList<String>();
        File file = new File(getClass().getResource("instruction.txt").getFile());
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Saving read data from file
        while (sc.hasNextLine()) {
            listOfStrings.add(sc.nextLine());
        }

        //Looking for initial value which is stored at the end of file
        String tempStr;
        tempStr = listOfStrings.get(listOfStrings.size() - 1);

        //Saving applied number i.e. last instruction.
        String[] instruction = tempStr.split(" ");
        int sum = Integer.parseInt(instruction[1]);

        //Applying instructions
        for (int i = 0; i < listOfStrings.size() - 1; i++) {
            tempStr = listOfStrings.get(i);
            instruction = tempStr.split(" ");
            if (instruction[0].equals("add")) {
                sum += Integer.parseInt(instruction[1]);
            }
            if (instruction[0].equals("multiply")) {
                sum *= Integer.parseInt(instruction[1]);
            }
            if (instruction[0].equals("divide")) {
                sum /= Integer.parseInt(instruction[1]);
            }
            if (instruction[0].equals("subtract")) {
                sum -= Integer.parseInt(instruction[1]);
            }
        }
        System.out.println("Result of the arithmetic instructions: " + sum);
        return sum + 4;
    }

    public Integer plusone(Integer input) {
        return ++input;
    }
}
