/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Servico;

/**
 *
 * @author 55349
 */
public class Main
{
    
    public static void main(String[] args){
        String nome = "Juliana";
        System.out.println(nome);
        
        Servico corteFeminino = new Servico(1, "Corte Feminino", 50);
        System.out.println(corteFeminino.getDescricao());
        System.out.println(corteFeminino.getValor());
        
        
        Cliente cliente = new Cliente(1, "Juliana", 'F', "998661736", "Av. Silvio Rugani 1275");
        System.out.println(cliente.getNome());
    }
    
}
