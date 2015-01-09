package boletin15;

public class entrenador extends futbol {

    String identificacion;

    public entrenador() {
    }

    public entrenador(String identificacion) {
        this.identificacion = identificacion;
    }

    public entrenador(String identificacion, int id, int edade, String nome, String apelidos) {
        super(id, edade, nome, apelidos);
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void dirixirpartido() {
    }

    public void dirixirentrenamiento() {
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }

}
