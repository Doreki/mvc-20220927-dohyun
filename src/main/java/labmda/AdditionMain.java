package labmda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AdditionMain {

    public static void main(String[] args) {
        Addition addition = new Addition() {
            @Override
            public int add(int[] numbers) {
                int result = 0;
                for (int number : numbers) {
                    result += number;
                }
                return result;
            }
        };

        Addition addition2 = numbers -> {
            int result = 0;
            for (int number : numbers) {
                result += number;
            }
            return result;
        };

        BiFunction<Integer[], Integer[], Integer> addition3 = (nums1, nums2) -> {
            int result = 0;
            for (int number : nums1) {
                result += number;}
            for (int number : nums2) {
                result += number;
            }
            return result;
        };

        BiFunction<Integer, Integer, Integer> addition4 = (num1, num2) -> num1 + num2;


        int result1 = addition.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("결과1: " + result1);

        int result2 = addition2.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("결과2: " + result2);

        int result3 = addition3.apply(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("결과3: " + result3);

        Integer result4 = addition4.apply(1, 2);
        System.out.println("result4 = " + result4);

    }
}
