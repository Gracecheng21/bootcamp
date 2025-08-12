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








    }
}
