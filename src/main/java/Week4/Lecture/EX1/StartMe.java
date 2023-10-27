package Week4.Lecture.EX1;

import Week4.Lecture.EX1.CardIssue;
import Week4.Lecture.EX1.CardType;
import Week4.Lecture.EX1.Creditcard;

import java.util.Date;

public class StartMe {
    public static void main(String[] args) {
        Creditcard creditCard=new Creditcard(10,new Date(System.currentTimeMillis()),100,"123", CardType.CREDIT, CardIssue.VISA);
        Creditcard avdosCard = new Creditcard(1233);
        Creditcard amkesCard = new Creditcard(1334444455, new Date(12,12,2022), 21, "123", CardType.DEBIT, CardIssue.VISA);

        amkesCard.withdrawal(20);
        amkesCard.deposit(1222222);
        System.out.println(amkesCard.getBalance());

    }
}
