//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment; // размер ежемесячного платежа
        int loanAmount; // сумма кредита
        double interestRate; //  годовая процентная ставка
        int loanTerm; //  срок займа в месяцах

        loanAmount = 1_000_000;
        interestRate = 9.99;
        loanTerm = 12;
        monthlyPayment = (int)(service.calculate(loanAmount, interestRate, loanTerm));
        System.out.println(monthlyPayment);

        monthlyPayment = (int) (service.calculate(1_000_000, 9.99, 24));
        System.out.println(monthlyPayment);

        monthlyPayment = (int) (service.calculate(1_000_000, 9.99, 36));
        System.out.println(monthlyPayment);

    }
}
