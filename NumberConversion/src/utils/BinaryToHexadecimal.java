package utils;

public class BinaryToHexadecimal {
    public String binTohex(String text) {
        int hexa = Integer.parseInt(text,2);
        return Integer.toHexString(hexa);
    }
}
