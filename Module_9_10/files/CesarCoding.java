package files;

/**
 * Created by User on 24.01.2016.
 */
public class CesarCoding {

    public static String codingString(String initString, int shift){

        if(shift == 0) return initString;

        if((shift > initString.length()) || (shift < -initString.length())){
            try {
                throw new WrongShiftException(initString.length());
            } catch (WrongShiftException e) {
                throw new RunTimeWrongShiftException(initString.length());
            }
        }

        char[] codedCharacters = new char[initString.length()];

        if(shift > 0){  //shifting forward
            for (int i = 0; i < shift; i++){
                codedCharacters[i] = initString.charAt(i + initString.length() - shift);
            }

            for (int i = shift; i < initString.length(); i++ ){
                //so if shift is 2 it means that previous loop would fill '0' and 'i' cells
                codedCharacters[i] = initString.charAt(i - shift);
            }
        }  else {     //shifting backwards
            for(int i = 0; i < initString.length() + shift; i++) {
                codedCharacters[i] = initString.charAt(i - shift);
            }

            for(int i = initString.length() + shift; i < initString.length(); i++){
                codedCharacters[i] = initString.charAt(i - initString.length() - shift);
            }
        }

            for(int i = 0; i < codedCharacters.length; i++){
                codedCharacters[i] += shift;
            }
            return new String(codedCharacters);
        }

    public static String deCodingString(String codedString, int shift){
        return codingString(codedString, -shift);
         }
    }



