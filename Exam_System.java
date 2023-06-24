import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Exam_System {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> data = new HashMap<>();

	public void login() {
	    data.put("Gowthami", 1234);
	    data.put("Gowthami", 1146);
	    System.out.println("\n\n-----Welcome to the online exam portal-----");
	    String userId;
	    int password;
	    System.out.println("Login to continue.....");
	    System.out.print("Enter user ID: ");
	    userId = sc.next();
	    System.out.print("Enter password: ");
	    password = sc.nextInt();
	    if (data.containsKey(userId) && data.get(userId) == password) {
	        System.out.println("\nLogin Successful");
	        option();
	    } else {
	        System.out.println("SORRY!!! Invalid Login");
	        System.out.println("Try again");
	        login();
	    }
	}

	public void option() {
	    int select;
	    System.out.println("\nEnter the option you want to perform");
	    System.out.println("1. Update profile and password");
	    System.out.println("2. Start the exam");
	    System.out.println("3. Logout");
	    select = sc.nextInt();
	    switch (select) {
	        case 1:
	            data = update();
	            option();
	            break;
	        case 2:
	            examQuestions();
	            option();
	            break;
	        case 3:
	            System.exit(0);
	            break;
	        default:
	            System.out.println("Invalid entry");
	    }
	}

	public HashMap<String, Integer> update() {
	    String userName;
	    int newPassword;
	    System.out.println("Welcome to Update profile");
	    System.out.println("Enter username");
	    userName = sc.next();
	    if (data.containsKey(userName)) {
	        System.out.println("Enter the new password you want to update for your profile");
	        newPassword = sc.nextInt();
	        data.replace(userName, newPassword);
	    } else {
	        System.out.println("User doesn't exist");
	    }
	    return data;
	}

	public void examQuestions() {
	    long examTime = System.currentTimeMillis();
	    long endTime = examTime + 30;
	    int answerCount = 0;
	    int answer, score;
	    System.out.println("Start the exam");

	    // Questions start from here

	    while (System.currentTimeMillis() < endTime) {
	        System.out.println("You have 30 seconds to answer 5 questions");
	        System.out.println("Each question carries 10 marks, -5 for wrong answer");
	        System.out.println("\nQ1. Which of the following is a valid identifier in Java");
	        System.out.println("\n1) 123variable" + "\t" + "2) _myVariable" + "\t" + "3) break" + "\t" + "4) class");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 2) {
	            answerCount++;
	        }
	        System.out.println("\n\nNumber of primitive data types in Java are?");
	        System.out.println("1) 6" + "\t" + "2) 7" + "\t" + "3) 8" + "\t" + "4) 9");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 3) {
	            answerCount++;
	        }
	        System.out.println("\n\nWho invented the Java programming language?");
	        System.out.println("1) James Gosling" + "\t" + "2) Bjarne Stroustrup" + "\t" + "3) Guido van Rossum" + "\t" + "4) Dennis Ritchie");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 1) {
	            answerCount++;
	        }
	        System.out.println("\n\nWhich one of the following is not a Java feature?");
	        System.out.println("1) Dynamic and Extensible" + "\t" + "2) Portable" + "\t" + "3) Object-oriented" + "\t" + "4) Use of pointers");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 4) {
	            answerCount++;
	        }
	        System.out.println("\n\nWhich of the following is not an OOPS concept in Java?");
	        System.out.println("1) Compilation" + "\t" + "2) Encapsulation" + "\t" + "3) Inheritance" + "\t" + "4) Polymorphism");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 1) {
	            answerCount++;
	        }
	        System.out.println("\n\nAutomatic type conversion is possible in which of the possible cases?");
	        System.out.println("1) Byte to int" + "\t" + "2) Int ti long" + "\t" + "3) Long to int" + "\t" + "4) Short to int");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 2) {
	            answerCount++;
	        }
	        System.out.println("\n\nSelect the valid statement.");
	        System.out.println("1) char[] ch=new char(5)" + "\t" + "2) char[] ch=new char[5]" + "\t" + "3) char[]ch=new char()" + "\t" + "4) char[]ch=new char[]");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 2) {
	            answerCount++;
	        }
	        System.out.println("\n\nArrays in java are?");
	        System.out.println("1) Object references" + "\t" + "2) Objects" + "\t" + "3) Primitive data type" + "\t" + "4) none");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 2) {
	            answerCount++;
	        }
	        System.out.println("\n\nIdentify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class?");
	        System.out.println("1) final" + "\t" + "2) static" + "\t" + "3) volatile" + "\t" + "4) abstract");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 2) {
	            answerCount++;
	        }
	        System.out.println("\n\nIn which of the following is toString() method defined?");
	        System.out.println("1) java.lang.Object" + "\t" + "2) java.lang.string" + "\t" + "3) java.lang.util" + "\t" + "4) none");
	        System.out.println("Enter the correct option");
	        answer = sc.nextInt();
	        System.out.println("Answer Locked...");
	        if (answer == 1) {
	            answerCount++;
	        }
	        
	        break;
	    }
	    System.out.println("You have finished the exam");
	    score = answerCount * 10 - ((5 - answerCount) * 5); // Score Calculation
	    System.out.println("Your score is: " + score + "/125");
	}

	public static void main(String[] args) {
		
	    Exam_System log = new Exam_System();
	    
	    log.login(); // Function calling
	}

}
