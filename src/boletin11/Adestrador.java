package boletin11;

public class Adestrador extends Seleccion {

    private String idFederacion;

    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {
        super(id, nome, apelido, edade);

        this.idFederacion = idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores...");
    }

    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {

    }

    @Override
    public String toString() {
        return ("Adestador: " + super.toString() + "\nid Federacion: " + idFederacion);
    }
}
