public class datatype {
    public static void main(String[] args) {
// two possible value -->  true or false , default value --> false
        boolean flag = true;
        System.out.println(flag);
//holds value from--> -128 to 127, default value --> 0
        byte range = 123;
        System.out.println(range);
//it holds value from --> -32768 to 32767, default value --> 0
        short temperature = -200;
        System.out.println(temperature);
//it holds value from --> -2^31 to 2^31-1, default value --> 0
        int temp = 68;
        System.out.println(temp);
//it holds value from --> -2^63 to 2^63-1, default value --> 0
        long temp1 = 23546789l;
        System.out.println(temp1);
//it holds value from --> it takes 64 bits floating point value, default value --> 0.0
        double temp2 = -43.8;
        System.out.println(temp2); 
//it holds value from --> it takes 32 bits floating point value, default value --> 0.0
        float temp3 = -43.8f;
        System.out.println(temp3);
//its a 16 bit unicode character , the min value of character tyo\pe is '\U000' and max is '\uffff'
         char letter = '\u0051';
         System.out.println(letter);
    }
}
     //comment
// single line comment 
/*
 * double line comment
 */