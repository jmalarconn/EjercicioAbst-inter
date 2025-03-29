public class Guitarra extends InstrumentoMusical implements Corriente{
    private int numeroCuerdas;

    public Guitarra(String nombre, int numeroCuerdas) {
        super(nombre);
        this.numeroCuerdas = numeroCuerdas;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    @Override
    public void tocar() {
        System.out.println("TOCANDO LA " + getNombre());
    }
    @Override
    public void afinar() {
        System.out.println("AFINANDO LA " + getNombre() + " CON " + numeroCuerdas + " CUERDAS");
    }
    @Override
    public void conectarInstrumento() {
        System.out.println("CONECTANDO LA " + getNombre() + " A LA CORRIENTE");
    }
}


