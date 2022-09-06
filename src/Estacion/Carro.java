package Estacion;

public class Carro extends Estacionamento{
    protected String cor;
    protected String placa;
    protected int veloci;

    protected  int estcned = 0;
    protected  int noEstcned = 0;

    public void Estacionado(Boolean estacioned, Boolean estacionamentoA) {
        super.estEstacionamento = estacionamentoA;
        super.estacioned = estacioned;
        super.Estacionado();
    }
    public int totEstacioned() {
                return estcned++;
    }
    public int totNoEstacioned(){
        return ++noEstcned;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVeloci() {
        return veloci;
    }

    public void setVeloci(int veloci) {
        this.veloci = veloci;
    }
}
