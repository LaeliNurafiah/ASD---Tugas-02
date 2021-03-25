package Matrix;
public class No2 {
    public static void main(String args[]){
        int [][] A = {
            {8, 12},
            {7, 6},
            {9, 3}
        };
        
        int [][] B = {
            {4, 5},
            {6, 3},
            {7, 1}
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int [A.length][A[0].length];
            for(int i = 0; i<A.length; i++){
                for(int j = 0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                    
                }
            }
            for (int[] c : C){
                for (int q : c){
                    System.out.print(q + " ");
                }
                System.out.println();
            }
        }
            else{
                    System.out.println("Ukuran Matrix tidak sama");
                    
                    }
    }
        
    }
    

