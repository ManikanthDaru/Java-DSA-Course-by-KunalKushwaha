import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(1<<(n-1));
    }
}
