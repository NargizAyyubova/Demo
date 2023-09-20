/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.util;

import az.perfect.config.Config;
import az.perfect.menu.Menu;
import java.util.Scanner;

/**
 *
 * @author hesen
 */
public class MenuUtil {

    public static void showMenu() {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i] != Menu.UNKNOWN) {
                if (m[i] == Menu.LOGIN || m[i] == Menu.REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(m[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(m[i]);
                }
            }
        }
    }

    public static void startMenu() {
        System.out.println("Please select menu: ");
        showMenu();
        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();
        Menu m = Menu.findMenu(selectedMenu);
        m.enumProcess();
    }
}
