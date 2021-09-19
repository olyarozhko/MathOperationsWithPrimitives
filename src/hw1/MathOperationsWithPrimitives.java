package hw1;

public class MathOperationsWithPrimitives {
    public static void main(String[] args) {
        byte byteVar1 = 8;
        byte byteVar2 = 2;
        short shortVar1 = 8;
        short shortVar2 = 2;
        long longVar1 = 8L;
        long longVar2 = 2L;
        double doubleVar1 = 8;
        double doubleVar2 = 2;
        float floatVar1 = 8f;
        float floatVar2 = 2f;

        System.out.println("---------------- Sum --------------");
        System.out.println(String.format("BYTE Type Primitives: %d", byteVar1 + byteVar2));
        System.out.println(String.format("SHORT Type Primitives: %d", shortVar1 + shortVar2));
        System.out.println(String.format("LONG Type Primitives: %d", longVar1 + longVar2));
        System.out.println(String.format("DOUBLE Type Primitives: %f", doubleVar1 + doubleVar2));
        System.out.println(String.format("FLOAT Type Primitives: %.2f", floatVar1 + floatVar2));

        System.out.println(" ");
        System.out.println("---------------- Subtraction --------------");
        System.out.println(String.format("BYTE Type Primitives: %d", byteVar1 - byteVar2));
        System.out.println(String.format("SHORT Type Primitives: %d", shortVar1 - shortVar2));
        System.out.println(String.format("LONG Type Primitives: %d", longVar1 - longVar2));
        System.out.println(String.format("DOUBLE Type Primitives: %f", doubleVar1 - doubleVar2));
        System.out.println(String.format("FLOAT Type Primitives: %.2f", floatVar1 - floatVar2));

        System.out.println(" ");
        System.out.println("---------------- Multiplication --------------");
        System.out.println(String.format("BYTE Type Primitives: %d", byteVar1 * byteVar2));
        System.out.println(String.format("SHORT Type Primitives: %d", shortVar1 * shortVar2));
        System.out.println(String.format("LONG Type Primitives: %d", longVar1 * longVar2));
        System.out.println(String.format("DOUBLE Type Primitives: %f", doubleVar1 * doubleVar2));
        System.out.println(String.format("FLOAT Type Primitives: %.2f", floatVar1 * floatVar2));

        System.out.println(" ");
        System.out.println("---------------- Division --------------");
        System.out.println(String.format("BYTE Type Primitives: %d", byteVar1 / byteVar2));
        System.out.println(String.format("SHORT Type Primitives: %d", shortVar1 / shortVar2));
        System.out.println(String.format("LONG Type Primitives: %d", longVar1 / longVar2));
        System.out.println(String.format("DOUBLE Type Primitives: %f", doubleVar1 / doubleVar2));
        System.out.println(String.format("FLOAT Type Primitives: %.2f", floatVar1 / floatVar2));

    }
}
