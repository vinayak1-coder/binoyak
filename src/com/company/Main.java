package com.company;
class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
     public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Main {
    public static void main(String[] args) {
        employee vin = new employee();
        vin.setName("vinayak");
        vin.salary = 2344556;
        System.out.println(vin.getName());
        System.out.println(vin.getSalary());
    }
}