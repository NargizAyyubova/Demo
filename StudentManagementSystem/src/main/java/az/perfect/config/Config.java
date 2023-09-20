/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import az.perfect.util.FileUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author asus
 */
public class Config implements Serializable{

    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();
    private Map<String,String> users = new HashMap<>();

    public Map<String, String> getUsers() {
        return users;
    }

    public void setUsers(String key, String value) {
        this.users.put(key, value);
    }

  
    
    public static Config config = null;//111
    
    public static boolean loggedIn;

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
    
    public static void initialize(){
       Object obj =  FileUtil.readObjectFromFile("sms.obj");
       if(obj instanceof Config){
           config= (Config) obj;
       }
    }
    public static void save(){
        FileUtil.writeObjectToFile(Config.instance(), "sms.obj");    
}

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student s) {
        this.students.add(s);
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher t) {
        this.teachers.add(t);
    }

    public void setTeacher(Teacher st) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

}
