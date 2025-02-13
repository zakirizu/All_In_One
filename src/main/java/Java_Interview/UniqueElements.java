package Java_Interview;
public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20, 10, 30, 10};
        findUniqueElements(arr);
    }

    public static void findUniqueElements(int[] arr) {
        System.out.println("Unique elements in the array:");
        
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
