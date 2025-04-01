package Chapter_03_Array;

public class programmers_12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowLength = arr1.length;
        int colLength = arr2[0].length;
        int times = arr1[0].length;
        
        int[][] answer = new int[rowLength][colLength];
        
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < colLength; j++){
                for(int k = 0; k < times; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
            
        
        return answer;
    }
}
