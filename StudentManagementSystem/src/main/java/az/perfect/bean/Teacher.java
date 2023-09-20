/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author hesen
 */
public class Teacher extends Person {

    private String schoolName;
    private double salary;

    public Teacher(String name, String surname, int age, String schoolName, double salary) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.salary = salary;
    }

    public Teacher() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return  "name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge() + ", schoolName=" + schoolName + ", salary=" + salary ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    

}
