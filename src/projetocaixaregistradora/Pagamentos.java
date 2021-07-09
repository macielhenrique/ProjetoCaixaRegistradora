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
    private String tipoPagamento;
    private int qtdeVendas;
    //construtor
    public Pagamentos(double valorProduto,double valorTotal,String tipoPagamento){
        this.valorProduto=valorProduto;
        this.valorTotal=valorTotal;
        this.tipoPagamento=tipoPagamento;
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
        this.setValorTotal(valorProduto+getValorTotal());
        this.qtdeVendas+=1;
    }

    public double getTroco() {
        return troco;
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
        if(tipoPagamento.equals("dinheiro") && valorRecebido >= getValorTotal()){
            this.troco = valorRecebido-getValorTotal();
        }
        return this.troco;
        
    }
}
