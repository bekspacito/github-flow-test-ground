package edu.myrza;

import java.io.PrintStream;

public class App {
    
    static PrintStream out = System.out;
	
    public static void main( String[] args ) {
        
	if(args.length != 3) {
		out.println("Correct usage [ $ java <prog-name> <op> <operand1> <operand2> ]");
		return;
	}

	String op = args[0];
	double numOne = Double.parseDouble(args[1]);
	double numTwo = Double.parseDouble(args[2]);

	switch(op) {
		case "+" : out.println(numOne + numTwo); break;
		case "-" : out.println(numOne - numTwo); break;
		default : out.println("No such operation : " + op);
	}

    }
}
