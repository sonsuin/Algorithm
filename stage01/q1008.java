import java.util.Scanner;

public class q1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int A = sc.nextInt(); 로 할 경우 print에서 소수점이하 버림
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();
        if(A>0 && A<10 && B>0 && B<10){
            System.out.print(A/B);
        }
    }
}
