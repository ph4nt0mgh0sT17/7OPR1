package cz.osu;

import cz.osu.banking.BankAccount;
import cz.osu.banking.BankAccountSingleton;
import cz.osu.structures.Vector;
import cz.osu.utils.console.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {
        log.info("The application has started!");

        System.out.println(IntroductionDisplayer.renderIntroduction());

        System.out.println(BankAccountSingleton.getInstance());

        BankAccountSingleton bankAccountSingleton = BankAccountSingleton.getInstance();

        bankAccountSingleton.deposit(60000);

        System.out.println(BankAccountSingleton.getInstance());

        log.info("The application has exited!");
    }
}
