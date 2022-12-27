package stringPrgrams;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SP61 {

	public static void main(String[] args) {
		// print the Date and Time in a different format
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
         
         Date date = new Date();
         
         String formattedDate = sdf.format(date);
         
         System.out.println(formattedDate);
	}
}

//Output:2022/12/26 23:33:29.584