class Person {
    // Поля класу
    private String name;
    private int age;
    private String profession;

    // Конструктор для ініціалізації полів
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Метод для виведення інформації про особу
    public void printInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    // Метод для зміни професії
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public static void main(String[] args) {
        // Створення об'єктів класу Person
        Person john = new Person("John", 30, "Інженер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 35, "Лікар");

        // Виведення інформації про осіб
        john.printInfo();
        mary.printInfo();
        bob.printInfo();

        // Створення ще одного об'єкта для Alice
        Person alice = new Person("Alice", 28, "Архітектор");
        alice.printInfo();

        // Оновлення професії Alice
        alice.setProfession("Дизайнер");

        // Виведення оновленої інформації про Alice
        System.out.println("\n(Після оновлення професії)");
        alice.printInfo();
    }
}

