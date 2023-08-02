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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] filmes = {
		    "Filme 1",
		    "Filme 10",
		    "Filme 100",
		    "Filme 2",
		    "Filme 20",
		    "Filme 200",
		};
		
		
		System.out.println("Bem-vindo ao simulador de streaming.");
		System.out.println("Aqui está a lista de filmes do catálogo: ");
		
		for(int i = 0; i < filmes.length; i++)
		{
		    System.out.println((i + 1) + ". " + filmes[i]);
		}
		
		
		Random random = new Random();
		int indiceAleatorio = random.nextInt(filmes.length);
		String filmeAleatorio = filmes[indiceAleatorio];
		
		System.out.println("\nFilme aleatorio para voce: " + filmeAleatorio);
		
		System.out.print("Digite o número do filme que deseja assistir:  ");
		int escolha = scanner.nextInt();
		
		if (escolha >= 1 && escolha <= filmes.length)
		{
		    String filmeEscolhido = filmes[escolha - 1];
		    System.out.println("Voce escolheu assistir o filme: " + filmeEscolhido);
		    System.out.println("Aproveite o seu filme.");
		}
		else
		{
		    System.out.println("Opção inválida. Por favor, escolha um número de filme válido");
		}
		
		scanner.close();
		
	}
}
