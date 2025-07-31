package antonio.geek.Entity;

import java.time.LocalDate;

public class RecurringExpense extends Expense {
    private Reccurence reccurence;

    @Override
    public String toString() {
        return "RecurringExpense{" +super.toString() + ", reccurence=" + reccurence + '}';

    }

    public RecurringExpense(String label, double amount, LocalDate date, Reccurence reccurence) {
        super(label, amount, date);
        this.reccurence = reccurence;
    }

    public Reccurence getReccurence() {
        return reccurence;
    }


}
