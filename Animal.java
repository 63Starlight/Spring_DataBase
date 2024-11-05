import java.util.Objects;

// Абстрактный класс Animal, который является базовым для всех видов животных
public abstract class Animal {
    private String name; // текстовое поле для имени
    private int age; // числовое поле для возраста

    // Конструктор по умолчанию
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Конструктор с параметрами
    public Animal(String name, int age) {
        this.name = name;
        setAge(age); // проверка и установка возраста
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    // Сеттер для возраста с проверкой диапазона
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Переопределяем метод equals для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age && name.equals(animal.name);
    }

    // Переопределяем метод hashCode для соответствия с equals
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Переопределяем метод toString для информативного вывода
    @Override
    public String toString() {
        return "Animal{name='" + name + ''' + ", age=" + age + '}';
    }
}