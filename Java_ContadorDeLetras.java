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
		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		int contador = 0;
		String[] palavras = frase.split(" ");
		
		for(String palavra : palavras) //enhanced for
		{
		    if(palavra.toLowerCase().startsWith("a"))
		    {
		        contador++;
		    }
		}
		
		System.out.println("Número de palavras que começam com a letra A: " + contador);
		
		/* 
		*  Nesse caso específico, estamos percorrendo o array palavras e a 
		*  cada iteração do loop, a variável palavra recebe o valor do 
		*  próximo elemento do array
		*/
		
	}
}
