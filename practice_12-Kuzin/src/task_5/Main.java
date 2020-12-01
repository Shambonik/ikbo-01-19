package task_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        System.out.println("Введите название файла (file.txt): ");
        File file = new File(System.getProperty("user.dir") + "\\src\\task_5\\" + in.nextLine());
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                text.append(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
            return;
        }
        System.out.println(getLine(text.toString()));
    }

    private static String getLine(String text){
        StringBuilder  result = getLine(" ", new ArrayList<>(Arrays.asList(text.split(" "))));
        return result.toString();
    }

    private static StringBuilder getLine(String word, ArrayList<String> words){
        if(!word.equals(" ")) words.remove(word);
        if(words.size() == 0) return new StringBuilder(word);
        ArrayList<String> wordsChar = getWordsByFirstChar(word.charAt(word.length()-1), words);
        StringBuilder result = new StringBuilder(word.equals(" ")?"":(word+" "));
        for(String nextWord : wordsChar){
            StringBuilder resGet = getLine(nextWord, new ArrayList<>(words));
            if(!resGet.toString().equals("Error")){
                result.append(resGet);
                return result;
            }
        }
        return new StringBuilder("Error");
    }

    private static ArrayList<String> getWordsByFirstChar(char first, ArrayList<String> words) {
        if(first == ' ') return words;
        ArrayList<String> result = new ArrayList<>();
        for(String word : words){
            if(word.toLowerCase().charAt(0) == first) result.add(word);
        }
        return result;
    }
}
