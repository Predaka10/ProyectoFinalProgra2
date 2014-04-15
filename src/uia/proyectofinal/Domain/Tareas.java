

package uia.proyectofinal.Domain;

import java.util.ArrayList;
import java.util.logging.Logger;


public class Tareas {
    
  
     private  ArrayList<String> asignacion;
     private String user;
    private String cod_proyect;
     private Issue issues;

    public Tareas() {
    }

    /**
     * @return the asignacion
     */
    public ArrayList<String> getAsignacion() {
        return asignacion;
    }

    /**
     * @param asignacion the asignacion to set
     */
    public void setAsignacion(ArrayList<String> asignacion) {
        this.asignacion = asignacion;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCod_proyect() {
        return cod_proyect;
    }

    public void setCod_proyect(String cod_proyect) {
        this.cod_proyect = cod_proyect;
    }

   

    /**
     * @return the proyec
     */
   
    /**
     * @return the issues
     */
    public Issue getIssues() {
        return issues;
    }

    /**
     * @param issues the issues to set
     */
    public void setIssues(Issue issues) {
        this.issues = issues;
    }

  

    
    
    
    
}
