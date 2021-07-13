/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocaixaregistradora;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Pagamentos {
    //atributos
    //valor digitado pelo caixa
    private double valorProduto;
    //valor que o cliente entrega
    private double valorRecebido;
    // valor total de todas as vendas
    private double valorTotal;
    // atributo para receber o troco
    private  double troco;
    // a forma de pagamento
    private String tipoPagamento;
    // quantidade de vendas
    private int qtdeVendas;
 
    //construtor
    public Pagamentos(String tipoPagamento,double valorTotal,int qtdeVendas){
        this.tipoPagamento=tipoPagamento;
        this.valorTotal=valorTotal;
        this.qtdeVendas=qtdeVendas;
        
    }
    //sobrecarregando o construtor
    public Pagamentos(){
        
    }
   

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    
    public void atualizarVenda (double valorProduto){
        this.setValorTotal(valorProduto+this.getValorTotal());
        this.qtdeVendas++;
    }

   
    public void setTroco(double troco) {
        this.troco = troco;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getQtdeVendas() {
        return qtdeVendas;
    }

    public void setQtdeVendas(int qtdeVendas) {
        this.qtdeVendas = qtdeVendas;
    }
    
    // metodo para dar o troco
    public double getTroco(double valorRecebido,String tipoPagamento){
        if(tipoPagamento.equals("Dinheiro") && valorRecebido >= getValorTotal()){
            this.troco = valorRecebido-getValorTotal();
           
        }
        return this.troco;
        
    }
}
