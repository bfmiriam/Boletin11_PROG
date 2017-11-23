package boletin11;

public class boletin11 {

    public static void main(String[] args) {

        Seleccion pers = new Seleccion(12, "Saul", "Lopez", 20);
        System.out.println(pers.toString());
        pers.concentrarse();
        pers.viaxar();

        Xogador xog = new Xogador(13, "Sergio", "Alvarez", 23, 3, "asd");
        System.out.println(xog.toString());
        xog.concentrarse();
        pers.viaxar();

        Adestrador ad = new Adestrador(9, "Adrián", "Martínez", 25, "665");
        System.out.println(ad.toString());
        ad.concentrarse();
        ad.viaxar();

        Masaxista mas = new Masaxista(3, "Roberto", "Lopez", 19, "fisioterapeuta", 4);
        System.out.println(mas.toString());
        mas.concentrarse();
        mas.viaxar();

        Seleccion xoga = new Xogador(13, "Sergio", "Alvarez", 23, 3, "asd");
        System.out.println(xoga.toString());

    }

}
