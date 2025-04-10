package strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice(" ", 4);
//        System.out.println(diceRet("" , 4));
        System.out.println(diceFace(" ", 5, 7));
    }

    static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target  ; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p , int target){
        if(target == 0){
            ArrayList<String> list = new  ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new  ArrayList<>();

        for (int i = 1; i <= 6 && i <= target  ; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }

    static ArrayList<String> diceFace(String p , int target, int facw){
        if(target == 0){
            ArrayList<String> list = new  ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new  ArrayList<>();

        for (int i = 1; i <= facw && i <= target  ; i++) {
            list.addAll(diceFace(p + i, target - i ,facw));
        }
        return list;
    }
}
