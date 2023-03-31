/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Leitura do tamanho da matriz
        System.out.print("Digite o número de linhas: ");
        int linhas = input.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = input.nextInt();
        
        //Criação da matriz
        int[][] matriz = new int[linhas][colunas];
        
        // preenchimento da matriz
        preencherMatriz(matriz);
        // impressão da matriz
        imprimirMatriz(matriz);
        
        //soma dos elementos da matriz
        int soma = somaMatriz(matriz);
        System.out.println("A soma dos elemento da matriz é: " + soma);
        
        }
        
        //Método que preence a matriz com valores informados pelo usuario
        
        public static void preencherMatriz(int[][] matriz) {
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner .nextInt();
                    
                }
            }
        }
        
        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        public static int somaMatriz(int[][] matriz) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[i].length; j++) {
                    soma += matriz [i][j];
                }
            }
            return soma;
        }
        
}
