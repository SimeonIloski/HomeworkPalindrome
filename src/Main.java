

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Deque<String> listStrings;

        // filling the deque with strings  for test
        listStrings=fillListStrings();

        //filling the deque with integers for test
        Deque<Integer> listInteger;
        listInteger=fillListIntegers();

        //filling the deque with custom create class (object from CustomClass)
        Deque<CustomClass> listCustomClass;
        listCustomClass=fillListCustomClass();

        //call the method isPalindrome to check is the list(deque) a palindrome(first equlas to last element and so on) for 3 deques with different element types

        // boolean b=isPalindrome(listStrings);
       // boolean b=isPalindrome(listInteger);
        boolean b=isPalindrome(listCustomClass);

        if(b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }


    }

    /**
     * Method which check if a list is palindrome (first element equals to last and so on) which can accept generic type
     * **/

    private static  boolean isPalindrome(Deque<?> list){
        boolean b=false;
        while(!list.isEmpty()) {
            if (list.size() > 1) {
                if (list.removeFirst().equals(list.removeLast())) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            } else {
                b = true;
                list.remove();
            }
        }
        return b;

    }





/**
 * Method which returns degue(linkedlist) of type string
 * **/
    private static LinkedList<String> fillListStrings() {
        LinkedList<String> list=new LinkedList<>();
        list.add("Hello");
        list.add("Zdravo");
        list.add("Zdravo");
        list.add("Hello");
        return list;
    }

 /**
         * Method which returns degue(linkedlist) of type Integers
 * **/
    private static LinkedList<Integer> fillListIntegers() {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(2));
        list.add(new Integer(1));
        return list;
    }

    /**
     * Method which returns degue(linkedlist) of custom created type
     * **/
    private static LinkedList<CustomClass> fillListCustomClass() {
        LinkedList<CustomClass> list=new LinkedList<>();
        list.add(new CustomClass("1","2"));
        list.add(new CustomClass("3","4"));
        list.add(new CustomClass("5","5"));
        list.add(new CustomClass("3","4"));
        list.add(new CustomClass("1","2"));
        return list;
    }
}

