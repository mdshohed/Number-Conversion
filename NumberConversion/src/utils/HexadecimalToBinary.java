package utils;

public class HexadecimalToBinary {
    public String hexTobin(String text){
        int num = Integer.parseInt(text, 16);
        return Integer.toBinaryString(num);
    }
}


