package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    //constructor
    public Company(int id, String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        if(giro<0) {
            this.giro = 0.0;
        }
        this.giro=giro;
        this.developerNames=developerNames;
    }

    //getter methods
    public int getId(){
        return id;
    }

    public String  getName(){
        return name;
    }

    public double getGiro(){
        return giro;
    }

    public String[] getDeveloperNames(){
        return developerNames;
    }

    //setter methods

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setGiro(double giro){
        this.giro=giro;
    }

    public void setDeveloperNames(String[] developerNames){
        this.developerNames=developerNames;
    }

    //toString method
    public String toString(){
        return "id: "+id+" name: "+name+" giro: "+giro + " developer names: "+ Arrays.toString(developerNames);
    }

    //addEmployee method
    public  void addEmployee(int index,String name){
        if(index<0 || index>=developerNames.length) {
             System.out.println("This index is not defined.");
        }else if(developerNames[index]==null){
            developerNames[index]=name;
        } else if ( developerNames[index]!=null) {
            System.out.println("This index is in use.");
        }

    }

}
