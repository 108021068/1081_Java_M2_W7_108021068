import java.util.Scanner;

public class ppp {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        long n=scn.nextInt();
        while(n>0){
            System.out.print(n%10);
            n/=10;
        }
        System.out.println();
    }
}