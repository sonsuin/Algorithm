import java.util.Scanner;

public class q2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
//모든시간 분으로 바꿀것
        int sum = A*60 +B+C;
        A = sum/60;
        B = sum%60;
            if(A>=24){
                A= A-24;
            }
            System.out.println(A + " " + B);

    }
}
