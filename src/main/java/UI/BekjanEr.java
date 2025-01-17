package UI;

public class BekjanEr {
    public BekjanEr(boolean b, boolean b1) {
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        //Если не будний день или отпуск возвращаем true
        return !weekday || vacation;
    }
    public static void main(String[]args) {
        //примеры проверки
        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(true, false)); //false
        System.out.println(sleepIn(false, true)); // true


    }
}
