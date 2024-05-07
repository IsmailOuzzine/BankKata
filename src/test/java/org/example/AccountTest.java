package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private final Account account = new Account();

    @Test
    void testDeposit() {
        account.deposit(1000);
        Assertions.assertEquals(1000, account.getBalance());

        account.deposit(2000);
        Assertions.assertEquals(3000, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(3000);
        account.withdraw(500);
        Assertions.assertEquals(2500, account.getBalance());
    }

    @Test
    void testWithdrawInEmptyAccount() {
        account.withdraw(500);
        Assertions.assertEquals(0, account.getBalance());
    }
}
