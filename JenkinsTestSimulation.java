import java.util.Random;

public class JenkinsTestSimulation {

    public static void main(String[] args) {
        System.out.println("🌟 Starting Jenkins Simulation Test 🌟");

        // Run multiple simulated jobs
        runTest("Build Job");
        runTest("Unit Test Job");
        runTest("Integration Test Job");
        runTest("Deployment Job");

        // Final summary
        System.out.println("✅ All Jenkins Simulation Tests Completed Successfully!");
    }

    // Method to simulate a test job
    public static void runTest(String testName) {
        Random rand = new Random();
        boolean result = rand.nextBoolean(); // Random pass/fail

        if (result) {
            System.out.println(testName + " ✅ Passed");
        } else {
            System.out.println(testName + " ❌ Failed");
        }

        // Optional: some calculation to simulate process
        int value1 = rand.nextInt(50);
        int value2 = rand.nextInt(50);
        System.out.println("Processing values: " + value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.println("----------------------------------------");
    }
}

