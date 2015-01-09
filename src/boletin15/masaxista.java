package boletin15;

public class masaxista extends futbol {

    String titulacion;

    public masaxista() {
    }

    public masaxista(String titulacion, int id, int edade, String nome, String apelidos) {
        super(id, edade, nome, apelidos);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void anosexperiencia() {
    }

    public void darmasaxe() {
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
}
