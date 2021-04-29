public class MTKMatrix {
    protected int[][] matrix;

    public MTKMatrix(int[][] a){
        matrix = a;
    }

    public void setMatricies(int[][] a){
        matrix = a;
    }

    public int[][] getMatrix(){
        return matrix;
    }

    public MTKMatrix leftMultiply(MTKMatrix bMatrix) {
        int[][] a = matrix;
        int[][] b = bMatrix.getMatrix();
        // check if compatable
        if (a[0].length != b.length) {
            return null;
        }
        //declare m, n, r, and sum
        int m = a.length; 
        int n = b[0].length;
        int r = b.length;
        int sum;
        //start multiplication loop
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = 0;
                for (int k = 0; k < r; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        //return matrix
        MTKMatrix cMatrix = new MTKMatrix(c);
        return cMatrix;
    }

    public MTKVector leftMultiply(MTKVector bMatrix) {
        int[][] a = matrix;
        int[][] b = bMatrix.getMatrix();
        // check if compatable
        if (a[0].length != b.length) {
            return null;
        }
        //declare m, n, r, and sum
        int m = a.length; 
        int n = b[0].length;
        int r = b.length;
        int sum;
        //start multiplication loop
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = 0;
                for (int k = 0; k < r; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        //return matrix
        MTKVector cVector = new MTKVector(c);
        return cVector;
    }

    @Override
    public String toString(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "" + "]");
            }
            System.out.print("\n");
        }
        return null;
    }
}
