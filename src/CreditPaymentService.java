/* Расчет аннуитетного платежа по кредиту
loanAmount - сумма займа
interestRate - годовая процентная ставка
loanTerm - срок займа в месяцах
monthlyPayment - ежемесячный платеж */
public class CreditPaymentService {
    public int calculate(int loanAmount, double iterestRate, int loanTerm) {
        double interestRateMonthly = iterestRate / 12 / 100; // месячная процентная ставка
        int monthlyPayment = (int) (loanAmount * interestRateMonthly * Math.pow((1 + interestRateMonthly), loanTerm) / (Math.pow((1 + interestRateMonthly), loanTerm) - 1));
        return monthlyPayment;
    }
}
