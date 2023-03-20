package Task09;

import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Collections.addAll(names, "Ann", "Jim", "Ben", "Kate", "Alex", "Bob",
                "Ben", "Ben", "Cole", "Betty", "Betty", "Cole", "Dan", "Ella", "Ella",
                "Ella", "Holly", "Jim", "Alex", "Kate", "Ella", "Liam", "Cole");
        ArrayList<String> filteredNames = new ArrayList<String> (filterDuplicates(names));
        System.out.println(filteredNames);

        /*
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        LinkedList<Integer> numbersLinked = new LinkedList<Integer>();
        populateElements(numbersArray, 1000000);
        populateElements(numbersLinked, 1000000);
        long time1 = getRandomNTimes(numbersArray, 10000);
        System.out.println("Elapsed time for ArrayList: " + time1);
        long time2 = getRandomNTimes(numbersLinked, 10000);
        System.out.println("Elapsed time for LinkedList: " + time2);
        */

        Map<User, Integer> scores = new HashMap<>();
        Random random = new Random();
        for(String name : names) {
            User player = new User(name);
            scores.put(player, random.nextInt(100));
        }
        int score = getScore(scores);
        if (score == -1) {
            System.out.println("Player not found");
        } else {
            System.out.println("This player's score is: " + score);
        }
    }

    public static Collection filterDuplicates(Collection input) {
        Collection uniques = new LinkedHashSet<>(input);
        return uniques;
    }

    public static void populateElements(List<Integer> collection, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            collection.add(i);
        }
    }

    public static long getRandomNTimes (List<Integer> collection, int iterations) {
        Random random = new Random();
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int index = random.nextInt(collection.size());
            int chosenElement = collection.get(index);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        return timeElapsed;
    }

    public static int getScore(Map<User, Integer> scores) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input player's name:");
        String name = scan.nextLine();
        Integer score = -1;

        for (Map.Entry<User, Integer> pair : scores.entrySet()) {
            User pairKey = pair.getKey();
            Integer pairValue = pair.getValue();

            if (name.equals(pairKey.getName())) {
                score = pairValue;
            }
        }
        return score;
    }
}

