package DEncryption;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Text: ");
		String text = input.next(); // Takes the user's input
		StringBuffer encryptedText = Encrypt(text); // Passes the user's text into the Encrypt() method 
		System.out.println("Encrypted Text is " + encryptedText); // Displaying the encrypted text
		StringBuffer decryptedText = Decrypt(encryptedText.toString()); // Passes the encrypted text into the Decrypt() method
		System.out.println("Decrypted Text is " + decryptedText); // Displaying the decrypted text
	}
	
	//The Encrypt() method starts here.
	public static StringBuffer Encrypt(String text){ 
		StringBuffer encryptionResult= new StringBuffer(); // Creating an object of the StringBuffer class
		for (int i = 0; i < text.length(); i++) // Looping through each character of the text
		{ 
		    if (Character.isUpperCase(text.charAt(i))) 
		    { 
		        char ch = (char)(((int)text.charAt(i) + 4 - 65) % 26 + 65); //Encrypting the upper case characters
		        encryptionResult.append(ch); // Adding each result character to StringBuffer object
		    } 
		    else
		    { 
		        char ch = (char)(((int)text.charAt(i) + 4 - 97) % 26 + 97); //Encrypting the lower case characters
		        encryptionResult.append(ch); // Adding each result character to StringBuffer object
		    } 
		} 
		return encryptionResult; // Returning the object
	} 
	
	// The method Decrypt() starts here.
	public static StringBuffer Decrypt(String text){ 
		StringBuffer decryptionResult = new StringBuffer(); // Creating an object of the StringBuffer class
		for (int i = 0; i < text.length(); i++) // Looping through each character of the text
		{ 
		    if (Character.isUpperCase(text.charAt(i))) 
		    { 
		    	char ch = (char)(((int)text.charAt(i) - (4 + 65)) % 26 + 65);  //Decrypting the upper case characters
		        decryptionResult.append(ch); // Adding each result character to StringBuffer object
		    } 
		    else
		    { 
		    	char ch = (char)(((int)text.charAt(i) - (4 + 97)) % 26 + 97);  //Decrypting the lower case characters
		        decryptionResult.append(ch); // Adding each result character to StringBuffer object
		    } 
		} 
		return decryptionResult; // Returning the object
	} 
}
