package FAQ_Java_Codes;

public class JP01_Swap_2_Numbers {
    public static void main(String args[]){
        //Logic1- Third Variable
        int a=5, b=10;
        System.out.println("Before Swapping "+" a: "+a +" AND"+" b: "+b);
        int t=a;
        a=b;
        b=t;

        System.out.println("After Swapping "+" a: "+a +" AND"+"b: "+b);
    }
}
