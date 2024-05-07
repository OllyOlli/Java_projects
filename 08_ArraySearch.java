package hw08array;

public class ArraySearch {

    /**
     * B
     * <p>
     * <p>
     * Return index of  element in sorted array (from lowest to highest) using linear search If not found return -1;
     *
     * @param arr
     * @param element
     * @return
     */
    //
    public int linearSearch(int[] arr, int element) {
        if (arr != null)
            // Projdeme pole od začátku do konce

            for (int i = 0; i < arr.length; i++) {
                // Porovnáme hledaný prvek s aktuálním prvkem v poli
                if (arr[i] == element) {
                    // Pokud jsou shodné, vrátíme index aktuálního prvku
                    return i;
                }
                // Pokud aktuální prvek je větší než hledaný, přerušíme vyhledávání (pokud je pole seřazené)
                else if (arr[i] > element) {
                    break;
                }
            }
        // Pokud jsme došli až sem, prvek nebyl nalezen, vrátíme -1
        return -1;
    }


    /**
     * BONUS TASK
     * <p>
     * <p>
     * Return index of  element in sorted array (from lowest to highest) using binary search If not found return -1;
     *
     * @param arr
     * @param element
     * @return
     */
    public int binarySearch(int[] arr, int element) {

        int left = 0;
        int right = arr.length - 1;

// Pokud prvek existuje, budeme pokračovat ve vyhledávání
        while (left <= right) {
            // Najdeme střed pole
            int middle = left + (right - left) / 2;

            // Pokud střední prvek je hledaný prvek, vrátíme jeho index
            if (arr[middle] == element) {
                return middle;
            }

            // Pokud střední prvek je menší než hledaný prvek, ignorujeme levou polovinu
            else if (arr[middle] < element) {
                left = middle + 1;
            }

            // Pokud střední prvek je větší než hledaný prvek, ignorujeme pravou polovinu
            else {
                right = middle - 1;
            }
        }

        // Pokuddddd jsme sem došli, prvek nebyl nalezen, vrátíme -1
        return -1;
    }
}
