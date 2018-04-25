import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by gouzhijun
 * on 2018/4/18
 */
public class Test {
    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        };
        TreeSet<Person> set = new TreeSet<Person>(comparator);
        set.add(new Person(1));
        set.add(new Person(2));
        System.out.println("result : " + set);
    }

    public static class Person {
        public Person(int age) {
            this.age = age;
        }
        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    '}';
        }
    }
}
