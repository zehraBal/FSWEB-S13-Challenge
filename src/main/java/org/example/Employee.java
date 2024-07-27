package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private  String email;
    private  String password;
    private  String[] healthPlans;

    //constructor
    public Employee(int id,String fullName,String email,String password,String[] healthPlans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;
    }

    //getter methods
    public String getFullName(){
        return fullName;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getHealthPlans(){
        return Arrays.toString(healthPlans);
    }
    public int getId(){
        return id;
    }

    //setter methods
    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public void setEmail(String email){
            this.email=email;
    }

    public void  setPassword(String password){
        this.password=password;
    }

    public void setHealthPlans(String[] healthPlans){
        this.healthPlans=healthPlans;
    }

    public void setId(int id){
        this.id=id;
    }

    //toString method
    public String toString(){
        return "id: "+id+" fullname: "+fullName+" email: "+email+" password: "+password+" healthplans: "+ Arrays.toString(healthPlans);
    }

    //addhealthplan method
    public void addHealthPlan(int index,String name) {
        if(index<0 || index>=healthPlans.length){
            System.out.println("This index is not defined.");
        }else if(healthPlans[index]==null){
            healthPlans[index]=name;
        }else if(healthPlans[index]!=null){
            System.out.println("This index is in use.");
        }
    }
}
