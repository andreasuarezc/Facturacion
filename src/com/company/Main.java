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

        Electrodomestico nev1 = new Nevera(3,"C","Importado", 150);
        Electrodomestico nev2 = new Nevera(4,"B","Nacional", 120);
        electrodomesticos.add(nev1);
        electrodomesticos.add(nev2);

        Electrodomestico tv1 = new Televisor(5,"C","Importado", 45, true);
        Electrodomestico tv2 = new Televisor(6,"B","Nacional", 55, false);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);

        double totalTelevisor=0;
        double totalNevera=0;
        double totalElectrodomesticos=0;
        int cantidad = 0;
        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico instanceof Televisor){
                totalTelevisor+=electrodomestico.getPrecio();
                cantidad++;
            }else if (electrodomestico instanceof Nevera){
                totalNevera+=electrodomestico.getPrecio();
                cantidad++;
            }else{
                totalElectrodomesticos+=electrodomestico.getPrecio();
                cantidad++;
            }
        }
        System.out.println("El valor total de los televisores vendidos es: " + totalTelevisor);
        System.out.println("El valor total de los neveras vendidos es: " + totalNevera);
        System.out.println("El valor total de los otros electrodomesticos vendidos es: " + totalElectrodomesticos);
        System.out.println("La cantidad total de electrodomesticos vendidos es: " + cantidad);

        /*ArrayList <Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
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
        System.out.println("El valor total de los televisores vendidos es: " + precioFinalTelevisores);*/



    }
}
