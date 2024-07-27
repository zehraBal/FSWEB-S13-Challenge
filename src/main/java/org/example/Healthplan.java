package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private String name;
    private int id;
    private Plan plan;

    //getter methods
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public Plan getPlan(){
        return plan;
    }

    //setter methods
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setPlan(Plan plan){
        this.plan=plan;
    }

    //constructor
    public Healthplan(String name, int id,Plan plan){
        this.plan=plan;
        this.name=name;
        this.id=id;
    }

    //toString Method
    public String toString(){
        return "name: "+name+" plan: "+plan+" id: "+id;
    }
}
