import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    // метод ищет нечётные числа
    public static void findOdd(List<Integer> nums) {
        for (Integer nums1 : nums) {
            if (nums1 % 2 != 0) {
                System.out.println(nums1);
            }
        }
    }
    // метод ищет чётные числа
    public static void findEven(Set<Integer> nums1) {
        for (Integer nums : nums1) {
            if (nums % 2 == 0) {
                System.out.println(nums);
            }
        }
    }


        public static void main (String[]args){
            System.out.println("Дз. Коллекции: сеты и мапы");
            // только нечётные числа в консоль
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            findOdd(nums);
            System.out.println();


            // только чётные числа без повторений в порядке возрастания
            Set<Integer> nums1 = new HashSet<>(List.of(12,1,1,2,3,4,4,5,6,6,7,8));
            List<Integer> numsEven = new ArrayList<>(nums1);
            Collections.sort(numsEven);
            findEven(nums1);


            // 3 задание несовсем правильно объяснено,
            // нужно было написать в проверки(в консоль выводятся слова в единственном экземпляре!!!),
            // я бы вот сейчас сидел и искал бы суток трое как уникальные слова выводить в консоль!!!,
            // я конечно понимаю что мы на английском пишем, но обясняйте пожалуйста по Русски доступно и подробно.
            String term = " УНИКА́ЛЬНЫЙ это единственный в своём роде неповторимый существующий в одном экземпляре ";
            String[] strArray = term.split("\\s+");
            Set<String> unique = new HashSet<>(List.of(" "));;
            for(int i = 0; i < strArray.length ; i++ ) {
                unique.add(strArray[i]);
            }
            System.out.println(unique);


            // 4 задание
            String a = "уникальный повтор повтор повтор";
            Map<String, Long> map = Arrays.stream(a.split(" "))
                    .collect(Collectors
                    .groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(map);
    }
    }
