package Matrix;
import java.util.Scanner;
public class No4 {
    public static void main (String[] args){
        int i, j, m, n;
        int matriks[][]= new int[2][3];
        int transpose[][] = new int[3][2];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris Matriks : ");
        m = scan.nextInt();
        System.out.print("Masukan jumlah kolom Matriks");
        n = scan.nextInt();
        System.out.print("Masukan Elemen Matriks : ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matriks : ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks : ");
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
