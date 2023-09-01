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
public class ItemProduto implements Produto {
    private String nome;
    private double preco;
    
    public ItemProduto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String getNome()
    {
        return nome;
    }
    
    @Override
    public double getPreco()
    {
        return preco;
    }
    
}
