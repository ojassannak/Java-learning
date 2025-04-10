public class NumberExampleRecursion {
    public static void main(String[] args) {
        //Write a funvtion that takes in a numberand prints it
        //print frst 5 numbers 1,2,3,4,5

        print(1);
    }

    static void print(int n){
        //base conditon
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and an agin, you can treat it as seprate call in the stack
        //This is called tail recursion
        //This the last funvtion call
        print(n + 1);
    }
}
