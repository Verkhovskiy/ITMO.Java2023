package Task05;

public class Main {
    public static void main(String[] args) {
        String text1 = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";
        System.out.println(longestWord(text1));

        String word1 = "Шалаш";
        String word2 = "Test";
        System.out.println(isPalindrome(word1));
        System.out.println(isPalindrome(word2));

        String text2 = "Попробуем зацензурировать слово бяка. Получилось? А что будет, если повторить слово бяка?";
        System.out.println(censor(text2, "бяка"));

        String text3 = "Здесь я пытаюсь посчитать сколько раз повторяется этот фрагмент. И повторяется ли этот фрагмент вообще. Возможно этот фрагмент совсем не повторяется?";
        System.out.println(countRepetitions("этот фрагмент", text3));

        System.out.println(reverseWords(text3));
    }
    public static String longestWord(String words) {
        String longest = "";
        String[] split = words.split("[, :'\"-.!?*]");
        for (String word : split) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }
    public static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word.toLowerCase()).reverse();
        return word.toLowerCase().equals(reversed.toString());
    }
    public static String censor(String text, String censoredWord) {
        return text.replaceAll(censoredWord,"[вырезано цензурой]");
    }
    public static int countRepetitions(String subString, String mainString) {
        //Наверно есть способ лучше?
        String replaced = mainString;
        int counter = 0;
        while (replaced.indexOf(subString) != -1) {
            counter++;
            replaced = replaced.replaceFirst(subString, "");
        }
        return counter;
    }
    public static String reverseWords(String words) {
        StringBuilder result = new StringBuilder();
        String[] split = words.split(" ");
        for (String word : split) {
            StringBuilder reversed = new StringBuilder(word).reverse();
            result.append(reversed + " ");
        }
        return result.toString();
    }
}
