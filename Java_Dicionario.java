/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.HashMap;
import java.util.Map;


public class Main
{
	public static void main(String[] args) {


    //Criando um dicionario(Hashmap) para mapear nomes para idades
    Map<String, Integer> dicionarioIdades = new HashMap<>();
    
    //Adicionando elementos ao dicionário
    dicionarioIdades.put("Alice", 30);
    dicionarioIdades.put("Bob", 25);
    dicionarioIdades.put("Chloe", 35);
    
    //Acessando valores no dicionario
    System.out.println("Idade da Alice: " + dicionarioIdades.get("Alice"));
    System.out.println("Idade da Bob: " +   dicionarioIdades.get("Bob"));

    String nome = "David";
    
    if(dicionarioIdades.containsKey(nome))
    {
        System.out.println("Idade de " + nome + ": " + dicionarioIdades.get(nome));
    }
    else
    {
        System.out.println(nome + " nao encontrado no dicionario.");
    }

    // Iterando sobre as chaves e valores do dicionario
    for(Map.Entry<String, Integer> entry : dicionarioIdades.entrySet())
    {
        String chave = entry.getKey();
        int valor = entry.getValue();
        System.out.println(chave + " tem " + valor + " anos.");
    }

	}
}
