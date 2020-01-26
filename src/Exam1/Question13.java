package Exam1;

public class Question13 {
    public static void main(String[] arg){
        //transpose of a matrix
        int rows,cols;
        int[][] a={
                {40,20,60},
                {10,20,50}
                };
        rows=a.length;
        System.out.println("rows are "+rows);
        cols=a[0].length;
        System.out.println("columns are "+cols);
        System.out.println("Input Matrix is:");
        for (int i=0;i<rows;i++){
            System.out.println();
            for (int j=0;j<cols;j++)
                System.out.print("\t"+a[i][j]+"\t");
        }
        int[][] a_t= new int [cols][rows];
        for (int i=0;i<cols;i++){
            for (int j=0;j<rows;j++)
                a_t[i][j] = a[j][i];
        }
        System.out.println();
        System.out.println("Transpose of the Matrix is");
        for (int i=0;i<cols;i++){
            System.out.println();
            for (int j=(rows-1);j>=0;j--)
                System.out.print("\t"+a_t[i][j]+"\t");
        }
    }
}
