import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		/*
		 * Change the name of the class to our Test file containing out JUnit Tests
		 */
		Result result = JUnitCore.runClasses(ControlFun2TestMaster.class);

		/*
		 * Set variables for deduction per failed test and total Possible Points.
		 */
		final int deduction = 4;
		final int totalPossible = 100;

		int count = 0; // Counter for deductions
		System.out.println("Methods Failed (If blank, none failed):");
		for (Failure failure : result.getFailures()) {
			String name = failure.getTestHeader(); // Get the method name failed
			name = name.substring(0, name.indexOf("(")); // Remove the call name
			System.out.println(name.substring(10, name.length())); // Remove testFailed header
			System.out.println("      Reason - " + failure.getMessage());
			count += deduction;
		}

		System.out.println();
		System.out.println("Your Point Deduction ---> -" + count);
		System.out.println("Your Final Score -------> " + (totalPossible - count) + "/" + totalPossible + " ("
				+ (percent(totalPossible, count) * 100) + "%)");
		System.out.println("Program Perfect? -------> " + result.wasSuccessful());
	}

	// Calculate the Percent that was received and return as a double.
	private static double percent(int totalPossible, int count) {
		return (double) (totalPossible - count) / (double) totalPossible;
	}
}
