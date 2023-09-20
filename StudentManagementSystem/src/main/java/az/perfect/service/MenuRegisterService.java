/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.config.Config;
import az.perfect.util.InputUtil;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asus
 */
public class MenuRegisterService implements MenuService{

    @Override
    public void process() {
       String username = InputUtil.requireText("Istiafdeci adinizi daxil edin");
       String password = InputUtil.requireText("Sifrenizi daxil edin");
       
         if (Config.instance().getUsers().containsKey(username)) {
            System.out.println("Bu istifadeci adi movcutdur.");
        } else if (password.length() < 8) {
            System.out.println("Şifre en az 8 sivmol olmalıdır.");
        } else {
            // Kullanıcı adı benzersiz ve şifre yeterince uzunsa, kullanıcıyı kaydet
            Config.instance().setUsers(username, password);
            Config.save();
            System.out.println("Siz ugurla regist oldunuz");
        }

            
        }
    
    }
    

