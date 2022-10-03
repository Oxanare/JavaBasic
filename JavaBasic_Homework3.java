<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 4d2adeeb49375dd3ee74eb13c95dd6ac69159d83
/**
 * Java Basic. Homework Nr.3
 *
 * @author Oxana
 * todo 12.09.2022
 * date 03.10.2022
 */
class JavaBasic_Homework3 {
    public static void main (String[] args) {
        // task 1
        int[] array = {7, 3, 12, -5, 54, 0};
        printArray(array);

        // task 2
        int max = getMax(array);
        System.out.println("Max = " + max);

        // task 3
        int[] invArray = {0, 0, 0, 1, 1, 1};
        printArray(invArray);
        printArray(invertArray(invArray));
    }
    static void printArray(int[]array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int[] invertArray(int[]array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }
        return result;
    }
<<<<<<< HEAD
=======
=======
/**
 * Java Basic. Homework Nr.3
 *
 * @author Oxana
 * todo 12.09.2022
 * date 03.10.2022
 */
class JavaBasic_Homework3 {
    public static void main (String[] args) {
        // task 1
        int[] array = {7, 3, 12, -5, 54, 0};
        printArray(array);

        // task 2
        int max = getMax(array);
        System.out.println("Max = " + max);

        // task 3
        int[] invArray = {1, 0, 0, 1, 1, 1};
        printArray(invArray);
        printArray(invertArray(invArray));
    }
    static void printArray(int[]array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int[] invertArray(int[]array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 1) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }
        return result;
    }
>>>>>>> 9cdf1f71e7f9bac11104bff1656dcad8c1b575e2
>>>>>>> 4d2adeeb49375dd3ee74eb13c95dd6ac69159d83
}