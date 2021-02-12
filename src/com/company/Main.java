package com.company;

import com.company.modelo.Electrodomestico;
import com.company.modelo.Nevera;
import com.company.modelo.Televisor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        Electrodomestico licuadora = new Electrodomestico(1,"A","Nacional");
        Electrodomestico batidora = new Electrodomestico(2, "C","Importado");
        electrodomesticos.add(licuadora);
        electrodomesticos.add(batidora);
        System.out.println("Los electrodomesticos vendidos tienen las siguientes características: " + electrodomesticos);
        double precioFinalElectrodomesticos=0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            precioFinalElectrodomesticos = precioFinalElectrodomesticos+electrodomestico.getPrecio();
        }
        System.out.println("El valor total de los electrodomesticos vendidos es: " + precioFinalElectrodomesticos);

        ArrayList <Nevera> neveras = new ArrayList<Nevera>();
        Nevera nev1 = new Nevera(3,"C","Importado", 150);
        Nevera nev2 = new Nevera(4,"B","Nacional", 120);
        neveras.add(nev1);
        neveras.add(nev2);
        System.out.println("Las neveras vendidas tienen las siguientes características: " +neveras);
        double precioFinalNeveras=0;
        for (Nevera nevera : neveras){
            precioFinalNeveras = precioFinalNeveras+nevera.getPrecio();
        }
        System.out.println("El valor total de las neveras vendidas es: " + precioFinalNeveras);

        ArrayList <Televisor> televisores = new ArrayList<Televisor>();
        Televisor tv1 = new Televisor(5,"C","Importado", 45, true);
        Televisor tv2 = new Televisor(6,"B","Nacional", 55, false);
        televisores.add(tv1);
        televisores.add(tv2);
        System.out.println("Los televisores vendidos tienen las siguientes características: " + televisores);
        double precioFinalTelevisores=0;
        for (Televisor televisor : televisores){
            precioFinalTelevisores = precioFinalTelevisores+televisor.getPrecio();
        }
        System.out.println("El valor total de los televisores vendidos es: " + precioFinalTelevisores);



    }
}
