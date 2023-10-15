/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

interface Printable
{
    void print();
}

class RandomNumberGenerator implements Printable
{
    private int[][] randomNumbers;
    
    public RandomNumberGenerator(int rows, int columns)
    {
        randomNumbers = new int[rows][columns];
        generateRandomNumbers();
    }
    
    private void generateRandomNumbers()
    {
        for(int i = 0; i < randomNumbers.length; i++)
        {
            for(int j = 0; j < randomNumbers.length; j++)
            {
                randomNumbers[i][j] = (int)(Math.random() * 100);
            }
        }
    }
    
    @Override
    public void print()
    {
        for(int i = 0; i < randomNumbers.length; i++)
        {
            for(int j = 0; j < randomNumbers[i].length; j++)
            {
                System.out.print(randomNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número de linhas: ");
		int rows = scanner.nextInt();
		
		System.out.print("Informe o número de colunas: ");
		int columns = scanner.nextInt();
		
		Printable printable = new RandomNumberGenerator(rows, columns);
		
		System.out.println("Matriz de números aleatórios: ");
		printable.print();
	}
}
