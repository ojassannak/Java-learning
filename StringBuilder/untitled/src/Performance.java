public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            series += ch;
            System.out.println(series);

            // this eaxample createing new object every time with n roation so this is not a good code beacuse
            // it wasting the memory and last ans will have the ref variable and last ans will
            // not refer t oprev object.
            // t ooptimazie the process we can do change in the original object untill we gat the answer
            // For that we use Data tyape called StringBuilder

        }
    }
}
