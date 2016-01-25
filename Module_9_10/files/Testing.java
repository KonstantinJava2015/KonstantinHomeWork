package files;

import java.io.File;

/**
 * Created by User on 24.01.2016.
 */
public class Testing {
    public static final int SHIFT = -20;

    public static void main(String[] args) {
        String testString = new AudioFile().toString();

        System.out.println(testString);
        System.out.println(CesarCoding.codingString(testString, SHIFT));
        System.out.println(CesarCoding.deCodingString(CesarCoding.codingString(testString, SHIFT), SHIFT));

        System.out.println(FileCoding.readingDecodedString("test.txt", SHIFT));

        FileCoding.writingCodedString(testString, "test2.txt", SHIFT);
    }
}
