// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrintingPatterns {
    public static void trianglePattern1(int n) {
            int count = 0;
             for(int i=1; i<=n; ++i)
             {
                 for(int j=1; j<=i; ++j){
                     count++;
                     System.out.print(count + " ");
                 }
                 System.out.println();
             }
    }
    public static void main(String[], args){
        trianglePattern1(5);
    }
}
