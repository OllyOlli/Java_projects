package cz.robodreams.javadeveloper.homeworks.hw19banktransfer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements Bank {

    private final Map<Long, BigDecimal> accounts;
    private final Map<Long, Integer> accountChanges;
    private int durationInMsForTransfer;

    public BankServiceImpl() {
        this.accounts = new HashMap<>();
        this.accountChanges = new HashMap<>();
    }

    @Override
    public void addAccount(Long id, BigDecimal initialAmount) {
        accounts.put(id, initialAmount);
    }

    @Override
    public BigDecimal getAccountBalance(Long id) {
        return accounts.get(id);
    }

    @Override
    public int getAccountChanges(Long id) {
        synchronized (accounts.get(id)) {
            return accountChanges.getOrDefault(id, 0);
        }
    }

    @Override
    public void transfer(Long from, Long to, BigDecimal amount) {
        synchronized (accounts.get(from)) {
            synchronized (accounts.get(to)) {
                BigDecimal fromBalance = accounts.get(from);
                BigDecimal toBalance = accounts.get(to);

                if (fromBalance.compareTo(amount) >= 0) {
                    accounts.put(from, fromBalance.subtract(amount));
                    accounts.put(to, toBalance.add(amount));

                    accountChanges.put(from, accountChanges.getOrDefault(from, 0) + 1);
                    accountChanges.put(to, accountChanges.getOrDefault(to, 0) + 1);
                } else {
                    System.out.println("Insufficient funds for transfer");
                }
            }
        }

        try {
            Thread.sleep(durationInMsForTransfer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setDurationInMsForTransfer(int milliSeconds) {
        this.durationInMsForTransfer = milliSeconds;
    }

    @Override
    public int getDurationInMsForTransfer() {
        return durationInMsForTransfer;
    }
}
