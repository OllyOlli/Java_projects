package hw17streamapi.model;

import java.util.List;

public class Client {

    private final Long id;
    private String name;
    private List<InsurancePolicy> insurancePolicies;

    public Client(Long id, String name, List<InsurancePolicy> insurancePolicies) {
        this.id = id;
        this.name = name;
        this.insurancePolicies = insurancePolicies;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InsurancePolicy> getInsurancePolicies() {
        return insurancePolicies;
    }

    public void setInsurancePolicies(List<InsurancePolicy> insurancePolicies) {
        this.insurancePolicies = insurancePolicies;
    }
}
