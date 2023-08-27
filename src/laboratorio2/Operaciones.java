package laboratorio2;

public class Operaciones {
   private float numero1;
   private float numero2;

   public Operaciones(float numer1, float numer2){
       numero1 = numer1;
       numero2 = numer2;
   }
   
    public float getNumero1() {
        return numero1;
    }
    
    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }
    
    public float getNumero2() {
        return numero2;
    }
    
    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    public float Sumar(){
        return numero1 + numero2;}
    
    public float Restar(){
        return numero1 - numero2;}
    
    public float Multiplicar(){
        return numero1 * numero2;}
    
    public float Dividir(){
        return numero1 / numero2;}        
}