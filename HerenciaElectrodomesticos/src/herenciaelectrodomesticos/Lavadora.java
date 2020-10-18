
package herenciaelectrodomesticos;


public class Lavadora extends Electrodomesticos{
   
    //Atributos de la subclase
    private int carga;
    
    
    //Constantes
    private final static int CARGAXDEFECTO=5;
    
    
    //Contructor de los valores por default
    public Lavadora(){
        this(PRECIOXDEFECTO, PESOXDEFECTO, CONSENERXDEFECTO, COLORXDEFECTO, CARGAXDEFECTO);
    }
    

    //Constructor de precio y peso
    public Lavadora(double preciobase, double peso) {
        this(preciobase, peso, CONSENERXDEFECTO, COLORXDEFECTO, CARGAXDEFECTO);
    }
    

    //Constructor con TODOS LOS ATRIBUTOS HEREDADOS Y SUBCLASE
    public Lavadora(double preciobase, String color, char consener, double peso, int carga){
        super(preciobase,color,consener,peso);
        this.carga = carga;
    }
    
    

    //Getter de la subclase
    public int getCarga() {
        return carga;
    }
    
    
    //Precio final de la lavadora
    //Se llama al metodo precioFinal de la clase padre
    @Override
    public double precioFinal(){
        double plus = super.precioFinal();
        
        if(carga>30){
            plus += 50;
        }
        
        return plus;
    }

}
