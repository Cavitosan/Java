import java.util.LinkedList;
import java.util.Queue;

public class Main
{
	public static void main(String[] args) {
		
		// Criando um objeto da classe MinhaFila
		MinhaFila minhaFila = new MinhaFila();
		
		// Adicionando elementos à MinhaFila 
		minhaFila.adicionarElemento(5);
		minhaFila.adicionarElemento(25);
		minhaFila.adicionarElemento(55);
		
		//Mostrando e removendo elementos da fila 
		System.out.println("Elemento removido: " + minhaFila.removerElemento());
		System.out.println("Elemento removido: " + minhaFila.removerElemento());
		
		}
		
	static class MinhaFila
	{
	    
	    // Fila(Queue) privada de inteiros
	    private Queue<Integer> fila = new LinkedList<>();
	    
	    //Método para adicionar elementos à fila
	    public void adicionarElemento(int elemento)
	    {
	        fila.add(elemento);
	    }
	    
	    // Método para remover e retornar o elemento da fila
	    public int removerElemento()
	    {
	        return fila.remove();
	    }
	    
	}
	
	
}