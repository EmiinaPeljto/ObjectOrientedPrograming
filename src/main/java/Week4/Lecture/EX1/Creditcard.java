package Week4.Lecture.EX1;

import Week4.Lecture.EX1.CardIssue;
import Week4.Lecture.EX1.CardType;

import java.util.Date;

public class Creditcard {
    private int cardId;
    private Date issueData;
    private double balance;
    private String cvc;
    private CardType cardType;
    private CardIssue cardIssue;

    public Creditcard(int cardId, Date issueData, double balance, String cvc, CardType cardType, CardIssue cardIssue){
        this.cardId=cardId;
        this.issueData=issueData;
        this.balance=balance;
        this.cvc=cvc;
        this.cardType=cardType;
        this.cardIssue=cardIssue;
    }
    public Creditcard(int balance){
        this.cardIssue = cardIssue;
        this.issueData=new Date();
        this.balance=balance;
        this.cvc="123";
        this.cardType=CardType.CREDIT;
        this.cardIssue=CardIssue.VISA;

    }
    public int getCardId(){
        return this.cardId;
    }
    public void setCardId(int cardId){
        this.cardId=cardId;
    }

    public Date getIssueData() {
        return issueData;
    }

    public void setIssueData(Date issueData) {
        this.issueData = issueData;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardIssue getCardIssue() {
        return cardIssue;
    }

    public void setCardIssue(CardIssue cardIssue) {
        this.cardIssue = cardIssue;
    }

    public void deposit(int amount){
        if (amount<2){
            System.out.println("broke man keep ya dolla.");
        }
        else {
            this.balance+=amount;
        }

    }
    public void deposit(int amount, Date createdAt){

    }

    public void withdrawal (double w) {
        if (w > this.balance) {
            System.out.println("nemas brate");
        } else {
            this.balance -= w;
        }
    }



    public String toString(){
        return "This is a credit card with unique numbers:"
                .concat(String.valueOf(this.cardId))
                .concat("and its balance is: ")
                .concat(String.valueOf(this.balance));
    }
}
