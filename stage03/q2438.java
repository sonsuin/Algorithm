 import java.util.Scanner;

 public class q2438 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         sc.close();
         //첫번째 for문의 인덱스(i) -> 줄 의미
         for(int i=1; i<=N; i++){
             //두번째 for문에서 앞의 인덱스 이용하여 i만큼 별 출력
             for(int j=0; j<i; j++){
                System.out.print("*");
             }   
         System.out.println();
        }
     }
 }

