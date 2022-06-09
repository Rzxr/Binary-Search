public class Main {

    public static void main(String[] args) {
        int key = 100;
        int n = 20;
        int[] sortData = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        binarySearch(sortData, n, key);
    }

    public static void binarySearch(int[] data, int n, int key) {
        int first = 0;
        int last = n - 1;
        int mid = 0;
        boolean found = false;
        int index = 0;

        while (first <= last && found == false ) {
            mid = Math.round((first + last) / 2);

            if (key == data[mid]) {
                index++;
                found = true;
            }
            else if (key < data[mid]){
                index++;
                last = mid - 1;
            }
            else if (key > data[mid]){
                index++;
                first = mid + 1;
            }
        }
        if (found == true) {
            System.out.println(key + " was found in the array with " + index + " comparisons");
        }
        else {
            System.out.println(key + " was not found in the array");
        }
    }
}
