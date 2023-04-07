/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do arquivo a ser criado: ");
		String nomeArquivo = input.nextLine();
		
		try (FileWriter fw = new FileWriter(nomeArquivo))
		    {
		        System.out.println("Arquivo criado com sucesso.");
		    }catch (IOException e) 
		        {
		            System.out.println("Erro ao criar arquivo: " + e.getMessage());
		        }
		input.close();
		
	}
}
