package com.vtiger.genericLibrery;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtilityClass 
{
public int randomNumberGenerate(int num)
{
	Random r= new Random();
	return r.nextInt(num);
 }
public String generateDateTime() 
{
	Date d= new Date();
	 String s=d.toString();
	 String []s1 =s.split(" ");
	//return s1;
	 
	 return s1[3].replace(":", "-")+"--"+s1[2]+"-"+s1[1]+"-"+s1[5];
	 
	
	
}
/*
 * public static void main(String[] args) 
 * {
 *  JavaUtilityClass j=new
 * JavaUtilityClass();
 * 
 * String []s =j.generateDateTime(); 
 * for (int i = 0; i < s.length; i++) 
 * {
 * System.out.println(i+" "+s[i]); 
 * } 
 * }
 */

/*
 * public static void main(String[] args) {
 * 
 * 
 * JavaUtilityClass j=new JavaUtilityClass();
 * System.out.println(j.generateDateTime());
 * 
 * 
 * }
 */

@Test
public void m1() {
	System.out.println(generateDateTime());
}


}
/*0 Wed
1 Dec
2 27
3 20:45:41
4 IST
5 2023

*20:59:20-- 27-Dec-2023

*19-25-54--03-Jan-2024 after replacing the ":" with "-"
*/

