package hw19banktransfer;

import java.math.BigDecimal;

public interface Bank {

    void addAccount(Long id, BigDecimal initialAmount);

    BigDecimal getAccountBalance(Long id);

    int getAccountChanges(Long id);

    void transfer(Long from, Long to, BigDecimal amount);

    void setDurationInMsForTransfer(int milliSeconds);

    int getDurationInMsForTransfer();
}
