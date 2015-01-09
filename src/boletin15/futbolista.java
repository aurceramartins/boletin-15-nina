package boletin15;

public class futbolista extends futbol {

    int dorsal;
    String demarcacion;

    public futbolista() {
    }

    public futbolista(int dorsal, String demarcacion, int id, int edade, String nome, String apelidos) {
        super(id, edade, nome, apelidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

  

    public void xogarpartido() {
    }

    public void entrenar() {
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
}
