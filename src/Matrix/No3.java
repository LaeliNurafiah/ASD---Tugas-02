package Matrix;
public class No3 {
    public static void main(String args[]){
        int [][] A = {
            {2, 4, 6},
            {3, 5, 7}
            
        };
        int [][] B = {
            {2, 6},
            {9, 5},
            {4, 1}
        };
        
        if(A[0].length == B.length){
            int [][] C = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < B[0].length; j++){
                    for (int k = 0; k < A[0].length; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        for (int [] c : C){
            for (int r : c){
                System.out.print(r + " ");
            }
            System.out.println();
        }
        }
        else{
            System.out.println("Ukuran Koloam A tidak sama dengan BAris B");
        }
        
        
        }
}
