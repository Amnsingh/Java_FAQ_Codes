package FAQ_Java_Codes;

import java.util.Scanner;

public class JP02_Reverse_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        //1.Using Algorithm
        int rev=0;

        while (num!=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }

        //2.Using String buffer class
        StringBuffer rev1;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev1 = sb.reverse();

        //3.String Builder Class
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev2 = sb1.reverse();
        System.out.println("Reverse number is: "+rev2);
    }
}
