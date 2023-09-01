/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Produto;

/**
 *
 * @author Uchih
 */

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> itens = new ArrayList<>();
    
    public void adicionarProduto(Produto produto)
    {
        itens.add(produto);
    }
    
    public double calcularTotal()
    {
        double total = 0;
        for(Produto produto : itens)
        {
            total += produto.getPreco();
        }
        return total;
    }
}
