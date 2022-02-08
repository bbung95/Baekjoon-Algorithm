import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(M - 45 < 0){
            if(H == 0){
                H = 23;
            }else{
                H = H - 1;
            }
            M =  M + 60 - 45;
        }else{
            M = M - 45;  
        }
        System.out.println(H);
        System.out.println(M);
       
    }
}
