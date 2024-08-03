public class Prac3_7_d {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }
    }

    public static void main(String[] args) {
        Person person = createPerson("Alice", 30);
        System.out.println(person);
        System.out.println("\nThis Practical is made by 23CS046-Kathan Modh");

    }

    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }
}
