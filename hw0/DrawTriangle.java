public class DrawTriangle {
    public static void main(String args[]) {
        drawTriangle(10);
    }

    public static void drawTriangle(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}