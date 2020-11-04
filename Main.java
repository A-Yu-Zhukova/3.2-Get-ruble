public class Main {
    public static void main(String[] args) {
        int balance = 250;
        int add = 2000;
        int bonus;
        if (add > 1000){
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int total = balance + add + bonus;
        System.out.println("Бонус");
        System.out.println(bonus);
        System.out.println("Итого на счету");
        System.out.println(total);
    }
}