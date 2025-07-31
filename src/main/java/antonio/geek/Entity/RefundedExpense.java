package antonio.geek.Entity;

import java.time.LocalDate;

public class RefundedExpense extends Expense {
    boolean refunded;

    public RefundedExpense(String label, double amount, LocalDate date, boolean refunded) {
        super(label, amount, date);
        this.refunded = refunded;
    }

    public boolean isRefunded() {
        return refunded;
    }
    public boolean refund(){
        if (!this.refunded){
            refunded=true;
        }
        return refunded;
    }

}
