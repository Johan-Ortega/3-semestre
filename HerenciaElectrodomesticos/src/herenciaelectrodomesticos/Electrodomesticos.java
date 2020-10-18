
package herenciaelectrodomesticos;

public class Electrodomesticos {
    
    //Valores por defecto          CONSTANTES
    protected final int PRECIOXDEFECTO = 100;
    protected final String COLORXDEFECTO = "Blanco";
    protected final char CONSENERXDEFECTO = 'F';
    protected final int PESOXDEFECTO = 5;

    //Atributos de la clase padre
    protected double preciobase;
    protected String color;
    protected char consener;
    protected double peso;
    public Electrodomesticos (){
        this(PRECIOXDEFECTO,COLORXDEFECTO,CONSENERXDEFECTO,PESOXDEFECTO);
    }
    
    
    /**Constructor del precio y el peso
    * @param preciobase
    * @param peso
    */
    public Electrodomesticos(double preciobase, double peso) {
        this(preciobase, peso, CONSENERXDEFECTO, COLORXDEFECTO);
    }
    
   
    /**Constructor con TODOS LOS ATRUBUTOS DE LA CLASE PADRE
     * @param preciobase
     * @param color
     * @param consener
     * @param peso
    */
    public Electrodomesticos(double preciobase, String color, char consener, double peso) {
        this.preciobase = preciobase;
        this.color = color;
        comprobarCONSENER(consener);
        comprobarColor(color);
    }
    
    //Metodos privados
    private void comprobarColor(String color){
        //Colores
        String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean encontrado = false;
        
        
        for(int i=0;i<colores.length && !encontrado;i++){
        
            if(colores[i].equals(color)){
                encontrado = true;
            }
        }
        
        if(encontrado){
            this.color=color;
        } else{
            this.color=COLORXDEFECTO;
        }
    }
    
    /**
     * 
     * @param consener 
     */
    
    private void comprobarCONSENER(char consener){
        if(consener>=65 && consener<=70){
            this.consener = consener;
        } else {
            this.consener = CONSENERXDEFECTO;
        }
    }

    public double getPreciobase() {
        return preciobase;
    }
    
    public String getColor() {
        return color;
    }

    public char getConsener() {
        return consener;
    }

    public double getPeso() {
        return peso;
    }

   
    public double precioFinal(){
        double plus=0;
        switch(consener){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
   
        return preciobase+plus;
    }
    
}
