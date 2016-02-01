package files;

import java.io.*;

/**
 * Created by User on 25.01.2016.
 */
public class FileCoding {
    public static void main(String[] args) {

    }

    public static String readingDecodedString(String path, int shift){
        File file = new File(path);

        String decodedString = "";

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            decodedString = CesarCoding.deCodingString(br.readLine(), shift) ;
        }catch (FileNotFoundException ex){
            System.out.println("Can't find file " + file.toString());
        }catch (IOException ex){
            System.out.println("Unable to read file " + file.toString());
        }

        return decodedString;
    }

    public static void writingCodedString(String codedString, String path, int shift){
        File file = new File(path);

        try (BufferedWriter bw = new  BufferedWriter(new FileWriter(file))){
          bw.write(CesarCoding.codingString(codedString, shift));
        }catch (FileNotFoundException ex){
            System.out.println("Can't find file " + file.toString());
        }catch (IOException ex){
            System.out.println("Unable to read file " + file.toString());
        }

    }
}
