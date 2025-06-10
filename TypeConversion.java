public class TypeConversion{
    public static void main(String[] args){
        float myFloat = 12;
        System.out.println("Float value: " + myFloat);
        int myInt = (int) 12.0;
        System.out.println("Integer value: " + myInt);
        byte myByte = (byte) 137;  // Casting to byte, which will truncate the value
        System.out.println("Byte value: " + myByte);

    }
}