
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] palavras = {"JAVA", "COMPUTADOR", "PROGRAMA", "DESENVOLVEDOR"};
		
		// Escolher uma palavra aleatoriamente
		String palavra = palavras[(int) (Math.random() * palavras.length)];
		
		StringBuilder palavraAdivinhada = new StringBuilder();
		for(int i = 0; i < palavra.length(); i++)
		{
		    palavraAdivinhada.append("_");
		}
		
		int tentativas = 0;
		
		while(true)
		{
		
		    System.out.println("Palavra a ser adivinhada: " + palavraAdivinhada);
		    System.out.println("Tentativas restantes: " + (6 - tentativas));
		
		    //Solicitar letra do usuário    
		    System.out.print("Digite uma letra: ");
		    char letra = input.nextLine().toUpperCase().charAt(0);
		
		    //Verificar se a letra está na palavra
		    boolean letraEncontrada = false;
		
		    for(int i = 0; i < palavra.length(); i++)
		    {
		        if(palavra.charAt(i) == letra)
		        {
		            palavraAdivinhada.setCharAt(i, letra);
		            letraEncontrada = true;
		        }
		    }
		    
		    // Se a letra não estiver na palavra, incrementar as tentativas
		    if (!letraEncontrada)
		    {
		        tentativas++;
		    }
		    
		    // Verificar se o usuário ganhou ou perdeu
		    if (palavra.equals(palavraAdivinhada.toString()))
		    {
		        System.out.println("Parabéns, voce ganhou!");
		        break;
		        
		    }else if(tentativas == 6) {
		        System.out.println("Que pena, você perdeu! A palavra era: " + palavra);
		        break;
		    }
		    
		}
		
		//fechando o Scanner
		input.close();
		
	}
}
