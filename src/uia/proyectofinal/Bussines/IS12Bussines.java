
package uia.proyectofinal.Bussines;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import uia.proyectofinal.Data.IS12DAO;
import uia.proyectofinal.Domain.Issue;
import uia.proyectofinal.Domain.Proyecto;
import uia.proyectofinal.Domain.Tareas;
import uia.proyectofinal.Domain.Users;


public class IS12Bussines {
    private IS12DAO is12 ;

    public IS12Bussines() {
        is12 = new IS12DAO();
    }
    
    public void addUser (Users user) throws SQLException, Exception{
    if(!(is12.existUser(user))){
    
        is12.addUser(user);
        JOptionPane.showMessageDialog(null,"El usuario se agrego con exito");
    }else{
    

        JOptionPane.showMessageDialog(null,"El usuario ya existe ");
    
    }
    
    
    }
    public void addTarea(Tareas tarea) throws SQLException, Exception{
    
        if(!(is12.existTarea(tarea))){
        
            is12.addTarea(tarea);
        JOptionPane.showMessageDialog(null,"La Tarea se agrego con exito ");
        
        }else{
        
            JOptionPane.showMessageDialog(null,"La Tarea ya existe ");
            
        }
    
    }
    public void addProyecto (Proyecto proyecto)throws SQLException, Exception{
     
        if(!(is12.existProyecto(proyecto))){
      
            is12.addProyecto(proyecto);
            JOptionPane.showMessageDialog(null,"El Proyecto  se agrego con exito");
      }else{
          JOptionPane.showMessageDialog(null,"El Proyecto ya existe ");
        }
    
    }
    public void addIssue(Issue issue) throws SQLException{
        if(!(is12.existIssue(issue))){
            is12.addIssue(issue);
             JOptionPane.showMessageDialog(null,"El Issue  se agrego con exito");
        
        }else{
        
            JOptionPane.showMessageDialog(null,"El Issue ya existe ");
        
        }
   
    }
    public void deleteUser(Users user) throws SQLException, Exception{
        if(!(is12.existUser(user))){
         JOptionPane.showMessageDialog(null,"El usuario no existe ");
        }else{
        JOptionPane.showMessageDialog(null,"El usuario se elimino con exito");
            is12.deleteUser(user);
        }
    
    
    }
     public void deleteTarea(Tareas tarea) throws SQLException, Exception{
        if(!(is12.existTarea(tarea))){
          JOptionPane.showMessageDialog(null,"La Tarea no existe ");
        }else{
        
            is12.deleteTarea(tarea);
        }
    
    
    }
      public void deleteProyecto(Proyecto proyecto) throws SQLException, Exception{
        if(!(is12.existProyecto(proyecto))){
           JOptionPane.showMessageDialog(null,"El Proyecto no existe ");
        }else{
        JOptionPane.showMessageDialog(null,"El Proyecto se elimino con exito");
            is12.deleteProyecto(proyecto);
        }
    
    
    }
      public void deleteIssue(Issue issue) throws SQLException{
        if(!(is12.existIssue(issue))){
           
             JOptionPane.showMessageDialog(null,"El Issue no existe en la DB");
        
        }else{
            is12.deleteIssue(issue);
            JOptionPane.showMessageDialog(null,"El Issue fue eliminado con existo ");
        
        }
   
    }
      public void updateTarea(Tareas tarea) throws SQLException, Exception{
      if(!(is12.existTarea(tarea))){
          
           is12.updateTarea(tarea);
           
          JOptionPane.showMessageDialog(null,"La tarea se actualizo con exito");
        
      }else{
         JOptionPane.showMessageDialog(null,"La tarea  no existe ");
      }
      
      }
      
      public void updateProyecto(Proyecto proyecto) throws SQLException, Exception{
      if(!(is12.existProyecto(proyecto))){
          is12.updateProyecto(proyecto);
          JOptionPane.showMessageDialog(null,"El usuario se actualizo con exito");
          
        
      }else{
           
        JOptionPane.showMessageDialog(null,"El Proyecto no existe ");
      }
      
      }
       public void updateIssue(Issue issue) throws SQLException{
        if(!(is12.existIssue(issue))){
            
                is12.updateIssue(issue);
             JOptionPane.showMessageDialog(null,"El Issue se actualizo correctamente");
        
        }else{
            
            JOptionPane.showMessageDialog(null,"El Issue no existe ");
        
        }
   
    }
      
}

