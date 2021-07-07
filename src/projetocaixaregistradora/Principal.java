/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocaixaregistradora;

/**
 *
 * @author Admin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pagamentos c1=new Pagamentos();
       c1.atualizarVenda(15);
       c1.atualizarVenda(20);
        System.out.println( c1.getTroco(50, 1));
    }
    
}
