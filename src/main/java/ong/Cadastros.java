package ong;

public class Cadastros {
    
    private String descricao;
    private String especie;
    private String porte;
    private int numId;

    public Cadastros(String descricao, String especie, String porte, int numId) {
        this.descricao = descricao;
        this.especie = especie;
        this.porte = porte;
        this.numId = numId;
    }

    public Cadastros() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

}
