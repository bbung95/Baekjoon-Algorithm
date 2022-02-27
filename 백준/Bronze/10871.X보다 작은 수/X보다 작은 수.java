import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[maxNum];
        String result = "";
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < n){
                result += arr[i]+" ";
            }
        }
        System.out.println(result);
    }
}