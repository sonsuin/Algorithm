import java.util.Scanner;

public class q2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        //첫번째 for문의 인덱스(i) -> 줄 의미
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
             }
        System.out.println();
       }
    }
}
