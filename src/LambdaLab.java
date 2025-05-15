import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LambdaLab {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5);
        List<String> strings = Arrays.asList("Banana", "apple", "Orange", "pear", "");
        String sentence = "Це приклад речення з кількома словами";

        System.out.println("1. Непарні числа: " + filterOddNumbers(integers));
        System.out.println("2. Середнє значення: " + calculateAverage(doubles));
        System.out.println("3. Сортування рядків по алфавіту: " + sortStringsAlphabetically(strings));
        System.out.println("4. Сума парних чисел: " + sumEvenNumbers(integers));
        System.out.println("5. Факторіал 5: " + factorial(5));
        System.out.println("6. Добуток чисел: " + multiplyElements(integers));
        System.out.println("   Сума чисел: " + sumElements(integers));
        System.out.println("7. Квадрати чисел: " + squareElements(integers));
        System.out.println("8. Сортування рядків за довжиною: " + sortStringsByLength(strings));
        System.out.println("9. Кількість слів у реченні: " + countWords(sentence));
        System.out.println("10. Перший непорожній рядок: " + findFirstNonEmpty(strings));
        System.out.println("11. Чи всі рядки з великої літери: " + allStartWithUpperCase(strings));
        System.out.println("12. Друге за величиною число: " + findSecondLargest(integers));
        System.out.println("13. Найбільше парне число: " + findLargestEven(integers));
    }

    // 1
    public static List<Integer> filterOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    // 2
    public static OptionalDouble calculateAverage(List<Double> list) {
        return list.stream()
                .mapToDouble(Double::doubleValue)
                .average();
    }

    // 3
    public static List<String> sortStringsAlphabetically(List<String> list) {
        return list.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }

    // 4
    public static int sumEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 5
    public static long factorial(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    // 6a
    public static int multiplyElements(List<Integer> list) {
        return list.stream()
                .reduce(1, (a, b) -> a * b);
    }

    // 6b
    public static int sumElements(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 7
    public static List<Integer> squareElements(List<Integer> list) {
        return list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 8
    public static List<String> sortStringsByLength(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    // 9
    public static long countWords(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .filter(s -> !s.isEmpty())
                .count();
    }

    // 10
    public static Optional<String> findFirstNonEmpty(List<String> list) {
        return list.stream()
                .filter(s -> !s.trim().isEmpty())
                .findFirst();
    }

    // 11
    public static boolean allStartWithUpperCase(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty())
                .allMatch(s -> Character.isUpperCase(s.charAt(0)));
    }

    // 12
    public static Optional<Integer> findSecondLargest(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    // 13
    public static Optional<Integer> findLargestEven(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);
    }
}
