import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Converter converter = new Converter();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String exp = scn.nextLine();
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
      
        if (actionIndex == -1) {
            System.out.println("Некорректное выражение");
            return;
        }



        String[] data = exp.split(regexActions[actionIndex]);

        if (data.length != 3) {

        } else {
            throw new RuntimeException("");
        }


       
        if (converter.isRoman(data[0]) == converter.isRoman(data[1])) {
            int a, b;
            
            boolean isRoman = converter.isRoman(data[0]);
            if (isRoman) {
              
                a = converter.romanToInt(data[0]);
                b = converter.romanToInt(data[1]);

            } else {
 
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
            }

            int result = 0;
            if (a < 10 && a > 0 && b < 10 && b > 0) {
                switch (actions[actionIndex]) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    default:
                        result = a / b;
                        break;
                }
               
                if (isRoman) {
 
                    System.out.println(converter.intToRoman(result));
                } else {

                    System.out.println(result);
                }
            }else {
                    System.out.println("Ошибка");
                }
            } else {
                System.out.println("Числа должны быть в одном формате");
            }

    }
}

