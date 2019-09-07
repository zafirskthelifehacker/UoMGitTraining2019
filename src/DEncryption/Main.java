package DEncryption;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Text: ");
		String text = input.next();
		StringBuffer encryptedText = Encrypt(text);
		System.out.println("Encrypted Text is " + encryptedText);
		StringBuffer decryptedText = Decrypt(encryptedText.toString());
		System.out.println("Decrypted Text is " + decryptedText);
	}
	public static StringBuffer Encrypt(String text){ 
		StringBuffer encryptionResult= new StringBuffer(); 
		for (int i = 0; i < text.length(); i++) 
		{ 
		    if (Character.isUpperCase(text.charAt(i))) 
		    { 
		        char ch = (char)(((int)text.charAt(i) + 4 - 65) % 26 + 65); 
		        encryptionResult.append(ch); 
		    } 
		    else
		    { 
		        char ch = (char)(((int)text.charAt(i) + 4 - 97) % 26 + 97); 
		        encryptionResult.append(ch); 
		    } 
		} 
		return encryptionResult; 
	} 
	public static StringBuffer Decrypt(String text){ 
		StringBuffer decryptionResult = new StringBuffer(); 
		for (int i = 0; i < text.length(); i++) 
		{ 
		    if (Character.isUpperCase(text.charAt(i))) 
		    { 
		    	char ch = (char)(((int)text.charAt(i) - (4 + 65)) % 26 + 65);  
		        decryptionResult.append(ch); 
		    } 
		    else
		    { 
		    	char ch = (char)(((int)text.charAt(i) - (4 + 97)) % 26 + 97);  
		        decryptionResult.append(ch); 
		    } 
		} 
		return decryptionResult; 
	} 
}
