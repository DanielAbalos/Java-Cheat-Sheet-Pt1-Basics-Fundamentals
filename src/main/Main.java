package main;

import javafx.scene.paint.Stop;

public class Main {

	public static void main(String[] args) {
		
//------------------------- JAVA DATA TYPES AND VARIABLE INITIALIZATION -------------------------
		
		/*We have to initialize variables before we can use them. To initialize a variable
		first define its type (int, double) then its name (intNum, doubleNum) followed by an
		equal sign and its value*/
		
		//Numbers
		byte byteNum = 50;			// number without decimal value from -128 to 127 (1 byte)
		short shortNum = 100;		// number without decimal value from -32,768 to 32,767 (2 byte)
		int intNum = 5; 			// number without decimal value from -2,147,483,648 to 2,147,483,647 (4 byte)
		float floatNum = 5.5f;		// number with decimal value, the 'f' at the end of the value casts it to be a float (4 byte)
		long longNum = 500000l; 	// number without decimal value from - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, the 'l' at the end of the value signifies it as long (8 byte)
		double doubleNum = 50000.5; // biggest number with decimal value (8 byte)
		
		/*TIP : normally the most used data types for numbers are int and double only. 
		use int when you are sure that the value will have no decimal values and use
		double when there will be decimal values.*/
		
		boolean bool = true; 		// true or false only
		char character = 'A'; 		// used to store characters, value determined by ' ' singe quotes
		
//----------------------------------------------------------------------------------------------------
		
//------------------------- ARITHMETIC OPERATIONS ON NUMBER DATA TYPES -------------------------
		
		System.out.println("\n\n-------------------- ARITHMETIC OPERATIONS -------------------------");
		
		/*To use arithmetic on Java we have to make sure that the data type of the variable 
		that will be holding the result is appropriate to the value.*/
		
		/*this piece of code gets the value of intNum that is initialized above and adds 5 to it
		then displays it below*/
		int sum = intNum + 5;
		System.out.println("ADDITION : intNum + 5 = " + sum);
		
		float difference = 5.75f - 0.25f;
		System.out.println("SUBTRACTION : 5.75 - 0.2 = " + difference);
		
		/*this piece of code gets the value of doubleNum and intNum initialized above and multiplies
		it to each other then displays the result*/
		System.out.println("MULTIPLICATION : doubleNum * 5 = " + doubleNum * intNum);
		
		System.out.println("DIVISION : longNum / 2 = " + longNum / 2 );
		
		System.out.println("--------------------------------------------------");
		
//----------------------------------------------------------------------------------------------------
		
//------------------------- JAVA CONTROL FLOW STATEMENTS -------------------------
		
		System.out.println("\n\n-------------------- CONTROL FLOW STATEMENTS -------------------------");
		
		//DECISION MAKING STATEMENTS
		
		/*first control flow statement is the if-else, it takes two values and compare it to each other,
		resulting in a boolean value, if the statement is true then it proceeds to execute the 'if' clause
		otherwise it proceeds to execute the 'else' clause or terminate the if statement if there are no
		else clause*/
		
		/*if-else statements use boolean operators such as
		== : compares if two values are equal
		> : greater than
		< : less than
		>= greater than or equal
		<= less than or equal*/
		
		/*this piece of code gets the value of intNum initialized above and compares
		it if it's equal to 5. If it's true then it should display 'true' then 
		'end of if statement' after. If it's false then it should only display
		'End of if statement'*/
		if(intNum == 5) {
			System.out.println("true");
		}
		System.out.println("End of if statement");
		
		System.out.println("\n");
		
		/*this piece of code compares the value of doubleNum initialized before and checks 
		if the value is less than 10. Since the statement is false it went to execute the 
		else statement*/
		if(doubleNum < 10) {
			System.out.println(doubleNum + " is less than " + 10);
		}else {
			System.out.println(doubleNum + " is not less than " + 10);
		}
		System.out.println("End of if-else statement");
		
		System.out.println("\n");
		
		/*this code compares the value of intNum to 12, since it is false
		it proceeds to the 'else if' statement which compares if the 
		value is equal to 5. Since it is true it executes the code*/
		if(intNum > 12) {
			System.out.println("first if statement is true");
		}else if(intNum == 5) {
			System.out.println("second if statement is true");
		}else {
			System.out.println("no if statements above are true");
		}
		System.out.println("End of else if statement");
		
		System.out.println("\n");
		
		/*You can compare multiple values in one if statement by using AND/OR operators
		&&, AND Operator - both must be true
		||, OR Operator - at least one must be true*/
		
		/*in this code we compared both intNum if it's equal to 5 and
		byteNum if it's equal to 50. Since both are true it executes
		the code.*/
		if(intNum == 5 && byteNum == 50) {
			System.out.println("true");
		}
		System.out.println("End of if with AND operator");
		
		System.out.println("\n");
		
		/*in this code we compared both intNum if it's equal to 10 and
		byteNum if it's equal to 50. Since at least one is true it executes
		the code.*/
		if(intNum == 10 || byteNum == 50) {
			System.out.println("true");
		}
		System.out.println("End of if with OR operator");
		
		System.out.println("\n");
		
		/*switch statement is used to compare a value to a series of values*/
		
		/*this code gets the value of intNum and compares it to the values
		seen after the 'case' keyword. If true, then it executes the code,
		then proceeds to execute the codes on the following case statements.
		The default will be executed no matter what at the end of switch statement*/
		
		switch(intNum) {
		case 0:
			System.out.println("false");
		case 5 :
			System.out.println("true");
		case 10 :
			System.out.println("false");
		case 15 :
			System.out.println("false");
		default :
			System.out.println("end of switch statement");
		}
		
		System.out.println("\n");
		
		/*to avoid the execution of the following case statements, we can use
		the 'break' keyword*/
		
		switch(intNum) {
		case 0:
			System.out.println("false");
			break;
		case 5 :
			System.out.println("true");
			break;
		case 10 :
			System.out.println("false");
			break;
		case 15 :
			System.out.println("false");
			break;			
		}
		
		System.out.println("end of switch statement with break");
		
		System.out.println("\n");
		
		//LOOPS
		
		/*loops are used if you want to execute a piece of code multiple times*/
		
		/*first, we initialized a variable named x with a value of 0. This will control how
		many times our while loop will run. Then we created a while loop and set a condition
		that it will execute while x is less than 5, once x becomes equal or greater than 5 the
		loop will stop. Finally inside the while clause we increment x by one to control the 
		execution of the loop.*/
		int x = 0;
		while(x < 5) {
			x++;
			System.out.println("executing while, index : " + x );
		}
		System.out.println("end of while statement");
		
		System.out.println("\n");
		
		/*in for loops, the conditional statement is divided into 3 parts separated by ';'.
		the first part is the initialization of the variable that will control the loop, in
		this case the int i. The second part is the condition that should be true to stop the
		loop. In this case, i should be less than 5, once i become equal or greater than 5, the
		loop stops. The last part tells i to increment by one each loop*/
		for(int i = 0; i < 5; i++) {
			System.out.println("executing for loop, index : " + i);
		}
		System.out.println("end of for loop");
		
		System.out.println("\n");
		 
		System.out.println("--------------------------------------------------");
		

	}

}
