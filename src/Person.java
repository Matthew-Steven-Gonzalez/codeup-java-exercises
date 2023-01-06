public class Person {

    private String name;


    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s!", name);
    }

    public static void main(String[] args) {
        Person doug = new Person("Doug");
        System.out.println(doug.name);
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
