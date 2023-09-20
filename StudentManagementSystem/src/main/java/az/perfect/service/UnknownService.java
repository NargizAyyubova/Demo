/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

/**
 *
 * @author asus
 */
public class UnknownService implements MenuService{

    @Override
    public void process() {
        System.out.println("Please select correct menu!!!");
    }
    
}
