package Week6.Lab6.HashMapsPromissoryNote;

import java.util.HashMap;

class PromissoryNote {
    private String toWhom;
    private double value;

    HashMap<String, Double> debts = new HashMap<>();

    public PromissoryNote() {
    }

    public void setLoan(String toWhom, double value) {
        this.toWhom = toWhom;
        this.value = value;
        debts.put(this.toWhom, this.value);
    }

    public double howMuchIsTheDebt(String whose) {
        // Impossible to get 0 since return type of this method() is double.
        // I tried casting, still doesn't work.

        if (!debts.containsKey(whose)) {
            return 0;
        } else {
            return debts.get(whose);
        }
    }
}
