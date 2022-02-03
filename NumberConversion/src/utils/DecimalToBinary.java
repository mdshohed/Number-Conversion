package utils;

public class DecimalToBinary {
    public String  decTobin(String text){
        int decimal = Integer.parseInt(text);
        return Integer.toBinaryString(decimal);
    }
}
