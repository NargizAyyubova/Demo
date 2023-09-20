/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Teacher;
import az.perfect.config.Config;
import az.perfect.util.InputUtil;

/**
 *
 * @author asus
 */
public class MenuAddTeacherService implements MenuService {

    @Override
    public void process() {
         String name = InputUtil.requireText("Adi daxil edin");
        String surname = InputUtil.requireText("Soyadi daxil edin");
        int age = InputUtil.requireNumber("Yasi daxil edin");
        String schoolName = InputUtil.requireText("Mekteb adini daxil edin");
        double schoolarship = InputUtil.requireNumber("Tequdunu adini daxil edin");
        Teacher st = new Teacher(name,surname,age,schoolName,schoolarship);
        Config.instance().setTeacher(st);
        Config.save();
    }

}
