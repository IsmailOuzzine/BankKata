package org.example;

public class App 
{
    public static void main( String[] args )
    {
        AccountService account = new Account();

        try {
            account.deposit(1000);
            Thread.sleep(1000);
            account.deposit(2000);
            Thread.sleep(1000);
            account.withdraw(500);

            account.printStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
