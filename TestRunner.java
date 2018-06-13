import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {	 
	      Result result = JUnitCore.runClasses(ControlFun2TestMaster.class); //Change the name of the class to our Test Master
	      final int deduction = 4; //Set your deduction per error
	      final int totalPossible = 100; //Set your total Possible Points
	      int count = 0; // Counter for deductions
	      System.out.println("Methods Failed (If blank, none failed):");
	      
	      for (Failure failure : result.getFailures()) {
	    	 String name = failure.getTestHeader(); //Get the method name failed
	    	 name = name.substring(0, name.indexOf("(")); //Remove the call name 
	    	 System.out.println(name.substring(10,name.length())); //Remove testFailed header	 
	    	 System.out.println("      Reason - " + failure.getMessage());
	         count += deduction;
	      }
	      
	      System.out.println();
	      System.out.println("Your Point Deduction ---> -" + count);
	      System.out.println("Your Final Score -------> " + (totalPossible-count) + "/" + totalPossible + " ("+ (percent(totalPossible, count) * 100)+"%)");
	      System.out.println("Program Perfect? -------> " + result.wasSuccessful());
	   }
	//Calculate the Percent recieved out of the total possible points.
	private static double percent(int totalPossible, int count) {
		return (double)(totalPossible-count)/(double)totalPossible;
	}
}
