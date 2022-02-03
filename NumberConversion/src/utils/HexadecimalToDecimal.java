package utils;

public class HexadecimalToDecimal {
    public String hexTodec(String text) {
        int decimal=Integer.parseInt(text,16);
        return Integer.toString(decimal);
    }
}
