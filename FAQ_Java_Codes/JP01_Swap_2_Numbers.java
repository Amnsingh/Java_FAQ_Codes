package FAQ_Java_Codes;

public class JP01_Swap_2_Numbers {
    public static void main(String args[]){
        //Logic1- Third Variable
        int a=5, b=10;
        System.out.println("Before Swapping "+" a: "+a +" AND"+" b: "+b);
        int t=a;
        a=b;
        b=t;

        //Logic2- Use + & - without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+" a: "+a +" AND"+"b: "+b);

        //Logic3- Use * & / without using third variable
        a=a*b;
        b=a/b;
        a=a/b;

        //Logic4-bitWise XOR
        a=a^b;
        b=a^b;
        a=a^b;


        //Logic 5 - Single Statement
        b=a+b-(a=b);

        System.out.println("After Swapping "+" a: "+a +" AND "+"b: "+b);
    }
}
