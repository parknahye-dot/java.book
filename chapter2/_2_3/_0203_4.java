package chapter2._2_3;

public class _0203_4 {
    public static void main(String[] args) {
        byte byteValue = 10;
        byte byteValue2 = 20;
        int intValue = byteValue + byteValue2;
        System.out.println("Integer value: " + intValue);

        char charValue1 = 'A';
        char charValue2 = 1;
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자=" + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        int x = 1;
        int y = 2;
        double result = (double)x / y;
        System.out.println(result);
    }
}