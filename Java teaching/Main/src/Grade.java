import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the marks = ");
        int marks  = in.nextInt();
        String grade = null;
        //System.out.println(ans);

        switch (marks / 10) {
            case 10, 9, 8 -> grade = "AA";
            case 7 -> grade = "AB";
            case 6 -> grade = "BB";
            case 5 -> grade = "BC";
            case 4 -> grade = "CD";
            case 3 -> grade = "DD";
            case 2 -> grade = "FAIL";
            default -> System.out.println("Enter valid number");
        }
        System.out.println("Grade is " + grade);
//    static String grade(int marks){
//        switch ()if(marks>91 && marks<100){
//            return "AA";
//        }
//        if(marks>81 && marks<90){
//            return "AB";
//        }
//        if(marks>71 && marks<80){
//            return "BB";
//        }
//        if(marks>61 && marks<70){
//            return "BC";
//        }
//        if(marks>51 && marks<60){
//            return "CD";
//        }
//        if(marks>41 && marks<50){
//            return "DD";
//        }
//        if(marks != 40){
//            return "FAIL";
//        }
//        else return "Enter the valid number";
//    }

    }
}
