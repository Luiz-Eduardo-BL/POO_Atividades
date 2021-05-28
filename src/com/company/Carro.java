package com.company;

public class Carro {
    private int Passageiros;
    private int Combustivel;
    private int Quilometragem;
    private boolean embarcar;
    private boolean desembarcar;
    private boolean dirigir;
    private boolean abastecer;
    private int distancia;
    private int quantidade;

    public Carro() {
    }

    public Carro(boolean embarcar, boolean desembarcar, boolean dirigir, boolean abastecer, int distancia, int quantidade) {
        this.embarcar = embarcar;
        this.desembarcar = desembarcar;
        this.dirigir = dirigir;
        this.abastecer = abastecer;
        this.distancia = distancia;
        this.quantidade = quantidade;
    }

    public int getPassageiros() {
        return Passageiros;
    }

    public int getCombustivel() {
        return Combustivel;
    }

    public int getQuilometragem() {
        return Quilometragem;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
