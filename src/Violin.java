class Violin extends InstrumentoMusical {
    private String tipo;

    public Violin(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO EL " + getNombre() + " (" + tipo + ")");
    }

    @Override
    public void afinar() {
        System.out.println("AFINANDO EL " + getNombre() );
    }
}