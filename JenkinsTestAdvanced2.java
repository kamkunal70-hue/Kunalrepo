import java.util.Random;

public class JenkinsTestAdvanced2 {

    // Main method - Jenkins pipeline ke liye entry point
    public static void main(String[] args) {
        System.out.println("🚀 Starting Jenkins Advanced Test 2 🚀");

        // Array of test names
        String[] tests = {"Build Test", "Unit Test", "Integration Test", "Deployment Test"};

        // Random number generator
        Random rand = new Random();

        // Loop through tests and simulate pass/fail
        for (String test : tests) {
            boolean pass = rand.nextBoolean();
            if (pass) {
                System.out.println(test + " ✅ Passed");
            } else {
                System.out.println(test + " ❌ Failed");
            }
        }

        // Simple calculation
        int x = 50;
        int y = 30;
        System.out.println("Sum of " + x + " + " + y + " = " + (x + y));
        System.out.println("Difference of " + x + " - " + y + " = " + (x - y));

        System.out.println("💥 Jenkins Advanced Test 2 Completed Successfully! 💥");
    }
}

