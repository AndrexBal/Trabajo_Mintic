
package com.mycompany.reto5.modelo.VO;

/**
 *
 * @author andrex
 */
public class Cliente {
    
    private int id_compra;
    private String Constructores;
    private String Banco;

    public Cliente() {
    }

    public Cliente(int id_compra, String Constructores, String Banco) {
        this.id_compra = id_compra;
        this.Constructores = Constructores;
        this.Banco = Banco;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructores() {
        return Constructores;
    }

    public void setConstructores(String Constructores) {
        this.Constructores = Constructores;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_compra=" + id_compra + ", Constructores=" + Constructores + ", Banco=" + Banco + '}';
    }
    
    
    
    
}
