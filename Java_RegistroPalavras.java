/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main
{
    
    private static final String FILE_PATH = "palavras.txt";
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<String> words = new ArrayList<>();
		
		loadWordsFromFile(words);
		
		while(true)
		{
		    System.out.println("Escolha uma opção: ");
		    System.out.println("1. Cadastrar palavra");
		    System.out.println("2. Excluir palavra");
		    System.out.println("3. Verificar nomes");
		    System.out.println("4. Sair");
		    
		    int choice = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch (choice)
		    {
		        case 1:
		            System.out.println("Digite a palavra a ser cadastrada: ");
		            String newWord = scanner.nextLine();
		            words.add(newWord);
		            saveWordsToFile(words);
		            System.out.println("Palavra cadastrada com sucesso.");
		            break;
		            
		        case 2:
                    System.out.println("Digite a palavra a ser excluída: ");
		            String wordToRemove = scanner.nextLine();
		            words.remove(wordToRemove);
		            saveWordsToFile(words);
		            System.out.println("Palavra removida com sucesso.");
		            break;
		            
		        case 3:
		            System.out.println("Digite um nome para verificar: ");
		            String name = scanner.nextLine();
		            boolean containsWord = containsWordInName(name, words);
		            System.out.println(containsWord ? "O nome contém uma das palavras cadastradas" : "O nome não contém nenhuma das palavras cadastradas.");
		            break;
		            
		        case 4:
		            System.out.println("Encerrando o programa.");
		            return;
		            
		        default:
		            System.out.println("Opção inválida.");
		    }
		    
		}
		
	}
	
	private static void loadWordsFromFile(List<String> words)
	{
	    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH)))
	    {
	        String line;
	        while((line = reader.readLine()) != null)
	        {
	            words.add(line);
	        }
	    }
	    catch (IOException e)
	    {
	        
	    }
	}
	
	private static void saveWordsToFile(List<String> words)
	{
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH)))
        {
            for (String word : words)
            {
                writer.write(word);
                writer.newLine();
            }
        }catch(IOException e)
        {
            
        }
	    
	}
	
	private static boolean containsWordInName(String name, List<String> words)
	{
	    for (String word : words)
	    {
	        if(name.contains(word))
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
}
