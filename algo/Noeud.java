package algo; 
import java.util.*; 

public class Noeud  extends Tableau {

    private String name; 

    public Noeud(){
        super(); 
    }
     
    public Noeud(String name){
        this.name = name; 
    }

    public String getName(){
        return this.name; 
    }
    
    public String toString(){
        return this.name;
    }

}