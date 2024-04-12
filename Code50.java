// Date:30-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code50
//Completing #50codes is a big milestone for me. It's not just about completing the code, but understanding it and writing my own version of
public class Code50 {
    public static void main(String[] args) {
        // Check if a number is 10
        int number = 10;
        if (number == 10) {
            System.out.println("The number is 10.");
        }

        // Check if score is not 100
        int score = 85;
        if (score != 100) {
            System.out.println("You didn't get a perfect score.");
        }

        // Check if age is less than 21
        int age = 18;
        if (age < 21) {
            System.out.println("You are not old enough to drink.");
        }

        // Check if points are greater than 0
        int points = 5;
        if (points > 0) {
            System.out.println("You have more than zero points!");
        }

        // Check if temperature is at or below freezing
        int temperature = 32;
        if (temperature <= 32) {
            System.out.println("It might be freezing. Consider wearing a coat.");
        }

        // Check if salary meets the minimum requirement
        int salary = 50000;
        if (salary >= 50000) {
            System.out.println("You meet the minimum income requirement.");
        }

        // Evaluate grades based on marks
        int marks = 75;
        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D Grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B Grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+ Grade");
        } else {
            System.out.println("Invalid marks");
        }
    }

}
