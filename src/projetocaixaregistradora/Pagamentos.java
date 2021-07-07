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
public class Pagamentos {
    //atributos
    private double valorProduto;
    private double valorRecebido;
    private double valorTotal;
    private  double troco;
    private int tipoPagamento;
    private int qtdeVendas;
    //construtor
    //public Pagamentos(double valorCompra,double valorDigitado,double totalValor,double troco,int tipoPagamento){
        
    //}

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
        this.setValorTotal(valorProduto+getValorTotal());
        this.qtdeVendas+=1;
    }
    // metodo para dar o troco
    public double getTroco(double valorRecebido,int tipoPagamento){
        if(tipoPagamento==1 && valorRecebido >= getValorTotal()){
            this.troco = valorRecebido-getValorTotal();
        }
        return this.troco;
        
    }
}
