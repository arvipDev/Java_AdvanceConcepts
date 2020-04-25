package writerreader;

import java.io.*;
import java.util.Scanner;

public class FileWR {


    private static File file = new File("D:/Java Space/2020_JAVA/FileWR.txt");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fileWriter();
        fileReader();
        bufferedWrite();
        bufferedReader();

    }

    private static void fileWriter() {
        System.out.println("Enter data to be written using FileWriter ");
        String data = scanner.nextLine();
        FileWriter enter;

        try {
            //this can also be used
            //enter = new FileWriter("FileWR.txt");
            enter = new FileWriter(file);
            for (int i = 0; i < data.length(); i++){
                enter.write(data.charAt(i) );
            }
            enter.write("\n");
            for (int i = 0; i < data.length(); i++){
                enter.write(data.charAt(i) );
            }
            enter.close();
            System.out.println("Written");
        } catch (IOException e){
            System.out.println("Unaccounted Input");
        }
    }

    private static void fileReader() {
        System.out.println("In FileReader");
        File file = new File("D:/Java Space/2020_JAVA/FileWR.txt");
        try {
            //this can also be used
            //FileReader reader = new FileReader("FileWR.txt");
            FileReader reader = new FileReader(file);
            StringBuilder stringBuilder = new StringBuilder();
            int c = reader.read();
            while (c != -1) {
                stringBuilder.append((char)c);
                c = reader.read();
            }
            System.out.println(stringBuilder);
            reader.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void bufferedWrite() {
        try {
            System.out.println("Enter the content to be written using BufferedWriter");
            String data = scanner.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file), 5); // 5 is the buffer size.
            writer.write(data);
            writer.newLine();
            writer.write(data);
            writer.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void bufferedReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder data = new StringBuilder();
            int ch = reader.read();
            while (ch != -1) {
                data.append((char)ch);
                ch = reader.read();
            }
            System.out.println(data);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
