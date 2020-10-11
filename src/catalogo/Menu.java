package catalogo;

public class Menu {
    private static Menu men;
    private String value;
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        
        if (men == null){
            men = new Menu();
        }
        return men;
    }
    
    public void men(String msg){
        System.out.println(msg);
    }
    
    public void setValue(String msg){
        value = msg;
    }
    
    public String getValue(){
        return value;
    }
}
