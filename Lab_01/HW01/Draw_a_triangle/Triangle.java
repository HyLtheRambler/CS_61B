public class Triangle {
    public static void main(String[] args) {
        drawTriangle(10); 
    }
    public static void drawTriangle(int N){
        int i = 0;
        String line = "";
        while (i < N){
            line = line + "*";
            System.out.println(line);
            i = i + 1;
        }
    }
}
