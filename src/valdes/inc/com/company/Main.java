package valdes.inc.com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = readText();
        String[] ready = divideTextIntoSentences(text);
        showInterrogativeSentences(ready);
    }

    private static String readText() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }

    private static String[] divideTextIntoSentences(String sourceText){
        StringTokenizer stringTokenizer = new StringTokenizer(sourceText,"\n:.!?",true);
        String last = "";
        String current = "";
        String[] interrogativeSentence = new String[0];

        while (stringTokenizer.hasMoreTokens()) {
            last = current;
            current = stringTokenizer.nextToken().trim();

            if (current.equals("?")) {
                String[] interrogativeSentence2 = new String[interrogativeSentence.length + 1];
                System.arraycopy(interrogativeSentence, 0, interrogativeSentence2, 0, interrogativeSentence.length);
                interrogativeSentence2[interrogativeSentence.length] = last+current;
                interrogativeSentence = new String[interrogativeSentence2.length];
                System.arraycopy(interrogativeSentence2, 0, interrogativeSentence, 0, interrogativeSentence.length);
            }
        }
        return interrogativeSentence;
    }

    private static void showInterrogativeSentences(String[] interrogativeSentence) {
        if (interrogativeSentence.length > 0) {
            System.out.println("Список вопросительных предложений:");

            for (int i = 0; i < interrogativeSentence.length; i++) {
                System.out.println(interrogativeSentence[i]);
            }
        } else {
            System.out.printf("Не найдено ни одного вопросительного предложения!");
        }
    }
}

