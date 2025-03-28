class DemoMetodoGenerico {
    // Meetodo geneerico para comparar dos arreglos del mismo tipo
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        // Si las longitudes son diferentes, los arreglos no son iguales
        if (x.length != y.length)
            return false;

        // Comparar cada elemento uno a uno
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) 
                return false; // Son diferentes
        }
        return true; // Son iguales
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        System.out.println("Comparaciones:");
        System.out.println("nums es igual a nums: " + igualArrays(nums, nums));  // Siempre seraa trueee
        System.out.println("nums es igual a nums2: " + igualArrays(nums, nums2));
        System.out.println("nums es igual a nums3: " + igualArrays(nums, nums3));
        System.out.println("nums es igual a nums4: " + igualArrays(nums, nums4));

        // Comparacioon con Double (descomentando esto daría un error de compilacion)
        // Double dvals[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        // System.out.println("nums es igual a dvals: " + igualArrays(nums, dvals));
    }
}
