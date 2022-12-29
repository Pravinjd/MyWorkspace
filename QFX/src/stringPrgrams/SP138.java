package stringPrgrams;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SP138 {

	public static void main(String[] args) throws ParseException {
		//  convert a String to Date
		
		  String str = "2022-Dec-27";
          
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
          
          Date d = sdf.parse(str);
          
          System.out.println(d);

	}

}

//op : Tue Dec 27 00:00:00 IST 2022