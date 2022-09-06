package Estacion;

public class Controle {
    public static void main(String[] args) {

        Carro total = new Carro();

        Carro c1 = new Carro();
        c1.Estacionado(false, false);
        c1.cor = "Verde";
        c1.placa = "43M49E";
        c1.veloci = 150;
        System.out.println("Cor: " + c1.cor);
        System.out.println("Placa: " + c1.placa);
        System.out.println("Velocidade em: " + c1.veloci + "\n");

        Carro c2 = new Carro();
        c2.Estacionado(true, false);
        c2.cor = "Preto";
        c2.placa = "75G55R";
        c2.veloci = 140;
        System.out.println("Cor: " + c2.cor);
        System.out.println("Placa: " + c2.placa);
        System.out.println("Velocidade em: " + c2.veloci + "\n");

        Carro c3 = new Carro();
        c3.Estacionado(true, true);
        c3.cor = "Vermelho";
        c3.placa = "985Y15X";
        c3.veloci = 200;
        System.out.println("Cor: " + c3.cor);
        System.out.println("Placa: " + c3.placa);
        System.out.println("Velocidade em: " + c3.veloci + "\n");

        Carro c4 = new Carro();
        c4.Estacionado(true, true);
        c4.cor = "Cinza";
        c4.placa = "35R54T";
        c4.veloci = 175;
        System.out.println("Cor: " + c4.cor);
        System.out.println("Placa: " + c4.placa);
        System.out.println("Velocidade em: " + c4.veloci + "\n");

        Carro c5 = new Carro();
        c5.Estacionado(false, true);
        c5.cor = "Laranja";
        c5.placa = "14W53C";
        c5.veloci = 240;
        System.out.println("Cor: " + c5.cor);
        System.out.println("Placa: " + c5.placa);
        System.out.println("Velocidade em: " + c5.veloci + "\n");

        Carro c6 = new Carro();
        c6.Estacionado(true, true);
        c6.cor = "Roxo";
        c6.placa = "A666G8";
        c6.veloci = 300;
        System.out.println("Cor: " + c6.cor);
        System.out.println("Placa: " + c6.placa);
        System.out.println("Velocidade em: " + c6.veloci + "\n");

        Carro c7 = new Carro();
        c7.Estacionado(true, false);
        c7.cor = "Preto";
        c7.placa = "75G55R";
        c7.veloci = 140;
        System.out.println("Cor: " + c7.cor);
        System.out.println("Placa: " + c7.placa);
        System.out.println("Velocidade em: " + c7.veloci + "\n");

        Carro c8 = new Carro();
        c8.Estacionado(true, true);
        c8.cor = "Azul";
        c8.placa = "O056L9";
        c8.veloci = 320;
        System.out.println("Cor: " + c8.cor);
        System.out.println("Placa: " + c8.placa);
        System.out.println("Velocidade em: " + c8.veloci + "\n");

        if (c1.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c2.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c3.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c4.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c5.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c6.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c7.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();
        if (c8.estacioned) {
            total.totEstacioned();
        } else total.totNoEstacioned();


        System.out.println("Total de carros estacionados: " + total.totEstacioned());
        System.out.println("Total de carros não estacionados: " + total.totNoEstacioned());



    }

}
