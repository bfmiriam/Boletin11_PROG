package boletin11;

public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador() {

    }

    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
        super(id, nome, apelido, edade);

        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores...");
    }

    public void xogarPartido() {

    }

    public void entrenar() {

    }

    @Override
    public String toString() {
        return ("Xogador: " + super.toString() + "\ndorsal: " + dorsal + "\ndemarcacion: " + demarcacion);
    }
}
