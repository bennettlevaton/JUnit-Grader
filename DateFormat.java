//Simple date adjuster re formats time to be in non 24 hour format
public class DateFormat {
	public static void main(String[] args) {
        System.out.println(args[2] + " " + formatTime(args[3]));
        
    }
    private static String formatTime(String x){
        String split[] = x.split(":");
        Boolean am = true;
        int foo = Integer.parseInt(split[0]);
        if (foo > 12){
            foo -= 12;
            am = false;
        }
        String e = "AM";
        //Thrown Together Fix will update in later iterations
        if (am == false){
            e = "PM";
        }
        return foo + ":" + split[1] + e;
    }
}
