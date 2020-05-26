/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

/**
 *
 * @author lucas
 */
public class LavarCarro {
  public int CodLavagem;
  public String TipoLavagem;
  public double ValorServiço;
  public double NotaServico;
 
   
    public int getCodLavagem() {
        return CodLavagem;
    }

    public void setCodLavagem(int CodLavagem) {
        this.CodLavagem = CodLavagem;
    }

    public String getTipoLavagem() {
        return TipoLavagem;
    }

    public void setTipoLavagem(String TipoLavagem) {
        this.TipoLavagem = TipoLavagem;
    }

    public double getValorServiço() {
        return ValorServiço;
    }

    public void setValorServiço(double ValorServiço) {
        this.ValorServiço = ValorServiço;
    }

    public double getNotaServico() {
        return NotaServico;
    }

    public void setNotaServico(double NotaServico) {
        this.NotaServico = NotaServico;
    }

    
    
  
}
