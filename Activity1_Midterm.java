import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


public class Activity1_Midterm {

    public static void main(String[] args) throws Exception{
    	
    	Date date = new Date();
    	SimpleDateFormat format=new SimpleDateFormat("dd-M-yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	String input_bday = "11-11-2000";
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = year - byear;
    	System.out.print("My age: " + age);
    	
    	
    	
    }
    
    
}