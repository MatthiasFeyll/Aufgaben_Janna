
    public static void main(String[] args) {
        Person p1 = new Person("Janna", 19);
        Person p2 = new Person("Matthias", 27);
    }
}

public class Person {
    private String name;
    private int alter;

    public Person(String name, int alter) {
        if (alter > 99) {
            System.out.println("Alter zu hoch");
            System.exit(1);
        }

        this.name = name;
        this.alter = alter;
    }
}
