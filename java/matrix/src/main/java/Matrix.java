
class Matrix {

    Matrix(String matrixAsString) {
        int[][] matrix;
        String[] split = matrixAsString.split("\n");

        for (String a : split) {
            String[] rowSplit = a.split("[,. ]");
            for (String b : rowSplit){

            }
        };


        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getRow(int rowNumber) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int[] getColumn(int columnNumber) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
