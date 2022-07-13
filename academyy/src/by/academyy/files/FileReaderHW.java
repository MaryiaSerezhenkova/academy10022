package by.academyy.files;
//Напишите Java-программу для построчного хранения содержимого текстового файла в массиве
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
 
 
public class FileReaderHW {
    
    
        public static void main(String[] args) throws IOException, FileNotFoundException {
            File file = new File("src/studyJava");
            saveInArray(file);
        }
 
        public static void saveInArray(File file) throws IOException, FileNotFoundException {
            try {
                BufferedReader fr = new BufferedReader(new FileReader(file));
                String str = "";
                ArrayList<String> st = new ArrayList<>();
                while (str!=null) {
                str = fr.readLine();
                st.add(str);
                }
                System.out.println(Arrays.toString(st.toArray()));
                fr.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
            } catch (IOException e) {
                System.out.print(e.getMessage());
            }
        }
    }