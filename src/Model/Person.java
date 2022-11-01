/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aniruddha
 */
public class Person {
    
   private  String name;
    private  String gender;
    private  int age;
    private  long phoneNumber;
    private  String userName;
    private  String password;
    private String role;
//
//    public Person(String name, String gender, int age, long phoneNumber, String userName, String password){
//       this.name = name; 
//       this.gender = gender; 
//       this.age = age; 
//       this.phoneNumber = phoneNumber; 
//       this.userName = userName; 
//       this.password = password; 
//       
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
   
    
}