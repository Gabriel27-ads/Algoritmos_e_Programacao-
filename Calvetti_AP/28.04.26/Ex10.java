public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Tabela de Estresse S = x² + y²");
        System.out.printf("%-6s", "x\\y");
        for (int y = 1; y <= 5; y++)
            System.out.printf("%-6d", y);
        System.out.println();

        for (int x = 1; x <= 5; x++) {
            System.out.printf("%-6d", x);
            for (int y = 1; y <= 5; y++) {
                int s = x * x + y * y;
                System.out.printf("%-6d", s);
            }
            System.out.println();
        }
    }
}