package br.com.InforCar.model;

public class Carro {
    private int id;
    private String modelo;
    private String fabricante;
    private String data_fabricacao;
    private String placa;
    private Double preco;
    
        public Carro (int id, String modelo, String fabricante, String data_fabricacao, String placa, Double preco){
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.data_fabricacao = data_fabricacao;
        this.placa = placa;
        this.preco = preco;
    }
    
        public Carro (){
            
        }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
}
