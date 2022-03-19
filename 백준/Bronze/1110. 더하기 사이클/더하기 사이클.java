import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int num2 = num;
        int sumNum = -1;
        int count = 0;
        
        while(sumNum != num){

            String a = Integer.toString(num2);
            if(a.length() == 1){
                a = "0"+a;
            }

            int num3 = Integer.parseInt(a.charAt(0)+"")+Integer.parseInt(a.charAt(1)+"");

            String b = Integer.toString(num3);
            if(b.length() == 1){
                b = "0"+b;
            }

            sumNum = Integer.parseInt((a.charAt(1)+"")+(b.charAt(1)+""));
            num2 = sumNum;
            count++;
        }
        
        System.out.println(count);
    }
}