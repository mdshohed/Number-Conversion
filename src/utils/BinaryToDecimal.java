package utils;

public class BinaryToDecimal {
    public String  binTodec(String binaryString){
        int decimal = Integer.parseInt(binaryString,2);
        return Integer.toString(decimal);
    }
}
