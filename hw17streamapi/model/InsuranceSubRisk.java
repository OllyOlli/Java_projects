package cz.robodreams.javadeveloper.homeworks.hw17streamapi.model;

import java.math.BigDecimal;

public class InsuranceSubRisk {

    private String code;
    private String name;
    private BigDecimal insuranceAmount;

    public InsuranceSubRisk(String code, String name, BigDecimal insuranceAmount) {
        this.code = code;
        this.name = name;
        this.insuranceAmount = insuranceAmount;
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
}
