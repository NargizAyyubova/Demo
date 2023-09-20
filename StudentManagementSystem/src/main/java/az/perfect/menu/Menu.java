/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.menu;

import az.perfect.util.MenuUtil;
import az.perfect.service.MenuAddStudentService;
import az.perfect.service.MenuAddTeacherService;
import az.perfect.service.MenuExitService;
import az.perfect.service.MenuLoginService;
import az.perfect.service.MenuRegisterService;
import az.perfect.service.MenuService;
import az.perfect.service.MenuShowStudentService;
import az.perfect.service.MenuShowTeacherService;
import az.perfect.service.UnknownService;

/**
 *
 * @author hesen
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()),
    ADD_TEACHER(4, "Add teacher", new MenuAddTeacherService()),
    SHOW_TEACHER(5, "Show all teacher", new MenuShowTeacherService()),
    SHOW_STUDENT(6, "Show all students", new MenuShowStudentService()),
EXIT(7, "Exit", new MenuExitService()),
    UNKNOWN(new UnknownService());

    private Menu(MenuService service) {
        this.service = service;
    }

    private Menu(int number, String text, MenuService service) {
        this.text = text;
        this.number = number;
        this.service = service;
    }

    @Override
    public String toString() {
        return number + "." + text;
    }

    public void enumProcess() {
        service.process();
        MenuUtil.startMenu();
    }

    public static Menu findMenu(int selectedMenu) {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i].number == selectedMenu) {
                return m[i];
            }
        }
        return UNKNOWN;
    }

    private String text;
    private int number;
    private MenuService service;
}
