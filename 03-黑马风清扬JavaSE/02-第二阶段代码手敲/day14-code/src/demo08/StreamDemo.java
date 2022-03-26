package demo08;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author liming
 * @Date 2022/3/26 19:45
 **/

/*
    Stream流的常见生成方式
        1:Collection体系的集合可以使用默认方法stream()生成流
            default Stream<E> stream()
        2:Map体系的集合间接的生成流
        3:数组可以通过Stream接口的静态方法of(T... values)生成流
 */
public class StreamDemo {
    public static void main(String[] args) {
        //Collection体系(2个儿子，List和Set)的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流(间接生成键、值、以及键值对)
        Map<String,Integer> map = new HashMap<String,Integer>();
        Stream<String> keyStream = map.keySet().stream();
        //键所对应的流
        Stream<Integer> valueStream = map.values().stream();
        //值所对应的流
        Stream<Map.Entry<String,Integer>> stream = map.entrySet().stream();
        //键值对对象所对应的流

        //数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] strArray = {"hello","world","java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strA = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);
    }
}
