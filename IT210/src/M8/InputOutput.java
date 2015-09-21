/*
	* File:   InputOutput.java
	* Desc:   Reads a file and converts all letters to lowercase; writes the contents to a new file
	* Author: Wesley Tomlinson
	* Class:  IT210 / M8A1
*/
package M8;

import java.io.*;
import java.util.*;

public class InputOutput
{
	public static void main(String[] args) throws Exception
	{
		String inputFile;
		String outputFile;
		Scanner kb = new Scanner(System.in);

		System.out.println("\nThis program will convert all letters in your file to lowercase.");
		System.out.println("\nFile names can be for the relative path or an absolute path. ");
		System.out.print("\nEnter the name of the input file: ");
		inputFile = kb.nextLine();
		System.out.print("\nEnter the name of the output file: ");
		outputFile = kb.nextLine();

		FileReader fr = new FileReader(inputFile);
		FileWriter fw = new FileWriter(outputFile);
		int ch;
		ch = fr.read();

		while (ch != -1)
		{
			if ((char)ch >= 'A' && (char)ch <= 'Z')
				ch = ch + ('a' - 'A');

			fw.write((char)ch);

			ch = fr.read();
		}

		fr.close();
		fw.close();
	}
}