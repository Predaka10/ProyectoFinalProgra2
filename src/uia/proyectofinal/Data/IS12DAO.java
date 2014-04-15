/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia.proyectofinal.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uia.proyectofinal.Conecciones.MySQLDB;
import uia.proyectofinal.Domain.Issue;
import uia.proyectofinal.Domain.Proyecto;
import uia.proyectofinal.Domain.Tareas;
import uia.proyectofinal.Domain.Users;


/**
 *
 * @author Bryan
 */
public class IS12DAO {

    private MySQLDB mysql;

    public void addUser(Users user) throws SQLException {
        mysql = new MySQLDB();
        String sql = "insert into usuarios (Usuario , Contraseña,Puesto)" + "values" + "('" + user.getUser() + "','" + user.getPass() + "', '" + user.getPuesto() + "')";
        mysql.execute(sql);
        mysql.closeExecute();

    }

    public void addTarea(Tareas tarea) throws SQLException {
        mysql = new MySQLDB();
        Users user = new Users();
        String sql = "insert into tareas (Usuario, asignacion,cod_proyecto,Nombre_Issue)" + "values" + "('" +tarea.getUser()+ "','" + tarea.getAsignacion() + "','"+tarea.getCod_proyect()+"','"+tarea.getIssues().getNombre()+"')";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public void addProyecto(Proyecto proyecto) throws SQLException {
        mysql = new MySQLDB();

        String sql = "insert into proyectos (cod_proyecto, nombre_proyecto)" + "values" + "('" + proyecto.getCodigo().toString() + "','" + proyecto.getNombre() + "')";
        mysql.execute(sql);
        mysql.closeExecute();

    }
    public void addIssue(Issue issue) throws SQLException{
        mysql = new MySQLDB();
        String sql = "insert into issues (Nombre_Issue,Descripcion)" + "values" + "('" + issue.getNombre()+ "','"+issue.getDescripcion()+"')";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public void deleteUser(Users user) throws SQLException {
        mysql = new MySQLDB();
        String sql = "delete from usuarios where Usuario = '" + user.getUser() + "'";
        mysql.execute(sql);
        mysql.closeExecute();

    }

    public void deleteTarea(Tareas tarea) throws SQLException {
        mysql = new MySQLDB();
        Users user = new Users();
        String sql = "DELETE FROM tareas where usuario = '" +tarea.getUser()+ "'";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public void deleteProyecto(Proyecto proyecto) throws SQLException {
        mysql = new MySQLDB();
        String sql = "delete from tareas where cod_proyecto = '" + proyecto.getCodigo() + "'";
        mysql.execute(sql);
        mysql.closeExecute();

    }
    public void deleteIssue(Issue issue) throws SQLException{
    mysql = new MySQLDB();
        String sql = "delete from issues where Nombre_Issue ='"+issue.getNombre()+"'";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public void updateUser(Users user) throws SQLException {
        mysql = new MySQLDB();
        String sql = "update usuarios set Contraseña ='" + user.getPass() + "' where Usuario ='" + user.getUser() + "'";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public void updateTarea(Tareas tarea) throws SQLException {
        mysql = new MySQLDB();
        Users user = new Users();
        String sql = "update tareas set asignacion ='" + tarea.getAsignacion() +"', cod_proyecto ='"+tarea.getCod_proyect()+"', Nombre_Issue ='"+tarea.getIssues().getNombre()+"' where Usuario ='" + tarea.getUser()+ "'";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public void updateProyecto(Proyecto proyecto) throws SQLException {
        mysql = new MySQLDB();
        String sql = "update proyectos set nombre_proyecto ='" + proyecto.getNombre() + "'  where cod_proyecto ='" + proyecto.getCodigo() + "'";
        mysql.execute(sql);
        mysql.closeExecute();

    }
    public void updateIssue(Issue issue) throws SQLException{
    mysql = new MySQLDB();
        String sql = "update from issues set Descripcion ='"+issue.getDescripcion()+"' where Nombre_Issue ='"+ issue.getNombre()+"'";
        mysql.execute(sql);
        mysql.closeExecute();
    }

    public boolean existUser(Users user) throws SQLException {

        boolean exist = false;
        mysql = new MySQLDB();
        String sql = "select * from usuarios where Usuario='" + user.getUser() + "'";
        ResultSet res = mysql.executeQuery(sql);
        if (res.next()) {
            exist = true;
        }
        mysql.closeExecuteQuery();
        return exist;

    }

    public boolean existTarea(Tareas tarea) throws SQLException {
        boolean exist = false;
        mysql = new MySQLDB();
        Users user = new Users();
        String sql = "select *from tareas where usuario ='" + user.getUser() + "'";
        ResultSet res = mysql.executeQuery(sql);
        if (res.next()) {
            exist = true;
            
        }
        mysql.closeExecuteQuery();

        return exist;
    }

    public boolean existProyecto(Proyecto proyecto) throws SQLException {

        boolean exist = false;
        mysql = new MySQLDB();

        String sql = "select *from proyectos where usuario ='" + proyecto.getCodigo() + "'";
        ResultSet res = mysql.executeQuery(sql);
        if (res.next()) {
            exist = true;
        }
        mysql.closeExecuteQuery();

        return exist;
    }

    public boolean existIssue(Issue issue) throws SQLException {

        boolean exist = false;
        mysql = new MySQLDB();
        String sql = "select *from issues where Nombre_Issue='" + issue.getNombre() + "'";
        ResultSet res = mysql.executeQuery(sql);
        if (res.next()) {
            exist = true;
        }
        mysql.closeExecuteQuery();
        return exist;

    }
    
}
