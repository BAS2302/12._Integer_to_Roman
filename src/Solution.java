class Solution {
    String solution = "";
    int number = 0;
    public String intToRoman(int num) {
        this.number = num;
        while ( number > 0) {

            if (number - 1000 >= 0) {
                countRoman(number, "M", 1000);
            } else if (number - 500 >= 0) {
                countRoman(number, "D", 500);
            } else if (number - 100 >= 0) {
                countRoman(number, "C", 100);
            } else if (number - 50 >= 0) {
                countRoman(number, "L", 50);
            } else if (number - 10 >= 0) {
                countRoman(number, "X", 10);
            } else if (number - 5 >= 0) {
                countRoman(number, "V", 5);
            } else if (number - 1 >= 0) {
                countRoman(number, "I", 1);
            }
        }
        solution = solution.replaceAll("DCCCC", "CM").replaceAll("LXXXX", "XC").replaceAll("VIIII", "IX");


        return solution.replaceAll("CCCC", "CD").replaceAll("XXXX", "XL").replaceAll("IIII", "IV");

    }

    public String countRoman(int number, String roman, int devider) {

        int count = 0;
        while (number > 0) {
            if (number - devider >= 0) {
                number -= devider;
                count++;
            } else break;
        }
        this.number = number;
            for (int i = 0; i < count; i++) {
                solution += roman;
            }

        return solution;

    }
}
