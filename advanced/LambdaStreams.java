/**
 * 08 - LambdaStreams
 * Processes a list with lambdas and the Streams API: filter, map, sort,
 * reduce, group — the modern Java way to handle collections.
 *
 * Concepts: lambdas, filter/map/collect, Optional, groupingBy.
 *
 * Run:
 *   javac LambdaStreams.java
 *   java LambdaStreams
 *
 * Sample output:
 *   Adults: [Ravi, Asha, Meena]
 *   Uppercase: [ASHA, MEENA, RAVI]
 *   Average age: 22.25
 *   By city: {Chennai=[Ravi(22), Bala(16)], Madurai=[Asha(27), Meena(24)]}
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaStreams {

    static class Person {
        String name;
        int age;
        String city;
        Person(String name, int age, String city) {
            this.name = name; this.age = age; this.city = city;
        }
        @Override
        public String toString() { return name + "(" + age + ")"; }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Ravi", 22, "Chennai"),
            new Person("Asha", 27, "Madurai"),
            new Person("Bala", 16, "Chennai"),
            new Person("Meena", 24, "Madurai")
        );

        // 1. Filter + map: names of adults.
        List<String> adults = people.stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println("Adults: " + adults);

        // 2. Uppercase + sorted.
        List<String> upper = adults.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Uppercase: " + upper);

        // 3. Average age via mapToInt + OptionalDouble.
        double avg = people.stream()
                .mapToInt(p -> p.age)
                .average()
                .orElse(0);
        System.out.println("Average age: " + avg);

        // 4. Group by city.
        Map<String, List<Person>> byCity = people.stream()
                .collect(Collectors.groupingBy(p -> p.city));
        System.out.println("By city: " + byCity);
    }
}
