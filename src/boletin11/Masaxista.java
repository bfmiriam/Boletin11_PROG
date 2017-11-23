package boletin11;

public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) {
        super(id, nome, apelido, edade);

        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores...");
    }

    public void darMasaxes() {

    }

    @Override
    public String toString() {
        return ("Masaxista: " + super.toString() + "\ntitulacion: " + titulacion + "\nanos de experiencia: " + anosExperiencia);
    }
}
