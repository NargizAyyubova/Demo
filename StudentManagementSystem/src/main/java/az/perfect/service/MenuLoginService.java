/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.config.Config;
import az.perfect.util.InputUtil;
import java.util.Map;

/**
 *
 * @author asus
 */
public class MenuLoginService implements MenuService {

    @Override
    public void process() {
        Map<String, String> users = Config.instance().getUsers();

        // Kullanıcıdan kullanıcı adı ve şifre alınması
        String username = InputUtil.requireText("Username daxil edin: ");
        String password = InputUtil.requireText("Parolu daxil edin: ");

        // Kullanıcı adı kontrolü
        if (users.containsKey(username)) {
            String storedPassword = users.get(username); // Map'ten şifreyi alın

            // Girilen şifre ile kayıtlı şifreyi karşılaştırma
            if (password.equals(storedPassword)) {
                Config.setLoggedIn(true);
            } else {
                System.out.println("Parol sehvdir");
            }
        } else {
            System.out.println("Username tapilmadi");
        }

       
    }
}
