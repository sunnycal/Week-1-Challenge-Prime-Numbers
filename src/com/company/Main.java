package com.company;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

	int secretNumber, guess = 2; //guess is initialized to 1000

	secretNumber = 2;
		int i;
		int num = 0;
		int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
		boolean isPrime = true;

		//Empty String
		String primeNumbersFound = "";

		//Start loop 1 to maxCheck
		for (i = 1; i <= maxCheck; i++) {
		isPrime = CheckPrime(i);
		if (isPrime) {
		primeNumbersFound = primeNumbersFound + i + " ";
		}
		}
		System.out.println("Enter a prime number:");
		System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
		// Print prime numbers from 1 to maxCheck
		System.out.println(primeNumbersFound);
		}
		//checks whether an int is prime or not.
	boolean isPrime(int n) {
	for(int i=2;2*i<n;i++) {
		if (n % i == 0)
			return false;
	}
	return true;
	}


public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
		remainder = numberToCheck % i;
		//if remainder is 0 than numberToCheckbr is not prime and break loop. Else continue loop
		if (remainder == 0) {
		return false;
		}
		}
		return true;

		}

		}