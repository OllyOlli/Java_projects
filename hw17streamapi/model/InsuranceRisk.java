package hw17streamapi.model;

import java.math.BigDecimal;
import java.util.List;

public class InsuranceRisk {

    private String code;
    private String name;
    private BigDecimal insuranceAmount;
    private List<InsuranceSubRisk> insuranceSubRisks;

    public InsuranceRisk(String code, String name, BigDecimal insuranceAmount, List<InsuranceSubRisk> insuranceSubRisks) {
        this.code = code;
        this.name = name;
        this.insuranceAmount = insuranceAmount;
        this.insuranceSubRisks = insuranceSubRisks;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public List<InsuranceSubRisk> getInsuranceSubRisks() {
        return insuranceSubRisks;
    }

    public void setInsuranceSubRisks(List<InsuranceSubRisk> insuranceSubRisks) {
        this.insuranceSubRisks = insuranceSubRisks;
    }
}
