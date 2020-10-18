
package herenciaelectrodomesticos;


public class Television extends Electrodomesticos{
    
    //Atributos de la subclase
    private int resolucion;
    private boolean sintonizadortdt;
    
    //Atributo por default
    private final static int RESOLUCIONXDEFECTO = 20;

    //Constructor por defecto
    public Television(){
        this(PRECIOXDEFECTO, PESOXDEFECTO, CONSENERXDEFECTO, COLORXDEFECTO, RESOLUCIONXDEFECTO, false);
    }
    
    //Constructor del precio y peso de la clase padre
    public Television(double preciobase, int peso) {
        this(preciobase, peso, CONSENERXDEFECTO, COLORXDEFECTO, RESOLUCIONXDEFECTO, false);
    }

    //Constructor con TODOS LOS ATRIBUTOS
    public Television(int resolucion, boolean sintonizadortdt, double preciobase, String color, char consener, int peso) {
        super(preciobase, color, consener, peso);
        this.resolucion = resolucion;
        this.sintonizadortdt = sintonizadortdt;
    }

    //Getters de la subclase
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadortdt() {
        return sintonizadortdt;
    }

    //Se llama al metodo precioFinal de la clase padre
    @Override
    public double precioFinal(){
        double plus = super.precioFinal();
        
        if(resolucion>40){
            plus += preciobase*0.3;
        }
        if(sintonizadortdt){
            plus +=50;
        }
        return plus;
    }
}
