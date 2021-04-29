public class MTKVector extends MTKMatrix {
    public MTKVector(int[][] a){
        super(a);
    }

    public void setMatricies(int[][] a){
        matrix = a;
    }

    public int[][] getMatrix(){
        return matrix;
    }

    @Override
    public MTKMatrix leftMultiply(MTKMatrix aMatrix) {
        System.out.println("Invalid syntax; cannot left multiply Vector by anything.");
        return null;
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
