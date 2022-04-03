/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author GustavoR
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String nome_vendedor;
        double salario;
        double total_vendas;
        
        System.out.print("\nNome do vendedor:");
        nome_vendedor = input.nextLine();

        System.out.print("\nSalario:");
        salario = input.nextDouble();
        
        System.out.print("Total de vendas:");
        total_vendas = input.nextDouble();
        
        double comissao = total_vendas * 0.15;
        double total_salario = total_vendas + comissao; 
        
        System.out.println("Vendedor " + nome_vendedor + ", Seu salalrio É " + salario + " mais a comissÃo fica "+ total_salario);
        
    }
    
}
