package Arrays.Problems;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(RtoI(str));
    }

    static int RtoI(String str) {
        int num = 0;
        String str_temp = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str_temp.charAt(i);
            switch (ch) {
                case 'i':
                    num += 1;

                    break;
                case 'v':
                    if (i > 0 && str_temp.charAt(i - 1) == 'i') {
                        num += 4;
                        i--;
                    } else {
                        num += 5;
                    }

                    break;
                case 'x':
                    if (i > 0 && str_temp.charAt(i - 1) == 'i') {
                        num += 9;
                        i--;
                    } else {
                        num += 10;
                    }

                    break;
                case 'l':
                    if (i > 0 && str_temp.charAt(i - 1) == 'x') {
                        num += 40;
                        i--;
                    } else {
                        num += 50;
                    }

                    break;
                case 'c':
                    if (i > 0 && str_temp.charAt(i - 1) == 'x') {
                        num += 90;
                        i--;
                    } else {
                        num += 100;
                    }

                    break;
                case 'd':
                    if (i > 0 && str_temp.charAt(i - 1) == 'c') {
                        num += 400;
                        i--;
                    } else {
                        num += 500;
                    }

                    break;
                case 'm':
                    if (i > 0 && str_temp.charAt(i - 1) == 'c') {
                        num += 900;
                        i--;
                    } else {
                        num += 1000;
                    }

                    break;

                default:
                    break;
            }
        }

        return num;
    }
}
