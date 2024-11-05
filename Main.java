import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Коллекция для хранения объектов Animal
    private static List<Animal> animals = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Основной метод - точка входа приложения
    public static void main(String[] args) {
        boolean exit = false; // флаг для завершения программы

        while (!exit) {
            showMenu(); // вывод меню
            int choice = scanner.nextInt(); // выбор пользователя
            scanner.nextLine(); // потребление новой строки

            switch (choice) {
                case 1:
                    addNewElement(); // добавление нового элемента
                    break;
                case 2:
                    removeElementByIndex(); // удаление элемента по индексу
                    break;
                case 3:
                    displayAllElements(); // вывод всех элементов на экран
                    break;
                case 4:
                    compareElements(); // сравнение двух элементов
                    break;
                case 5:
                    exit = true; // выход из программы
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    // Метод для отображения меню
    private static void showMenu() {
        System.out.println("1. Add new element");
        System.out.println("2. Remove element by index");
        System.out.println("3. Display all elements");
        System.out.println("4. Compare two elements");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Метод для добавления нового элемента
    private static void addNewElement() {
        System.out.println("Select type: 1. Predator 2. Fish 3. Reptile");
        int type = scanner.nextInt();
        scanner.nextLine(); // потребление новой строки

        switch (type) {
            case 1:
                addPredator(); // добавление хищника
                break;
            case 2:
                addFish(); // добавление рыбы
                break;
            case 3:
                addReptile(); // добавление рептилии
                break;
            default:
                System.out.println("Invalid type.");
        }
    }

    // Метод для добавления Predator
    private static void addPredator() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter prey: ");
        String prey = scanner.nextLine();
        System.out.print("Enter speed: ");
        int speed = scanner.nextInt();
        
        try {
            Predator predator = new Predator(name, age, prey, speed); // создание объекта Predator
            animals.add(predator); // добавление в коллекцию
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод для добавления Fish
    private static void addFish() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter water type: ");
        String waterType = scanner.nextLine();
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        
        try {
            Fish fish = new Fish(name, age, waterType, length); // создание объекта Fish
            animals.add(fish); // добавление в коллекцию
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод для добавления Reptile
    private static void addReptile() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter type: ");
        String type = scanner.nextLine();
        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();
        
        try {
            Reptile reptile = new Reptile(name, age, type, temperature); // создание объекта Reptile
            animals.add(reptile); // добавление в коллекцию
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод для удаления элемента по индексу
    private static void removeElementByIndex() {
        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < animals.size()) {
            animals.remove(index); // удаление элемента
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Метод для вывода всех элементов
    private static void displayAllElements() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the list.");
        } else {
            for (int i = 0; i < animals.size(); i++) {
                System.out.println((i + 1) + ". " + animals.get(i).toString());
            }
        }
    }

    // Метод для сравнения двух элементов в коллекции
    private static void compareElements() {
        System.out.print("Enter first index: ");
        int firstIndex = scanner.nextInt();
        System.out.print("Enter second index: ");
        int secondIndex = scanner.nextInt();

        if (firstIndex >= 0 && firstIndex < animals.size() && secondIndex >= 0 && secondIndex < animals.size()) {
            Animal animal1 = animals.get(firstIndex);
            Animal animal2 = animals.get(secondIndex);
            
            if (animal1.equals(animal2)) {
                System.out.println("Animals are equal.");
            } else {
                System.out.println("Animals are not equal.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }
}