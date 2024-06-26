package sections.section20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Pipelines {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

    Stream<Integer> st1 = list.stream().map(x -> x * 10);
    System.out.println(Arrays.toString(st1.toArray()));

    int sum = list.stream().map(x -> x).reduce(0, Integer::sum);

    List<Integer> newList = list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * 10)
            .toList();

    System.out.println(Arrays.toString(newList.toArray()));
  }
}
