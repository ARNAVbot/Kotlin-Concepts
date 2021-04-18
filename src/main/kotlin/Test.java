import ConstructorClassExample.Teacher;
import InheritanceExample.Dog;

public class Test {

    public static void main(String[] args) {
        System.out.println(MyCustomFileName.max(1,2));

        System.out.println(MyCustomFileName.findVolume(2,3));

        Teacher teacher = new Teacher("Deeps", 1);

        Dog dog = new Dog("Puppy", 2);
        dog.bark();
    }
}
