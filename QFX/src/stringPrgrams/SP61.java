package stringPrgrams;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SP61 {

	public static void main(String[] args) {
		// print the Date and Time in a different format
		
	     Date d = new Date();
	     
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");    //2022/12/28 21:10:47.472
		 
		 //SimpleDateFormat sdf = new SimpleDateFormat("YY/MMM/dd HH:mm:ss.SSS");   //22/Dec/28 21:11:45.978
	     
	    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");  //2022/12/28 09:12:21.468
         
         String formattedDate = sdf.format(d);
         
         System.out.println(formattedDate);
	}
}

//Output:2022/12/26 23:33:29.584