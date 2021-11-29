package com.greatlearning.service;

import java.util.*;
import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress (String firstName,String lastName, String Department )
	{
		String empID = firstName+lastName+"@"+Department+"."+"greatlearning.com" ;
		empID = empID.replaceAll("\\s","");
		System.out.println(empID);
		return (empID);
	}
	
	public String generatePassword()
	{
		
		/*
		 * Random password generation with validation
		 * 
		 * 1. use random numbers of characters from each strings such that total char = 8
		 * 2. select those many characters randomly and put them in an array list.
		 * 3. shuffle the array list and convert it back to string.
		 */
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWZXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+";
		ArrayList<String> combStr = new ArrayList<String>();
		
		// Generate combined list of all strings
		
		combStr.add(capitalLetters);
		combStr.add(smallLetters);
		combStr.add(numbers);
		combStr.add(specialCharacters);
		
		Random rand = new Random();
		char[] password = new char[8];
		
		ArrayList<Character> random = new ArrayList<Character>();
		
		int[] numOfCharFromEachStr = {1,1,1,1};
		
		// Assigning random number of characters to be used from each string
		// Total = 8
		
		for (int i=0;i<4;i++)
			numOfCharFromEachStr[rand.nextInt(4)]+=1;
		
		/*
		 * for (int i=0; i<4;i++) System.out.println(numOfCharFromEachStr[i]);
		 */
		
		// Genarating a random string
		
		for (int i=0; i<4;i++)	
		{
			String str = combStr.get(i);
			for (int j=0;j<numOfCharFromEachStr[i];j++)
			{
				random.add(str.charAt(rand.nextInt(str.length())));
			}
		}
		
		//System.out.println(random);
		
		// shuffling random string to create more randomness
		
		Collections.shuffle(random);
		
		for (int i=0;i<random.size();i++)
		{
			password[i]= random.get(i);
		}
		
		
		
		/*
		 * for (int i =0; i<8; i++) { password[i]=
		 * concat.charAt(rand.nextInt(concat.length())); }
		 * System.out.println("pass cred "+password.toString());
		 */
		return String.valueOf(password);
		
	}
	
	public void showCredentials(Employee emp, String email, String password)
	{
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---> "+email);
		System.out.println("Password ---> "+password);
	}
}
