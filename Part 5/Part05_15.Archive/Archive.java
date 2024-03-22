/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hol
 */
import java.util.Objects;

public class Archive {
    private String name;
    private String ident;
    
    public Archive(String name, String ident) {
        this.name = name;
        this.ident = ident;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        return this.ident.equals(comparedArchive.ident);
    }

    
    public String toString() {
        return this.ident + ":" + " " + this.name;
    }
    
    
    
}
