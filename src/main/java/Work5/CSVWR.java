package Work5;

import java.io.*;


public class CSVWR {
    public static void main(String args[]) throws IOException {
        csvToFile();
        csvFromFile();
    }

    //Метод записи в файл CSV
    public static void csvToFile() {
        String outputFileName = "output.csv";
        String[] Header ={"id","Name","Age"};
        String[] Data1 = {"1","Ivan","34"};
        String[] Data2 = {"2","Petr","44"};

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : Header) {
                writter.write(value+";");
            }
            writter.newLine();
            for (String value : Data1) {
                writter.write(value+";");
            }
            writter.newLine();
            for (String value : Data2) {
                writter.write(value+";");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод чтения из файла CSV
    public static void csvFromFile() throws IOException {
        String outputFileName = "output.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFileName))) {
            String result =null;
            System.out.println(reader.readLine());
            while ((result = reader.readLine()) != null) {
                String[] myData = result.split(";");
                for (String temp:myData){
                System.out.println(temp+";");}
            }
            reader.close();
        } catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }

    }

