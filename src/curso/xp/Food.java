package curso.xp;

public class Food {
    public void printFood(int x, int y) {
        for (int i = 1; i < x; i++) {
            for (int j = i; j < y - 2; j++) {
                System.out.print("o");
            }
        }
    }

    public static void main(String[] args) {
        new Food().printFood(18,18);
    }
}
