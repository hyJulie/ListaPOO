package Carro;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private  boolean ligado;

    public Carro(String modelo, String marca, int ano, boolean ligado) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar(){
        if (!ligado){
            ligado = true;
            System.out.println("O carro está ligando");
        }else {
            System.out.println("O carro já está ligado");
        }
    }

    public void desligar(){
        if (ligado){
            ligado = false;
            System.out.println("O carro está desligando");
        } else {
            System.out.println("O carro já está desligado");
        }
    }

    public void statusCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }


}
