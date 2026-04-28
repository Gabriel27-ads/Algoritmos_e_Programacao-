public class Ex06 {
    public static void main(String[] args) {
        for (int min = 0; min <= 2; min++) {
            for (int seg = 0; seg <= 59; seg++) {
                System.out.printf("%02d:%02d%n", min, seg);
            }
        }
    }
}