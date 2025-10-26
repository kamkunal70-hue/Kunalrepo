import java.util.Random;

public class TestJenkinsAdvanced {

    // Main method - Jenkins pipeline ke liye entry point
    public static void main(String[] args) {
        System.out.println("🔥 Starting Jenkins Advanced Test 🔥");

        // Simple math operations
        int a = 15;
        int b = 25;
        System.out.println("Adding " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtracting " + b + " - " + a + " = " + (b - a));

        // Loop with random numbers
        Random rand = new Random();
        System.out.println("Generating 5 random numbers:");
        for (int i = 1; i <= 5; i++) {
            int num = rand.nextInt(100); // 0 to 99
            System.out.println("Random number " + i + ": " + num);
        }

        // Conditional check
        if ((a + b) > 30) {
            System.out.println("Sum is greater than 30 ✅");
        } else {
            System.out.println("Sum is less than or equal to 30 ❌");
        }

        System.out.println("💥 Jenkins Advanced Test Completed Successfully! 💥");
    }
}

