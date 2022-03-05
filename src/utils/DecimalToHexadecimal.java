package utils;

public class DecimalToHexadecimal {
    public String decTohex(String text) {
        int dec = Integer.parseInt(text);
        return Integer.toHexString(dec);
    }
}
