import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("columns : ");
        int columns = sc.nextInt();
        System.out.println("rows : ");
        int rows = sc.nextInt();
        int[][] matrix = new int[columns][rows];
        System.out.println("------------------");
        for(int i=0;i < matrix.length ;i++){
            for(int j= 0 ; j < matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
//        for(int i=0;i < matrix.length ;i++){
//            for(int j= 0 ; i < matrix.length;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
        System.out.print("<- Rows ->" );
        System.out.println();
        for(int i = 0; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[i].length ;j++){
                System.out.print(matrix[i][j]+" ");
               // System.out.println(j +" | "+i);
                if (j == matrix[j].length - 1){
                    System.out.println();
                }
            }
        }
        System.out.print("find a number on matrix :" );
        int x = sc.nextInt();

        for(int i = 0; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[i].length ;j++){
                if (matrix[i][j] == x){
                    System.out.println("position :" + i + " "+j );
                    System.out.println("left :" + matrix[i][j - 1]  );
                    System.out.println("right :" + matrix[i][j + 1]  );
                    System.out.println("down :" + matrix[i + 1][j]  );

                }


                // System.out.println(j +" | "+i);

            }
        }


        sc.close();
    }
}