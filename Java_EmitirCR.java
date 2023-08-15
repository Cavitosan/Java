/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

/* Em Java, você pode ter uma classe no mesmo arquivo que contém a função main. 
* Isso é possível, mas há algumas regras que você deve seguir. 
* No Java, você pode ter várias classes no mesmo arquivo, mas apenas uma delas 
* pode ser pública e deve ter o mesmo nome do arquivo. As outras classes não públicas
* podem ser acessadas apenas dentro do mesmo arquivo.
*/

class Pessoa
{
    String nome;
    boolean crAtivo;
    
    public Pessoa(String nome, boolean crAtivo) // método construtor
    {
        this.nome = nome;
        this.crAtivo = crAtivo;
    }
    
    public String toString()
    {
        return nome + " - CR Ativo: " + (crAtivo ? "Sim" : "Não");
    }
}

public class Main
{
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("João", true));
		pessoas.add(new Pessoa("Maria", true));
		pessoas.add(new Pessoa("Carlos", true));
		
		try 
		{
		    FileWriter writer = new FileWriter("CR.txt");
		    for (Pessoa pessoa : pessoas)
		    {
		        writer.write(pessoa.toString() + "\n");
		    }
		    writer.close();
		    System.out.println("Arquivo 'CR.txt' criado com sucesso.");
		}
		catch(IOException e) 
		{
		    System.out.println("Erro ao criar o arquivo 'CR.txt': " + e.getMessage());
		}
		
		emitirCR(pessoas.get(0));
		
		try
		{
		    FileWriter writer = new FileWriter("CR.txt");    
		    for (Pessoa pessoa : pessoas)
		    {
		        writer.write(pessoa.toString() + "\n");
		    }
		    writer.close();
		    System.out.println("Arquivo 'CR.txt' atualizado com a emissão do CR.");
		}
		catch (IOException e)
		{
		    System.out.println("Erro ao atualizar o arquivo 'CR.txt': " + e.getMessage());
		}
		
		
	}
	
	public static void emitirCR(Pessoa pessoa)
	{
	    pessoa.crAtivo = true;
	    System.out.println("CR emitido para " + pessoa.nome);
	}
}
