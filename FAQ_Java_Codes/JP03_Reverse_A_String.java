package FAQ_Java_Codes;

public class JP03_Reverse_A_String {
    public static void main(String[] args){
        String str = "ABCD";
        String rev = "";

        //Method 1 - Using String Concatenation Operator
       /* int len=str.length();

        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }*/

        //Method 2 - Using Character array
        char a[] = str.toCharArray();
        int len=a.length;

        for (int i=len-1;i>=0;i--){
            rev =rev + a[i];
        }

        //3. Using String Buffer Class

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println("Reverse String is:"+rev);
    }
}
