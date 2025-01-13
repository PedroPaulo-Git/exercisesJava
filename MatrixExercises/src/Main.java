import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n ;i++){
            for(int j= 0 ; j < n ;j++){
                matrix[i][j]=sc.nextInt();
//                System.out.println("i column:"+i);
//                System.out.println("j row:"+j);
//                System.out.println();
            }
        }
        System.out.println();
        for(int i = 0; i < n ;i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(matrix[i][j] + " ");
                if (j == n - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("Diagonal");
        System.out.println();
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n ;j++){
//                System.out.println("i column:"+i);
//                System.out.println("j row:"+j);
                System.out.println(matrix[i][j] + " ");
                i++;
            }
        }
        System.out.println("------------------");



        System.out.println("Diagonal inverted");
        System.out.println();

        for(int i = 0; i < n ;i++){
            for(int j = n - 1; j < n ; j--){
//                System.out.println("i column:"+i);
//                System.out.println("j row:"+j);
                System.out.println(matrix[i][j] + " ");
                i++;
            }
        }
        System.out.println("------------------");
        sc.close();
    }
}