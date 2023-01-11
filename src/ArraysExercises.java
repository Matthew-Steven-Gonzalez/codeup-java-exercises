import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] group = {new Person("Monica"), new Person("Chandler"), new Person("Ross")};

         group = addPerson(group, new Person("Rachel"));

        for( Person member : group){
            System.out.println(member.getName());
        }
        group = addPerson(group, new Person("Phoebe"));

        for( Person member : group){
            System.out.println(member.getName());
        }
    }

    public static Person[] addPerson(Person[] array, Person newestPerson){
        Person[] newPerson = Arrays.copyOf( array , array.length + 1);
        newPerson[newPerson.length -1] = newestPerson;
        return newPerson;
    }


}
