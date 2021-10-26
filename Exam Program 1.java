/******************************************************************************** 

   YOU MUST KEEP THE CODE OUTLINE AS GIVEN 
   * only Program Assignment 1 that you will be given the outline 
     so that you will see what basic information that you will have
     at the beginning of Program Assignment
     
     DUE Monday, October 4, 11:59 PM EST
  
*********************************************************************************/


// *******************************************************************
// CSC 151-02 - Computer Programming 1 - Dr. Boonthum-Denecke (instructor)
// Fall 2021
// Programmed Assignment 1 by :  [[Tyree Jones-Magee]]
//                               [[00506642]] 
//                               [[Computer Science]]
// Location where you completed this assignment (lab / apt / dorm):  [[ Lab and dorm]]
// Tutor, if any (who help you with this program assignment):  [[TUTOR]]
//
// *******************************************************************

import java.util.Date;  // DO NOT REMOVE THIS LINE 
// (1) Import additional class(es) below
         import java.util.*;
         

public class JonesMageeT_P1  
// make sure that you change LASNAME to your last name
//                    change initial to your first name initial
{
	public static void main (String[] args)
	{

		String myName = "Tyree Jones-Magee"; // put your full name here
      String myMajor = "major Computer Science"; // put your major here
		System.out.println ( "\nFall 2021 Program 1 by " + myName + ", "+myMajor+"\n\n");
		System.out.println ( " I,Tyree Jones-Magee, did not receive any assistance\n" +
									" from another person except CSC 151 instructors\n" +
									" and assigned tutors.\n\n");  // completed by Tyree Jones-Magee

		/* Begin your code here ::  Tyree Jones-Magee */
		// (2) Create an object to read an input from a keyboard
               Scanner k = new Scanner(System.in);



		// (3) Input 2 integers and 1 double (including declare variables)  and 1 String
      //     Note that you must add _XXX, where XXX are your initials (first, middle, last) 
      //     at the end of each variable
// Part 3A
               int a_TJM, b_TJM, result1, result2;  // variables
               double r_TJM, result3, result4;
               String name;
 // Part 3B
								System.out.println("Please input an integer for a"); //input for a 
								a_TJM = k.nextInt();
								System.out.println("Please input an integer for b");   //input for b
								b_TJM = k.nextInt();
								System.out.println("Please input a deciaml number for r"); //input for r
								r_TJM = k.nextDouble();
								k.nextLine();
								System.out.println("Please input your name?");  //input for name
								name = k.nextLine();

								System.out.println("\n");
								System.out.println(name+", your value inputs were:\n\ta = "+    // results
								a_TJM+"\n\tb = "+b_TJM+"\n\tr = "+r_TJM);
//Part 3C
								result1=(int) Math.pow(a_TJM,7)+5*9; // calculation result1
                        
								result2=(int) Math.pow(a_TJM,4)-(int)8*a_TJM*b_TJM+(int)Math.pow(b_TJM,5);  // calculation result2
                        
                        result3=(double) ((2*a_TJM)-5)/18+((3*b_TJM)-7)/13;  // calculation result3
                        
                        result4= ((5*Math.pow(r_TJM,10)+3)/7);   // calculation result4
                        
// Part 3D
                        System.out.println("\n\n");
                        System.out.println("Calculated results were:\n\tresult1 = "+  //prints result1-4
                                           result1+"\n\tresult2 = "+result2+
                                           "\n\tresult3 = "+result3+"\n\tresult4 = "+result4);                         

// Part 3E
                        String hometown, upper, lower;
                        char lastChar;
                        String lastCharupper1, lastCharupper2;  // variables
                        int size;
                        
                        System.out.println("\n\n");
                        System.out.println("Please enter your hometown (City and State ) :");  //ask for hometown
                        hometown= k.nextLine();
                        
                        upper= hometown.toUpperCase();  // makes uppercase
                        lower = hometown.toLowerCase(); // makes lowercase
                        size= hometown.length();  // gets size
                        lastChar= hometown.charAt(hometown.length()-1);  // last character regular
                        String lastChar1=Character.toString(lastChar);  // converts char lastChar to a string
                        lastCharupper2= lastChar1.toUpperCase(); /// turns string of lastChar to uppercase
                        
                        
                        System.out.println("\n\n");
                        System.out.println(name+", your hometown is "+hometown+" ("+size+" characters)"+  // prints hometown and size manipulation
                                            "\n\tUpper Case ==> "+upper+
                                            "\n\tLower Case ==> "+lower+
                                            "\n\tLast character of your hometown is "+lastCharupper2);
                                           
                     


		
		
		// (4) Calculate several math expressions (including declare variables)
		//     by  Tyree Jones-Magee
      



		
		// (5) Output results by Tyree Jones-Magee 
		



      
      // (6) String manipulation - make sure that you use methods defined in String class
		



      
      
		/* code completion by   Tyree Jones-Magee */ 
		
   /* =====================================================================================
   
       DO NOT CHANGE ANY CODE AFTER THESE SECTION  
       ONLY UPDATE IN COMMENTS AREA
       
   */   
      
	//*********************  DO NOT REMOVE THIS CODE  ****************************		
		// This is to print at the end showing the completion and timestap
		System.out.println ( "\nProgram 1 is completed by " + myName);
		Date today = new Date(); 
		System.out.println(today);
		System.out.println ( "\n\n"); 
	} // end main
}

// This program is for CSC 151 class for Dr. Boonthum-Denecke section
// Fall 2021 - Assigned in August, due Monday October 4
// [[Tyree Jones-Magee]]
