/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

/**
 *
 * @author Estudiante
 */
public class EjemploExcepcion {
    
    public EjemploExcepcion(){
        dividebyCero();
    }
    
    double dividebyCero(){
        double result = 0;
        try{
            result = 25/0; 
        } catch(ArithmeticException exception){
                System.out.println("Error aritmetico, no es posible dividir por cero");
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploExcepcion();
        Test1 test1 = new Test1();
        try{
            test1.mA();
        }//catch(IllegalArgumentException e){
//            System.out.println("Error");
//        } 
        catch(PersonalException e){
            System.out.println("Error");
        }
        
        int x=0;
        for(int i=0; i < 10; i++){
            try{
                System.out.println("Anterior excepcion " + i);
                x = i/0;
            }
            catch(ArithmeticException e){
                System.out.println("Despues Excepcion " + i);
            }
//           Error
//           catch(IllegalArgumentException e){
//               System.out.println("Despues Excepcion " + i);
//           }
        }
        
    }
    
}
