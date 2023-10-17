


import java.util.Scanner;


class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Main {

    public static void main(String[] args) {

        int num1 = 10;
        double num2 = 3.14;
        char letter = 'A';
        boolean isTrue = true;


        int sum = num1 + 5;
        double product = num1 * num2;

        boolean isGreater = num1 > num2;
        boolean isEqual = num1 == num2;

        boolean logicalResult = isTrue && (num1 < num2 || isTrue);

        if (logicalResult) {
            System.out.println("The logical result is true.");
        } else {
            System.out.println("The logical result is false.");
        }

        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Option 1 selected.");
                break;
            case 2:
                System.out.println("Option 2 selected.");
                break;
            default:
                System.out.println("Invalid option.");
        }


        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        int result = addNumbers(10, 20);
        System.out.println("Result : " + result);


        Person person = new Person();
        person.name = "estifo";
        person.age = 18;
        person.introduce();
    }


    static int addNumbers(int a, int b) {
        return a + b;
    }
}


