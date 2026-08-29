
/**
 * Collections
 */

import java.util.*;

public class Lecture_16_collections {
    public static void main(String[] args) {

        // 1. Array List
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(2);
        nums.add(1);

        System.out.println(nums); // [1, 2, 3, 4, 4]
        System.out.println(nums.get(1));

        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());

        nums.remove(1);
        System.out.println(nums);

        for (int val : nums) {
            System.out.println("val = " + val);
        }

        // 2. Hash Set
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(10);
        s.add(11);
        System.out.println(s); // [10, 11]

        // 3. Tree Set
        Set<Integer> tSet = new TreeSet<>();
        tSet.add(14);
        tSet.add(14);
        tSet.add(6);
        tSet.add(99);
        tSet.add(99);
        System.out.println(tSet); // [6, 14, 99]

        // 4. Hash Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "alice");
        map.put(2, "bob");
        map.put(3, "john");
        map.put(4, "kesy");
        System.out.println(map); // {1=alice, 2=bob, 3=john, 4=kesy}

        System.out.println(map.get(3)); // john

        System.out.println(map.keySet()); // [1, 2, 3, 4]
        System.out.println(map.values()); // [alice, bob, john, kesy]

        Collection<String> values = map.values();
        System.out.println(values); // [alice, bob, john, kesy]

        for (int rollNo : map.keySet()) {
            System.out.println(rollNo + " : " + map.get(rollNo));
        }

        System.out.println(map.get(12)); // null

        System.out.println(nums.size());
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
