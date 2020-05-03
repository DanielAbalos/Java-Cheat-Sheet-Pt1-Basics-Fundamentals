package main;

import java.security.Policy.Parameters;

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
		
		/*All data types mentioned above are called primitive data types*/
		
		/*String variable is a little bit different to instantiate, you should invoke the
		object String to create a variable. Sample below.*/
		String sampleStr = "hello world";
		
//----------------------------------------------------------------------------------------------------
		
//------------------------- ARITHMETIC OPERATIONS ON NUMBER DATA TYPES -------------------------
		
		System.out.println("\n\n-------------------- ARITHMETIC OPERATIONS -------------------------");
		
		/*To use arithmetic on Java we have to make sure that the data type of the variable 
		that will be holding the result is appropriate to the value.*/
		
		System.out.println(sampleStr);
		
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
		System.out.println("\n");
		
//----------------------------------------------------------------------------------------------------
		

//------------------------- JAVA ARRAYS -------------------------
		
		System.out.println("\n\n-------------------- ARRAYS -------------------------");
		
		/*arrays are used to store multiple values of the same data type in a single variable
		 separated by comma*/
		
		int[] intArray;
		String[] food = {"fries", "burger", "pizza", "chicken"};

		/*You can access the values inside the array by its index starting from 0*/
		System.out.println("FOOD ARRAY index 0 : " + food[0]);
		System.out.println("FOOD ARRAY index 2 : " + food[2]);
		System.out.println("FOOD ARRAY index 3 : " + food[3]);
		
		/*Loops are commonly used in arrays for easier manipulation*/
		
		/*in this code, we used for loop. the variable 'i' in this for loop
		used to iterate the loop is also used as the index for the array,
		and we used the length of the array by usng the function
		'food.length' to determine how long the loopwill run.*/
		System.out.println("\n");
		System.out.println("PRINTING FOOD ARRAY THROUGH FOR LOOP");
		for(int i = 0; i < food.length; i++) {
			System.out.println("FOOD ARRAY index " + i + ": " + food[i]);
		}
		
		/*in this code we first initialized an array with double
		datatype. then initialized a double variable which will
		hold the sum of the numbers that we will add. then using
		for loop, we iterated each number of the array one by one
		and add them and storing them to the variable 'loopSum'
		until the loop is finished*/
		double[] doubleArray = {12.5, 11, 5, 6.25, 13.2, 8.12, 3};
		System.out.println("\n");
		System.out.println("SUM OF doubleArray through for loop");
		double loopSum = 0;
		for(int i = 0; i < doubleArray.length; i++) {
			loopSum += doubleArray[i];
		}
		System.out.println("SUM OF ARRAY : " + loopSum);
		
		
