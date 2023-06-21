/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;


public class Main
{

    enum Numeros
    {
        UM,
        DOIS,
        TRES,
        QUATRO,
        CINCO,
        SEIS,
        OITO,
        DEZ,
        NOVE
    }

	public static void main(String[] args) {
		
		Numeros[] numerosGerados = gerarNumerosAleatorios();
		
		Numeros[] numerosAdivinhados = obterInputUsuario();
		
		int quantidadeAcertos = verificarAcertos(numerosGerados, numerosAdivinhados);
		System.out.println("Quantidade de acertos: " + quantidadeAcertos);
		
	}
	
	// Funções
	
	public static Numeros[] gerarNumerosAleatorios(){
	    Random random = new Random();
	    Numeros[] numeros = new Numeros[3];
	    
	    for(int i = 0; i < 3; i++)
	    {
	        int numeroAleatorio = random.nextInt(Numeros.values().length);
	        numeros[i] = Numeros.values()[numeroAleatorio];
	    }
	    
	    return numeros;
	}
	
	
	public static Numeros[] obterInputUsuario(){
	    Scanner scanner = new Scanner(System.in);
	    Numeros[] numeros = new Numeros[3];
	    
	    System.out.println("Informe tres numeros (de UM a DEZ): ");
	    
	    for(int i = 0; i < 3; i++)
	    {
	        String input = scanner.nextLine().toUpperCase();
	        numeros[i] = Numeros.valueOf(input);
	        
	    }
	    
	    return numeros;
	}
	
	public static int verificarAcertos(Numeros[] numerosGerados, Numeros[] numerosAdivinhados){
	    int quantidadeAcertos = 0;
	    
	    for(Numeros numeroAdivinhado : numerosAdivinhados) // ":" significa for each
	    {
	        for (Numeros numeroGerado : numerosGerados)
	        {
	            if(numeroAdivinhado == numeroGerado)
	            {
	                quantidadeAcertos++;
	                break;
	            }
	        }
	    }
	    
	    return quantidadeAcertos;
	}
	
}
