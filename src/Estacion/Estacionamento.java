package Estacion;

import java.lang.reflect.Method;

public class Estacionamento {

    protected boolean estacioned;
    protected boolean estEstacionamento;


    public void Estacionado(){
        if (estacioned){
            System.out.println("O carro está estacionado.");
        } else System.out.println("Não está estacionado.");
        if (estEstacionamento){
            System.out.println("Está no estacionamento.");
        } else System.out.println("Não está no estacionamento.");


    }
}

