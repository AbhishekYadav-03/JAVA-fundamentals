public class typecastingdemo {
    public static void main(String[] args) {
//case1:
//         byte by = 10;
//         short sh = 10;
//         int in = 10;
//         long lo = 10;


//         sh = by; //implicite typecasting
//         by = sh; // this is not true because bigger data type can not go in to smaller data time by data typecasting automatically.

// //case2:implicite typecasting
//         float f = 5.6f;
//         double d = 5.8;

//         f = d; //wrong but i can do it write by forcefully .
//         d = f; //right

//        //explicite typecasting  --> force fully done by programer 
//         in = f; //wrong
//         in = (int) f; //write but force fully done by programer.

        // int in;
        //  char ch = 'a';

        // in = ch;
        // System.out.println(in);
        // System.out.println(ch);
        // System.out.println((int)ch);

        char ch = 70;
        System.out.println(ch);
        System.out.println((int)200);
        ch = (char)(ch + 1);
        System.out.println(ch);

        ch = 'a' + 1;
        ch = (char)('a' + ch);
        System.out.println(ch);


        System.out.println(10 + 20 + "Hello" + 10 + 40); //30Hello1040
        System.out.println(2 + ' ' + 5); // 2+32+5=39
        System.out.println(2 + " " + 5); //"2 5"
        System.out.println("Hello" + '\t' + "world"); //Hello world
        System.out.println("Hello" + "\t" + "world"); //Hello world
        System.out.println(2 + '\t' + 3); // 2+9+3 = 14
    }
}
