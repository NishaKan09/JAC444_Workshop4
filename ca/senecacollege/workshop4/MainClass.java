package ca.senecacollege.workshop4;

import java.io.IOException;
import java.util.Scanner;


public class MainClass {
	
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int option;
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Enter 1 to run the first task or enter 2 to run the second task: ");
			option = input.nextInt();
			
			if(option == 1) {
				Hangman.hangman();
				exit = true;
			}
			else if(option == 2) {
				Task2.countOccurances();
				exit = true;
			}
			else {
				exit = true;
			}
		}
		
		
		
	}
}