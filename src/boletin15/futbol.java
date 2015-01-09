package boletin15;

public class futbol {

    private int id, edade;
    private String nome, apelidos;

    public futbol() {
        super();
    }

    public futbol(int id, int edade, String nome, String apelidos) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelidos = apelidos;
    }

    public void concentrarse() {
        System.out.println("concentrarse seleccion");
    }

    public void viaxar() {
        System.out.println("viaxa a seleccion");
    }
}
