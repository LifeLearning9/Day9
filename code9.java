import java.util.*; //this is not the optimal approach and it is basic approach u can refer Youtube videos to get optimal solutions

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(",");

        String[][] s4 = new String[s1.length][s1.length]; // 2D array
        boolean[] used = new boolean[s1.length]; // track visited words
        int groupIndex = 0;

        for (int i = 0; i < s1.length; i++) {
            if (!used[i]) {
                int wordIndex = 0;
                s4[groupIndex][wordIndex++] = s1[i];
                used[i] = true;

                for (int j = i + 1; j < s1.length; j++) {
                    if (!used[j] && sorted(s1[i]).equals(sorted(s1[j]))) {
                        s4[groupIndex][wordIndex++] = s1[j];
                        used[j] = true;
                    }
                }
                groupIndex++;
            }
        }

        // Print the 2D array
        for (int i = 0; i < groupIndex; i++) {
            for (int j = 0; j < s4[i].length && s4[i][j] != null; j++) {
                System.out.print(s4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String sorted(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
}
