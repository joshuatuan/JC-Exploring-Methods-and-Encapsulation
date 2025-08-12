package org.example;
import static  org.example.ParameterPassing.*;
import static  org.example.VarargsExample.*;

public class Main {
    public static void main(String[] args) {
//        // === Exercise 1 ===
//        Car myCar = new Car();
//        myCar.startEngine();
//        String status = myCar.drive(60);
//        System.out.println(status);
//        myCar.turnOffEngine();


        // === Exercise 2 ===
//        int originalValue = 50;
//        System.out.println("Before Method Call: " + originalValue);
//        modifyValue(originalValue);
//        System.out.println("After Method Call: " + originalValue);

//        Student student = new Student();
//        System.out.println("Student before change " + student.name);
//        changeStudentName(student, "Stuart");
//        System.out.println("Student after change " + student.name);


        // === Exercise 3 ===
//        printMessages("Hello", "World");
//        printMessages("Testing", "Varargs", "Here");
//        printMessages();
//        findLargest(20000,4,6,1,299);

        // === Exercise 4 ===
//        Account myAccount = new Account();
//        myAccount.displayAccountDetails();

//        SmartDoor smartDoor = new SmartDoor();
//        System.out.println("Is the door locked? "+ smartDoor.isLocked());
//        smartDoor.lockDoor();
//        System.out.println("Is the door locked? "+ smartDoor.isLocked());
//        smartDoor.unlockDoor();
//        System.out.println("Is the door locked? "+ smartDoor.isLocked());

        // === Exercise 5 ===
//        System.out.println("App Name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());
//        Utility utilInstance = new Utility();
//        System.out.println("Instance ID: " + utilInstance.getInstanceId());
//        System.out.println(Converter.celsiusToFahrenheit(25.0));


        // === Exercise 6 ===
//        Display d = new Display();
//        d.show(42);
//        d.show("Hello");
//        d.show("Goodbye", 3);
//        System.out.println(Converter.fahrenheitToCelsius(77.0));

        // === Exercise 7 ===
//        Pizza pizza1 = new Pizza();
//        pizza1.display();
//
//        Pizza pizza2 = new Pizza("Pepperoni");
//        pizza2.display();
//
//        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
//        pizza3.display();
        // PC stuff

        // === Exercise 8 ===
//        Thermostat stat = new Thermostat(22.5);
//        System.out.println("Initial temp: " + stat.getTemperatureCelsius());
//
//        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
//        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());
//
//        stat.setTemperatureCelsius(25.0); // Set a valid temp
//        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());

        // === Exercise 9 ===
        User user1 = new User();
        user1.setPassword("12345678");
        System.out.println(user1.getPassword());
    }

    // for exercise 2
    public static void changeStudentName(Student student, String newName){
        student.name = newName;
    }
}