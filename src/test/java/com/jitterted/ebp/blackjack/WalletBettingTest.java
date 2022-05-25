package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletBettingTest {

    @Test
    public void walletWithBalance12WhenBet8ThenBalanceIs4() throws Exception {
        Wallet wallet = createWalletWith(12);

        wallet.bet(8);

        assertThat(wallet.balance())
                .isEqualTo(12 - 8);
    }

    @Test
    public void walletWithBalance27Bet7And9ThenBalanceIs11() throws Exception {
        Wallet wallet = createWalletWith(27);

        wallet.bet(7);
        wallet.bet(9);

        assertThat(wallet.balance())
                .isEqualTo(27 - 7 - 9);
    }

    @Test
    public void betFullBalanceThenWalletIsEmpty() throws Exception {
        Wallet wallet = createWalletWith(73);

        wallet.bet(73);

        assertThat(wallet.isEmpty())
                .isTrue();
    }


    private Wallet createWalletWith(int initialAmount) {
        Wallet wallet = new Wallet();
        wallet.addMoney(initialAmount);
        return wallet;
    }

}


