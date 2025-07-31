package antonio.geek.Entity;

import java.time.LocalDate;

public class Expense {
    private final String label;
    private double amount;
    private LocalDate date;

    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }

    public String getLabel() {
        return label;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    boolean isLargeExpense(){
        return amount > 100;
    }

    public String toString(){
        if(isLargeExpense()){

            return this.label + " " + this.amount + " " + this.date;
        }
        return "erreur le montant doit etre supperieur a 100";
    }
}
