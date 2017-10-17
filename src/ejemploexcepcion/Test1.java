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
public class Test1 {
    
    public int mA() throws PersonalException{
        return this.mB();
    }
    
//    public int mB() throws IllegalArgumentException{
//        return this.mC(0);
//    }
    
//    public int mB(){
//        try{
//        return this.mC(0);
//        } catch(IllegalArgumentException e){
//            System.out.println("asdf");
//        }
//        return 0;
//    }    
    
    public int mB() throws PersonalException{
        return this.mC(0);
    }   
//    public int mC(int denominador) throws ArithmeticException{
//        return 10/0;
//        return 10/denominador;
//        
//    }
    
    public int mC(int denominador) throws PersonalException{
        if(denominador == 0)
            //throw new ArithmeticException();
            throw new PersonalException("Mi excepcion");
        else
            return 10/denominador;
        
    }
    
    
}
