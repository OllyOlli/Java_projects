package cz.robodreams.javadeveloper.homeworks.hw17streamapi.model;

import java.util.List;

public class InsurancePolicy {

    private final Long insuranceNumber;
    private List<InsuranceRisk> insuranceRisks;

    public InsurancePolicy(Long insuranceNumber, List<InsuranceRisk> insuranceRisks) {
        this.insuranceNumber = insuranceNumber;
        this.insuranceRisks = insuranceRisks;
    }

    public Long getInsuranceNumber() {
        return insuranceNumber;
    }

    public List<InsuranceRisk> getInsuranceRisks() {
        return insuranceRisks;
    }

    public void setInsuranceRisks(List<InsuranceRisk> insuranceRisks) {
        this.insuranceRisks = insuranceRisks;
    }
}
