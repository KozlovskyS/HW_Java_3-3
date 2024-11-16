/* Расчет аннуитетного платежа по кредиту
lA - сумма займа
iR - годовая процентная ставка
lT - срок займа в месяцах
mP - ежемесячный платеж */
public class CreditPaymentService {
    public double calculate(int lA,double iR,int lT){
        double mP;
        double iRM = iR / 12 /100;
        mP = lA * iRM * Math.pow((1+iRM),lT) / (Math.pow((1+iRM),lT) - 1);
        return mP;
    }
}
