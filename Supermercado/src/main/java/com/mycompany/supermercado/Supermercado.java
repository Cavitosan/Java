/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercado;

/**
 *
 * @author Uchih
 */

import Interfaces.Produto;
import Classes.CarrinhoDeCompras;
import Classes.ItemProduto;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        while(true)
        {
            System.out.println("Bem-vindo ao supermercado!");
            System.out.println("1 - Adicionar produto ao carrinho");
            System.out.println("2 - Calcular total");
            System.out.println("3 - Finalizar Compra");
            System.out.println("4 - Sair");
            
            int opcao = scanner.nextInt();
            
            if(opcao == 1)
            {
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.next();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                Produto produto = new ItemProduto(nome, preco);
                carrinho.adicionarProduto(produto);
                System.out.println("Produto adicionado com sucesso.");
            }
            else if(opcao == 2)
            {
                double total = carrinho.calcularTotal();
                System.out.println("Total R$: " + total);
            }
            else if (opcao == 3)
            {
                double total = carrinho.calcularTotal();
                System.out.println("Compra finalizada. Valor total R$: " + total);
                break;
            }
            else if (opcao == 4)
            {
                System.out.println("Obrigado por visitar nosso mercadinho.");
                break;
            }
            else
            {
                
                System.out.println("Opcao invalida, favor rever o número selecionado.");
                break;
            }
        }

        scanner.close();
        
    }
}
