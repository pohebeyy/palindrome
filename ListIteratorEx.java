package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String s = scanner.nextLine();
        List<Character> list = new LinkedList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> a = list.listIterator();
        ListIterator<Character> b = list.listIterator(list.size());
        boolean isPalendrom = true;
        while (a.hasNext()&& b.hasPrevious()){
            if(a.next()!=b.previous()){
                isPalendrom = false;
                break;
            }
        }
        if(isPalendrom){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
