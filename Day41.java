public class Day41
{
    public int[][] flipAndInvertImage(int[][] image) {
     int n = image.length;
        for(int[] row: image) {
            for(int i=0; i< (n+1)/2; i++) {
                int temp = row[i];
                row[i] = row[n-1-i]^1;
                row[n-1-i] = temp^1;
            }
        }
        return image;   
    }
}