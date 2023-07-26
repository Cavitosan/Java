/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		
		String text = "Este é um exemplo de texto para demonstrar funções avançadas de String..";
		
		boolean startsWith = text.startsWith("Este");
		System.out.println("Começa com 'Este': " + startsWith);
		
		boolean endsWith = text.endsWith("String.");
		System.out.println("Termina com 'String': " + endsWith);
		
		int indexOfSubstring = text.indexOf("exemplo");
		System.out.println("Indice da primeira ocorrencia de 'exemplo': " + indexOfSubstring);
		
		int lastIndexOfSubstring = text.lastIndexOf("de");
		System.out.println("Indice da última ocorrencia de 'de': " + lastIndexOfSubstring);
		
		String[] words = text.split(" ");
		System.out.println("Palavras no texto: " + Arrays.toString(words));
		
		String replacedText = text.replace("exemplo", "caso");
		System.out.println("Texto com 'exemplo' substituido por 'caso: " + replacedText);
		
		String uppercaseText = text.toUpperCase();
		System.out.println("Texto em maiúsculas: " + uppercaseText);
		
		String lowercaseText = text.toLowerCase();
		System.out.println("Texto em minusculas: " + lowercaseText);
		
		String trimmedText = text.trim();
		System.out.println("Texto sem espaços em branco no inicio e no final: " + trimmedText);
		
		
	}
}
