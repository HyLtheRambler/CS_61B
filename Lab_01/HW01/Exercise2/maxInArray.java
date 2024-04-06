public class maxInArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int cur_max = 0;
        int i = 0;
        while (i < m.length){
            if (m[i] > cur_max){
                cur_max = m[i];
            }
            i = i + 1;
        }
        return cur_max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
       System.out.println(max(numbers));
    }
}
