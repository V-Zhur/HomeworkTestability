//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int rechargeAmount = 1100;
        int bonus = 0;
        int finalBalance = 0;

        if (rechargeAmount > 1000) {
            bonus = rechargeAmount / 100;
        }
        finalBalance = initialBalance + rechargeAmount + bonus;

        System.out.println(" Начальный баланс: " + initialBalance + " рублей");
        System.out.println(" Сумма пополнения: " + rechargeAmount + " рублей");
        System.out.println(" Начисленные бонусы: " + bonus + " рублей");
        System.out.println(" Итоговый баланс: " + finalBalance + " рублей");
    }
}