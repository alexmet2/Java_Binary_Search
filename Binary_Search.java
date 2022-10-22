import java.util.Arrays;

public class Binary_Search{
    public static void main(String[] args) {
        /*
            Binary Search = Search algorith that fields the position
                            of a target value within a sorted array
                            Half of the array is eliminated during each "step" 

                            runtime complexity: O(log n)
        */
        System.out.println("Integrated Binary Search method");
        int array[] = new int[100];
        int target = 42;
        /* loops through the array */
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        /* calls the integrated Binary Search method */
        int index = Arrays.binarySearch(array, target);
        /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at " + index);
        }
        System.out.println();
        main2();
        main3();
    }
    public static void main2() {

        System.out.println("Our own method with small number of elements");

        int array[] = new int[100];
        int target = 42;
        /* loops through the array */
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        /* calls our own Binary Search method */
        int index = binarySearch(array, target);
        /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at " + index);
        }
        System.out.println();
    }
    public static void main3() {

        System.out.println("Our own method with big number of elements");

        int array[] = new int[1000000];
        int target = 777777;
        /* loops through the array */
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        /* calls our own Binary Search method */
        int index = binarySearch(array, target);
        /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at " + index);
        }
    }
    /* Our own Binary Search method */
    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle: " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; /* target is found */
        }
        return -1; /* target is not found */
    }
}