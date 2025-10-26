public class MatrixRainEffect {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== MATRIX RAIN EFFECT STARTING ===\n");
        Thread.sleep(1000);

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*";
        int width = 80;
        int height = 20;

        for (int frame = 0; frame < 100; frame++) {
            StringBuilder screen = new StringBuilder();

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (Math.random() < 0.03) {
                        screen.append(chars.charAt((int) (Math.random() * chars.length())));
                    } else if (Math.random() < 0.1) {
                        screen.append(" ");
                    } else {
                        screen.append(".");
                    }
                }
                screen.append("\n");
            }

            // Clear screen (works well in Jenkins console)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println(screen.toString());
            Thread.sleep(150); // speed control
        }

        System.out.println("\n=== MATRIX RAIN ENDED ===");
    }
}
