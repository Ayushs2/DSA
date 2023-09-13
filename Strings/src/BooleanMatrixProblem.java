public class BooleanMatrixProblem {
    public static void main(String[] args) {
        int n =5;
        int m =4;
        int[][] arr = {{1, 0, 0, 0},{0, 0, 0, 0},{0 ,1, 0, 0},{0, 0, 0, 0},{0, 0, 0, 1}};
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                booleansum(arr,n,m);


            }

        }
    }
    static int[][] booleansum(int[][] arr, int n ,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==1)
                    arr[i][j] = 1;
            }
        }
        return arr;
    }
}
