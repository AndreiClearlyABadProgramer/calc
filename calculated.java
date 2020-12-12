import java.util.Scanner;

public class calculated {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String digit1 = in.next();
        int num1 = Arab(digit1);
        if(num1 == 0){
            System.out.println("error");
            System.exit(0);}
        String s = in.next();
        String digit2 = in.next();


        int num2 = Arab(digit2);
        int rom1 = Roman(digit1);
        int rom2 = Roman(digit2);
        int calc = 0;
        if (num1 == 0 || num2 == 0) {
            System.out.println("error");
        } else {
            if (rom1 != rom2) {
                System.out.println("error, there can only be used either arabic or roman numbers");
            } else {
                if (s.equals("+")) {
                    calc = num1 + num2;
                }

                if (s.equals("-")) {
                    calc = num1 - num2;
                }

                if (s.equals("*")) {
                    calc = num1 * num2;
                }
                if (s.equals("/")) {
                    calc = num1 / num2;
                }
            }
        }
        if (rom1 == 1 && rom2 == 1) {
            if (calc == 100)
                System.out.print("C");
            else {
                while (calc / 90 != 0) {
                    System.out.print("XC");
                    calc -= 90;
                }
                while (calc / 50 != 0) {
                    System.out.print("L");
                    calc -= 50;
                }
                while (calc / 40 != 0){
                    System.out.print("XL");
                    calc -= 40;
                }
                while (calc / 10 != 0){
                    System.out.print("X");
                    calc -= 10;
                }
                while (calc / 9 != 0){
                    System.out.print("IX");
                    calc -= 9;
                }
                while (calc / 8 != 0){
                    System.out.print("VIII");
                    calc -= 8;
                }
                while (calc / 7 != 0){
                    System.out.print("VII");
                    calc -= 7;
                }
                while (calc / 6 != 0){
                    System.out.print("VI");
                    calc -= 6;
                }
                while (calc / 5 != 0){
                    System.out.print("V");
                    calc -= 5;
                }
                while (calc / 4 != 0){
                    System.out.print("IV");
                    calc -= 4;
                }

                while (calc / 1 != 0){
                    System.out.print("I");
                    calc -= 1;
                }
            }

        }
        else if(rom1 == 0 && rom2 == 0){
            System.out.println(calc);
        }
    }


    public static int Arab(String digit) {
        switch (digit) {
            case "I":  return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            case "1": return 1;
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            default: return 0;

        }
    }
    public static int Roman(String rom) {
        switch (rom) {
            case "I":  return 1;
            case "II": return 1;
            case "III": return 1;
            case "IV": return 1;
            case "V": return 1;
            case "VI": return 1;
            case "VII": return 1;
            case "VIII": return 1;
            case "IX": return 1;
            case "X": return 1;
            case "1": return 0;
            case "2": return 0;
            case "3": return 0;
            case "4": return 0;
            case "5": return 0;
            case "6": return 0;
            case "7": return 0;
            case "8": return 0;
            case "9": return 0;
            case "10": return 0;
            default: return 10;

        }
    }
}

