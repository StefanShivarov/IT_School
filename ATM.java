package zad16;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String menu = "Main menu\n1: check balance\n2: withdraw\n3: deposit\n 4: exit\nEnter a choice: ";
        Account[] accounts = new Account[10];
        for(int i = 0; i < accounts.length; i++){
            accounts[i]=new Account(i+1);
        }

        while (true){

            System.out.println("Enter an id: ");
            int id = scanner.nextInt();

            boolean exit = false;
            while(!exit){


                System.out.println(menu);
                int choice = scanner.nextInt();

                switch (choice){

                    case 1:
                        System.out.println("The balance is "+accounts[id].getBalance());
                        break;

                    case 2:
                        System.out.println("Enter an amount to withdraw: ");
                        double withdrawMoney = scanner.nextDouble();
                        accounts[id].withdraw(withdrawMoney);
                        break;

                    case 3:
                        System.out.println("Enter an amount to deposit: ");
                        double depositMoney = scanner.nextDouble();
                        accounts[id].deposit(depositMoney);
                        break;

                    case 4:
                        exit = true;
                        break;
                }
            }
        }

    }
}
