/* Расчет аннуитетного платежа по кредиту
lA - сумма займа
iR - годовая процентная ставка
lT - срок займа в месяцах
mP - ежемесячный платеж */
public class CreditPaymentService {
    public double calculate(int loanAmount, double iterestRate, int loanTerm) {
        double monthlyPayment;
        double interestRateMonthly = iterestRate / 12 / 100;
        monthlyPayment = loanAmount * interestRateMonthly * Math.pow((1 + interestRateMonthly), loanTerm) / (Math.pow((1 + interestRateMonthly), loanTerm) - 1);
        return monthlyPayment;
    }
}
