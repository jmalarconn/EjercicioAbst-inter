public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("GUITARRA ELECTRICA", 6);
        Violin violin = new Violin("VIOLIN", "CLASICO");

        guitarra.mostrarInformacion();
        guitarra.afinar();
        guitarra.tocar();
        guitarra.conectarInstrumento();

        System.out.println();

        violin.mostrarInformacion();
        violin.afinar();
        violin.tocar();

        guitarra.setNombre("GUITARRA ACUSTICA");
        guitarra.setNumeroCuerdas(12);

        violin.setNombre("VIOLIN ELECTRICO");
        violin.setTipo("MODERNO");

        guitarra.mostrarInformacion();
        guitarra.afinar();
        guitarra.tocar();

        System.out.println();

        violin.mostrarInformacion();
        violin.afinar();
        violin.tocar();
    }
}

