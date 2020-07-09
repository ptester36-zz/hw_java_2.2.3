public class CreditPaymentService {
    public float calculate(int amount, int month, double percent) {
        double loanRateMonthClear = percent / 12 / 100;                                         // Ставка по кредиту в месяц
        double loanMonth = 1 + loanRateMonthClear;                                              // Заготовка (для формулы расчета коэффициент)
        double loanRateMonth = Math.pow(loanMonth, month);                                      // Ставка в месяц в степени (для формулы расчета коэффициента)
        double coefficient = (loanRateMonthClear * loanRateMonth) / (loanRateMonth - 1);        // Формула расчета коэффициент
        double pay = coefficient * amount;                                                      // Расчет ежемесячного платежа
    return (float) pay;
    }
}
