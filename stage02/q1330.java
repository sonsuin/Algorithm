import java.util.Scanner;

public class q1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if(A>B){
            System.out.print(">");
        }
        if(A<B){
            System.out.print("<");
        }
        if(A==B){
            System.out.print("==");
        }
    }
}
