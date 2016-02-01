package files;

import junit.framework.Assert;
import org.junit.Test;


import java.io.*;
import static org.junit.Assert.*;

/**
 * Created by User on 01.02.2016.
 */
public class FileCodingTest {



    @org.junit.Test
    public void testReadingDecodedString() throws Exception {
        final int shift = 1;
        final String path = "testReading.txt";
        final String stringExpected = "ab12";
        String stringReadFromFile = FileCoding.readingDecodedString(path, shift);

        Assert.assertEquals(stringExpected, stringReadFromFile);



    }

    @org.junit.Test
    public void testWritingCodedString() throws Exception {
        final String path = "testWriting.txt";
        final String testInput = "ab12";
        final String testOutput = "3bc2";
        final File file = new File(path);
        final int shift = 1;
        String result = "";

        FileCoding.writingCodedString(testInput, path, shift);

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
           result =  br.readLine();
        }catch (FileNotFoundException ex){
            System.out.println("Can't find file " + file.toString());
        }catch (IOException ex){
            System.out.println("Unable to read file " + file.toString());
        }

        Assert.assertEquals(testOutput, result);
    }
}