package ProfModulTest2;

import java.util.*;

public class DopT1 {
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day"};
        System.out.println(Arrays.toString(words));
        int k = 4;
        System.out.println(GetKWords(words, k));
    }

    public static List<Words> GetKWords(String[] words, int k) {

        Map<String, Words> map = new HashMap<>();
        // наполнение мапы
        for (String word : words) {
            Words currentWord = map.get(word);
            if (currentWord == null)
                map.put(word, new Words(word, 1));
            else
                currentWord.cnt++;
        }
        // List<Words> wordList= new ArrayList<>(k);
        List<Words> wordList = new ArrayList<>(map.values());
        //wordList.size(k);
        wordList.sort((o1, o2) -> {
            if (o1.cnt == o2.cnt)
                return o2.word.compareToIgnoreCase(o1.word); // сортировка лексикографическая обратная
            return Integer.compare(o2.cnt, o1.cnt); // сортировка слов по частоте
        });
        List<Words> newWordList = wordList.subList(0, k); // public List subList(int fromIndex, int toIndex)
        return newWordList;
    }
}
class Words {
    String word;
    int cnt;
    public Words(String word, int cnt) {
        this.word = word;
        this.cnt = cnt;
    }
    public String toString() {
        return word;
    }
}


