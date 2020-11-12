package zad14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account_Test {

    public static void main(String[] args) throws Exception {

        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("12/11/2020");
        account.setDateCreated(date);

        System.out.println(account.toString());
    }
}
