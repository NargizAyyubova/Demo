/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.config.Config;
import az.perfect.util.InputUtil;

/**
 *
 * @author asus
 */
public class MenuAddStudentService implements MenuService {

    @Override
    public void process() {
        String name = InputUtil.requireText("Adi daxil edin");
        String surname = InputUtil.requireText("Soyadi daxil edin");
        int age = InputUtil.requireNumber("Yasi daxil edin");
        String schoolName = InputUtil.requireText("Mekteb adini daxil edin");
        double salary = InputUtil.requireNumber("Emek haqqisini daxil edin");
        Student st = new Student(name,surname,age,schoolName,salary);
        Config.instance().setStudents(st);
        Config.save();
    }

}