//----------------------------------------------------------------------------------------------------

		
//------------------------- JAVA FUNCTIONS -------------------------		
		
		System.out.println("\n\n-------------------- FUNCTIONS -------------------------");
		
		//CALLING FUNCTIONS
		printHelloWorld();
		functionsWithParameters(sampleStr);
		
		/*this function call passes the value of the variable intNum to the
		function through parameters. And assigns the result of the function
		to the int variable*/
		int addFunctionResult = addFunction(intNum);
		System.out.println(addFunctionResult);
		createLineSpacer();
		
		int secondParameter = 3;
		int subtractFunctionResult = subtractFunction(intNum, secondParameter);
		System.out.println(subtractFunctionResult);
		createLineSpacer();
		
		stringFunctions();
		
	}//end of main
	
	
	/*functions are small blocks of code that only runs when it's called.
	 Calling functions is at line 221*/
	
	/*1. to create a function first you have to define its return data type. Return data type
	are also the same as variable data types. It will determine the data type of the return
	value of the function. If the function has no return value, the return data type must be
	void.
	
	2. Second is to create a function name, same as creating a variable name, it's up to you
	
	3. every function needs a parameter. parameters are values that passed to the functions
	when called and be used in the execution of the function. To create and use parameters
	first you have to determine the data type of the value then create a variable name for it
	enclosed in the parentheses of the function*/
	
	/*this piece of code just prints a line and a line break and is called on every functions
	I created. You can call functions within functions.*/
	static void createLineSpacer() {
		System.out.println("--------------------------------------------------");
		System.out.println("\n");
	}
	
	/*this function is just to print 'Hello World'. Since it has no return value
	the return data type is void. And since it accepts no parameters, the parentheses
	are empty. The call is in line 222*/
	static void printHelloWorld () {
		System.out.println("executing printHelloWorldFunction");
		System.out.println("Hello world");
		createLineSpacer();
	}
	
	/*this function accepts the parameter passed to it and prints it.
	 The call is in line 223.*/
	static void functionsWithParameters(String sampleString) {
		System.out.println("executing functionsWithParameters");
		System.out.println(sampleString);
		createLineSpacer();
	}
	
	/*this function takes the value of intNum passed in the function call above and assigns it to x. Then uses x
	 and adds 5 to it and returns the sum. The data type of this function
	 is int since it returns an Integer number. The call is in line 225*/
	static int addFunction(int x) {
		System.out.println("executing addFunction");
		/*int sum = x + 10;
		return sum;*/
		return x + 10;
	}
	
	/*this function takes two parameters and subtracts it to one another
	and returns the value. Functions can take as many parameters as you want*/
	static int subtractFunction(int x, int y) {
		System.out.println("executing subtractFunction");
		return x-y;
	}
	
	static void stringFunctions() {
		
		System.out.println("\n\n-------------------- STRING FUNCTIONS AND MANIPULATIONS -------------------------");
		
		/*This function will explain the common String functions used for 
		manipulating strings*/
		
		/*We will start with a string variable to use as an example*/
		
		String sampleString = "Hello World";
		
		/*takes integer as a parameter, and uses the parameteras an index 
		and returns the character in that index, in this case 6*/
		System.out.println("CHAR AT FUNCTION : " + sampleString.charAt(6));
		
		//concatenates or appends or adds another string at the end of the initial string
		System.out.println("CONCAT FUNCTION : " + sampleString.concat(" using concat function"));
		
		//returns the index(int) of the character in the parameter
		System.out.println("INDEX OF FUNCTION : " + sampleString.indexOf("W"));
		
		//checks if the string in the parameters exists in the string. Returns boolean value
		System.out.println("CONTAINS FUNCTION : " + sampleString.contains("llo"));
		
		//checks if the string ends with the string in the parameter. Returns boolean value
		System.out.println("ENDS WITH FUNCTION : " + sampleString.endsWith("rld"));
		
		//Checks if the string is perfectly the same with the string in the parameter. Returns boolean value
		System.out.println("EQUALS FUNCTION : " + sampleString.equals("Hello World"));
		
		//checks if the string is equal with the string in the parameter while ignoring the upper or lowe cases. Returns boolean value
		System.out.println("EQUALS IGNORE CASE FUNCTION : " + sampleString.equalsIgnoreCase("HELLO WORLD"));
		
		//returns the length of the string. Returns int value
		System.out.println("LENGTH FUNCTION : " + sampleString.length());
		
		//replaces all the occurrences of the string in the first parameter, with the string in the second parameter
		System.out.println("REPLACE FUNCTION : " + sampleString.replace("l", "z"));
		
		//cuts the string starting with the index of the parameter.
		System.out.println("SUBSTRING FUNCTION : " + sampleString.substring(5));
		
		//cuts the string starting with the index of the first parameter, and ends with the second parameter
		System.out.println("SUBSTRING FUNCTION : " + sampleString.substring(5, 9));
		
		//makes the whole string into lowercase
		System.out.println("TO LOWERCASE FUNCTION : " + sampleString.toLowerCase());
		
		//makes the whole string into uppercase
		System.out.println("TO UPPERCASE FUNCTION : " + sampleString.toUpperCase());
		
		//this function splits the string into chars and store them in an array
		System.out.println("TO CHAR ARRAY FUNCTION : ");
		char[] sampleStringArr = sampleString.toCharArray();
		for(int i = 0; i < sampleStringArr.length; i++) {
			System.out.println(sampleStringArr[i]);
		}
		
		//this function splits the string in the string in the parameter of the function and stores it to a string array
		System.out.println("SPLIT FUNCTION : ");
		String[] sampleStringSplit = sampleString.split(" ");
		for(int i = 0; i < sampleStringSplit.length; i++) {
			System.out.println(sampleStringSplit[i]);
		}
		
		System.out.println("\n");
		
		//another sample
		String sample2 = "I want to eat potato corner";
		String[] sample2Split = sample2.split(" ");
		for(int i = 0; i < sample2Split.length; i++) {
			System.out.println(sample2Split[i]);
		}
		
		//another sample
		String sample3 = "Mississippi";
		String[] sample3Split = sample3.split("s");
		for(int i = 0; i < sample3Split.length; i++) {
			System.out.println(sample3Split[i]);
		}
		
	}
	
}
