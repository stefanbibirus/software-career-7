import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int p=1;
        for(int j=1; j<=n; ++j){
            p = 1;
            System.out.print("1 ");
            for (int i = 1; i <= j; i++) {

                p = p * (j - i +1) / i;
                System.out.print(p + " ");

            }
            System.out.println();
        }
    }
}
