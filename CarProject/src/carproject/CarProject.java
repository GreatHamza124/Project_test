/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carproject;

/**
 *
 * @author Hamza
 */
public class CarProject {
    
    private String name;
    private String model;
    private int age;
    private boolean carEngine;
    
    public CarProject(){
        
    }
    
    public CarProject(String name, String model, int age){
        setName(name);
        setModel(model);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCarEngine() {
        return carEngine;
    }

    public void setCarEngine(boolean carEngine) {
        this.carEngine = carEngine;
    }
    
    public void startEngine(){
        setCarEngine(true);
    }
    
    public void stopEngine(){
        setCarEngine(false);
    }

    


    public static void main(String[] args) {
        CarProject mycar = new CarProject();
        mycar.startEngine();

    }

}
