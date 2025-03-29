public abstract class InstrumentoMusical {
    protected String nombre;

    public InstrumentoMusical(){

    }
    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tocar();
    public abstract void afinar();

    public void mostrarInformacion(){
        System.out.println("INSTRUMENTO: " + nombre);
    }
}
