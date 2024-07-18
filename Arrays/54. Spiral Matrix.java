public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowb = 0;
        int rowe = matrix.length-1;
        int colb = 0;
        int cole = matrix[0].length - 1;
        
        while (rowb <= rowe && colb <= cole) {
            for (int j = colb; j <= cole; j ++) {
                res.add(matrix[rowb][j]);
            }
            rowb++;
            
            for (int j = rowb; j <= rowe; j ++) {
                res.add(matrix[j][cole]);
            }
            cole--;
            
            if (rowb <= rowe) {
                for (int j = cole; j >= colb; j --) {
                    res.add(matrix[rowe][j]);
                }
            }
            rowe--;
            
            if (colb <= cole) {
                for (int j = rowe; j >= rowb; j --) {
                    res.add(matrix[j][colb]);
                }
            }
            colb ++;
        }
        
        return res;
    }
}