package cz.robodreams.javadeveloper.homeworks.hw19banktransfer;

public class BankServiceProvider {

    public static Bank getBankServiceInstance() {
        return new BankServiceImpl();
    }
}

