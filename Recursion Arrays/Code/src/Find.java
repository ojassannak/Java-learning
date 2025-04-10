import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {18,3,2,1,18,9};
//        System.out.println(find(arr, 18, 0));
//        System.out.println(findIndex(arr, 18, 0));
//        System.out.println(findIndexLast(arr, 18, arr.length-1));
//        findAllIndex(arr, 18, 0 );
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 18, 0, list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr,18, 0));
    }

    static boolean find(int[] arr, int target, int index){
        //Base condition
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr , target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        //Base condition
        if(index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }else {
            return   findIndex(arr , target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        //Base condition
        if(index == -1){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }else {
            return   findIndexLast(arr , target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        //Base condition
        if(index == arr.length){
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }
            findAllIndex(arr , target, index + 1);
    }

    // function calls has different reference variable but pointing to the sames object during recursion
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        //Base condition
        if(index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr , target, index + 1 , list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        //Base condition
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr , target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
