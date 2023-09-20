/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.config.Config;
import java.util.LinkedList;

/**
 *
 * @author asus
 */
public class MenuShowStudentService implements MenuService{

    @Override
    public void process() {
       LinkedList<Student> list =  Config.instance().getStudents();
       for (Student s: list){
        System.out.println(s);
       }
    }
    
}
