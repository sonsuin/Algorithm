import java.util.Scanner;

public class q1000{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if(A>0 && A<10 && B>0 && B<10){
        System.out.print(A+B);
        }
    }
}
