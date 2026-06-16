// STUDENT NAME:
// DATE: 

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
        int day = 2;
        int year = 2020;
        int month = 2;
        int a;
        int y = 6819;
        int m = 9;
        int JDN = 2458882;
        int day1 = 26;
        int year1 = 1918;
        int month1 = 8;
        int a1;
        int y1 = 6717;
        int m1 = 11;
        int JDN1 = 2421832;
        int dif;


		/***** INITIALIZATION SECTION *****/

		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
        a = (14 - month) / 12;
        y = year + 4800 - a;
        m = month + 12*a - 3;
        JDN = day + (153*m + 2) / 5 + (365*y) + (y / 4) - (y / 100) + (y / 400) - 32045;
        a1 = (14 - month) / 12;
        y1 = year1 + 4800 - a1;
        m1 = month1 + 12*a1 - 3;
        JDN1 = day1 + (153*m1 + 2) / 5 + (365*y1) + (y1 / 4) - (y1 / 100) + (y1 / 400) - 32045;
        dif = JDN - JDN1;



		
		/***** OUTPUT SECTION *****/
        System.out.println ("Julian Day Number for today's date, 2/2/2020, is "+  +JDN);
        System.out.println ("Julian Day Number for birthday, 8/26/1918, is "+  +JDN1);
        System.out.println ("The difference in days is "+  +dif+  " which makes you approximately 101 years old!");

}
}