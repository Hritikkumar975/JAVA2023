//Program number : strings 20
//Program name : Program to find all subsets of a string

class Subsets {

    static void calculateSubsets(String str) {
        int len = str.length();
        int temp = 0;
  

        String subset[] = new String[len * (len + 1) / 2];

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                subset[temp] = str.substring(i, j + 1);
                temp++;
            }

        }

        for (String string : subset) {
            System.out.println(string);

        }
    }

    public static void main(String[] args) {
        String str = "word";
        System.out.println("Given string : " + str);

        // f u n fu fn un fun;

        System.out.println("\nSubset of given string are : ");
        calculateSubsets(str);

    }
}
