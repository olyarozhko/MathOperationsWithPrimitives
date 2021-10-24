package hw11_io;

import java.io.*;

public class IO2 {
    /**
     * Task2. Copy file with all IO Exceptions handling
     * (P.S. Class should be launched via terminal or cmd)
     *
     * @param args - command line arguments, where
     *             args[0] - input file;
     *             args[1] - output file
     */
    public static void main(String[] args) {

        System.out.println("Input file: " + args[0]);
        System.out.println("Output file: " + args[1]);

        try (var input = new BufferedReader(new FileReader(args[0]));
             var output = new BufferedWriter(new FileWriter(args[1]))) {

            String line;
            while ((line = input.readLine()) != null) {
                output.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

