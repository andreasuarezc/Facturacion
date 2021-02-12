package com.company.modelo;

public class Electrodomestico {
    protected int codigo;
    protected String consumo;
    protected String procedencia;
    protected double precio;

    public Electrodomestico(int codigo, String consumo, String procedencia) {
        this.codigo = codigo;
        this.consumo = consumo;
        this.procedencia = procedencia;
        calcularPrecio();
    }

    public double getPrecio() {
        return precio;
    }

    public void calcularPrecio(){
        switch (consumo){
            case "A": precio = 450000;
            break;
            case "B": precio = 350000;
            break;
            case "C": precio = 250000;
            break;
        }
        switch (procedencia){
            case "Nacional": precio = precio + 250000;
                break;
            case "Importado": precio = precio + 350000;
                break;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo +
                ", consumo='" + consumo + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", precio=" + precio +
                '}';
    }
}
