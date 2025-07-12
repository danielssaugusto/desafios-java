# 🧠 Java Challenges for Beginners

This is a self-contained Java project file that includes 5 beginner-friendly programming challenges. You can compile and run it directly from your terminal or IDE.

---

## 📋 Challenges Included

All challenges are accessible through a menu in the terminal:

1. **Calculator** – Perform arithmetic operations.
2. **Prime Number Checker** – Check if a number is prime.
3. **Vowel Counter** – Count vowels in a sentence.
4. **Guess the Number Game** – Try to guess a random number.
5. **Temperature Converter** – Convert between Celsius and Fahrenheit.

---

## 🚀 How to Run

1. Save the content of this file (code section below) into a file named `JavaChallenges.java`.

2. Compile it:

```bash
javac JavaChallenges.java
```

3. Run it:

```bash
java JavaChallenges
```

---

## 🧠 What You'll Practice

* Variables and types
* `if`, `switch`, loops (`for`, `while`)
* Methods and modularization
* Scanner (user input)
* Logic and problem solving

---

## 💻 Java Code (copy & paste into `JavaChallenges.java`)

```java
import java.util.Scanner;
import java.util.Random;

public class JavaChallenges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== Java Challenges Menu ===");
            System.out.println("1. Calculator");
            System.out.println("2. Prime Number Checker");
            System.out.println("3. Vowel Counter");
            System.out.println("4. Guess the Number Game");
            System.out.println("5. Temperature Converter");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (option) {
                case 1:
                    calculator(scanner);
                    break;
                case 2:
                    primeChecker(scanner);
                    break;
                case 3:
                    vowelCounter(scanner);
                    break;
                case 4:
                    guessGame(scanner);
                    break;
                case 5:
                    temperatureConverter(scanner);
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);

        scanner.close();
    }

    static void calculator(Scanner scanner) {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter an operator (+ - * /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        double result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b != 0) result = a / b;
                else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }

    static void primeChecker(Scanner scanner) {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    static void vowelCounter(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine().toLowerCase();

        int count = 0;
        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }

        System.out.println("Number of vowels: " + count);
    }

    static void guessGame(Scanner scanner) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != number);
    }

    static void temperatureConverter(Scanner scanner) {
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            double result = (temp - 32) * 5 / 9;
            System.out.printf("Result: %.2f°C\n", result);
        } else if (unit == 'F') {
            double result = (temp * 9 / 5) + 32;
            System.out.printf("Result: %.2f°F\n", result);
        } else {
            System.out.println("Invalid unit.");
        }
    }
}
```

---

## 📄 License

MIT License © \[Your Name or GitHub Username]

---

Happy coding! 🚀
