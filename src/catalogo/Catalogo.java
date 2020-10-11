
package catalogo;


public class Catalogo {
    
    public static void main(String[] args) {
        
        Menu auto_1 = Menu.getInstance();
        Menu auto_2 = Menu.getInstance();
        
        auto_1.setValue("Toyota Rashford 2016");
        System.out.println(auto_2.getValue());
        //Será la misma instancia gracias a la estructura del Singleton
    }
    
}
