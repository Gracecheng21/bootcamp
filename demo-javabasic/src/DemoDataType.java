public class DemoDataType {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Variable 變量
        // ! 1. interger 整數 - int
        int x = 3;
        //put 7 into y
        int y = 7;
        System.out.println(x);
        System.out.println("x");
        //without "" printout the meaning of ()
        //with "" printout directly what "" is
        System.out.println(y);

        //Re-assign value 10 into variable x
        x = 10;
        System.out.println(x);//x=10
        //Re-assign y=100
        y = 100;
        System.out.println(y);
        //shortcut: sysout > System.out.println()
        System.out.println("y");


        // ! Declaration for variable type 聲名變量類型
        int a;
        //same variable name can be declared once only
        //assignment
        a = 4;
        System.out.println(a);
        
        // declaration and assignment
        int w = 10;
        System.out.println(w);

        // ! double (small letter) 小數點
        double d1 = 4.4;
        double d2 = 3.14159;
        System.out.println(d2);

        double d3;
        d3 = 1.2345678;
        System.out.println(d3);

        // ! +, -, *, /
        int x2 = 6 + 1;
        System.out.println(x2); // 7
        int x3 = 9;

        // ! put x3 value into variable x2
        // = from right to left
        x2 = x3;
        System.out.println(x2); // 9
        System.out.println(x3); // 9
        x3 = x2;
        System.out.println(x2); // 9
        
        int x4 = 10;
        x2 = 7 + x4;
        System.out.println(x2); // 6+1+10 = 17

        // ! add to int itself
        x2 = x2 + 8;
        System.out.println(x2); // 6+1+10+8 = 25

        //Store integer: byte, short, int, long
        byte b1 =3;
        short s1 = 3;
        int i1 = 3;
        long l1 = 3;

        //byte (-128 to 127)
        //short (-32768 to 32767)
        //int (-21億 to 21億)
        //long (2^63)
        b1 = -128;
        //b1 +1 = 128 overflow
        s1 = 32_767;
        //s1 +1 = 32768 overflow
        i1 = 2_147_483_647;
        //int + int = int (overflow)
        i1 = i1 +1;
        System.out.println(i1);//i1 = 2147483648 overflow

        // Prepaid an long value 22億 (right hand side)
        // Assign a value into long variable (left hand side)
        // l1 = 2_200_000_000; //value overflow system error
        l1 = 2_200_000_000L;
        l1 = l1 + 3L;
        System.out.println(l1);
        l1 = l1 + 2_200_000_000L;
        System.out.println(l1);//long + long = long (check by java)

        //long + int = long + long(include int value) = long
        long l2 = 2_200_000_000L + 5;
        System.out.println(l2);

        //int include byte and short value
        //no byte bx = 1b or short sx = 1s
        //int i8 = 9; byte b9 = i8;
        //byte can't be int, overflow in java system error unsafe
        byte b10 = 3; //direct value include in byte value, true to java
        //short s10 = i8; // unsafe in java

        // ! the range of int value should solve the majority of the problem in java system.
        // long is not a default type of variable for storing integer.







    }
}
