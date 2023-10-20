
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o tamanho do array: ");
    int size = scanner.nextInt();
    
    int[] array = generateRandomArray(size);
    
    System.out.println("Array gerado aleatoriamente: ");
    printArray(array);
    
    try {
        
        System.out.println("Digite o valor a ser pesquisado no array: ");
        int searchValue = scanner.nextInt();
        
        int result = search(array, searchValue, 0);
        if (result != -1)
        {
            System.out.println(searchValue + " encontrado no indice " + result + " do array.");
        }
        else
        {
            System.out.println(searchValue + " não encontrado no array.");
        }
        
    } catch(Exception e) {
        System.err.println("Erro: " + e.getMessage());
    
    }finally
    {
        scanner.close();
    }
    
	}
	
public static int[] generateRandomArray(int size)
{
    Random random = new Random();
    int[] array = new int[size];
    
    for(int i = 0; i < size; i++)
    {
        array[i] = random.nextInt(100); // gera números aleatórios entre 0 e 99
    }
    return array;
}

public static void printArray(int[] array)
{
    for(int i: array)
    {
        System.out.print(i + " ");
    }
    System.out.println();
    
}

public static int search(int[] array, int value, int index)
{
    if(index >= array.length)
    {
        return -1; //valor não encontrado no array
    }
    else if (array[index] == value)
    {
        return index; //valor encontrado no indice atual
    }    
    else
    {
        return search(array, value, index + 1); //Pesquise o próximo índice recursivamente
    }
}
	
}

