public class looping {
    public static void main(String[] args) {
        System.out.println("Output 'Saya semangat belajar Java' sebanyak 10 baris");
        // Output "Saya semangat belajar Java" sebanyak 10 baris
        for (int i = 0; i < 10; i++) {
            System.out.println("Saya semangat belajar Java");
        }

        System.out.println();

        // Looping deret angka: 2 4 6 8 10 10
        System.out.println("Looping deret angka: 2 4 6 8 10 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Looping deret angka: 9 6 3 0 -3 -6
        System.out.println("Looping deret angka: 9 6 3 0 -3 -6");
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Looping perkalian dengan output: 5 x 6 = 30, 5 x 7 = 35, ..., 5 x 10 = 50
        System.out.println("Looping perkalian dengan output: 5 x 6 = 30, 5 x 7 = 35, ..., 5 x 10 = 50");
        for (int i = 6; i <= 10; i++) {
            int result = 5 * i;
            System.out.println("5 x " + i + " = " + result);
        }

        System.out.println();

        // Looping deret angka: 1 3 6 10 15 21 28 36
        System.out.println("Looping deret angka: 1 3 6 10 15 21 28 36");
        int[] sequence = {1, 3, 6, 10, 15, 21, 28, 36};
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }

        System.out.println();
    }
}