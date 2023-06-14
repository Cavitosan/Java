/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe uma frase: ");
		String frase = scanner.nextLine();
		
		// Remove espaços em branco e acentuações
		String fraseLimpa = frase.replaceAll("[\\s.,?!]", "");
		
		// Converte a frase para letras minúsculas
		String fraseToLower = fraseLimpa.toLowerCase();
		
		boolean palindromo = verificarPalindromo(fraseToLower);
		
		if(palindromo) {
		    System.out.println("A frase é um palíndromo.");
		}
		else {
		    System.out.println("A frase não é um palíndromo. ");
		}
		
	}
	
	private static boolean verificarPalindromo(String frase){
	    int inicio = 0;
	    int fim = frase.length() - 1;
	    
	    while (inicio < fim) 
	    {
	        if(frase.charAt(inicio) != frase.charAt(fim))
	        {
	            return false;
	        }
	        inicio++;
	        fim--;
	    }
	    
	    return true;
	}
	
}
