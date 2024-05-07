package hw17streamapi;

import cz.robodreams.javadeveloper.homeworks.hw17streamapi.model.Client;
import cz.robodreams.javadeveloper.homeworks.hw17streamapi.model.InsurancePolicy;
import cz.robodreams.javadeveloper.homeworks.hw17streamapi.model.InsuranceRisk;
import cz.robodreams.javadeveloper.homeworks.hw17streamapi.model.InsuranceSubRisk;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors; // Přidání potřebného importu pro Collectors


@Builder
public class ClientsHolder {

    @Singular
    private List<Client> clients;

    /**
     * Vrátí všechny pojistné smlouvy klienta reprezentované entity {@link InsurancePolicy}
     * @param clientId ID klienta
     * @return List smluv
     */
    public List<InsurancePolicy> findInsurancePolicyForClientId(Long clientId) {
        return clients.stream()
                .filter(client -> client.getId().equals(clientId))
                .flatMap(client -> client.getInsurancePolicies().stream())
                .collect(Collectors.toList()); // Oprava: Použití Collectors.toList() pro sběr výsledků
    }

    /**
     * Vrátí všechna pojistná rizika, která má klient sjednaná na všech jeho smlouvách.
     * Pojistné riziko je reprezentováno pomocí {@link InsuranceRisk}
     * @param clientId ID klienta
     * @return List rizik
     */
    public List<InsuranceRisk> findAllInsuranceRiskForClient(Long clientId){
        return clients.stream()
                .filter(client -> client.getId().equals(clientId))
                .flatMap(client -> client.getInsurancePolicies().stream())
                .flatMap(policy -> policy.getInsuranceRisks().stream())
                .collect(Collectors.toList()); // Oprava: Použití Collectors.toList() pro sběr výsledků
    }

    /**
     * Vrátí sumu všech sjednaných dopojištění (reprezentováno pomocí {@link InsuranceSubRisk}) přes všechny klienty.
     * Tj. přes všechny klienty, všechny jejich smlouvy, všechna jejich rizika a všechna jejich podrizika.
     * @return Suma sjednaných dopojištění
     */
    public BigDecimal sumOfAllSubRiskOfClients(){
        return clients.stream()
                .flatMap(client -> client.getInsurancePolicies().stream())
                .flatMap(policy -> policy.getInsuranceRisks().stream())
                .flatMap(risk -> risk.getInsuranceSubRisks().stream())
                .map(InsuranceSubRisk::getInsuranceAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add); // Oprava: Přidání počáteční hodnoty pro redukci
    }

    /**
     * Provede změnu pojistné částky {@param newAmount} u sjednaného rizika dle {@param code}.
     * Riziko je reprezentováno pomocí {@link InsuranceRisk} u všech klientů, kteří mají dané riziko sjednáno.
     * Můžete to nazvat zvýšení pojistného limitu.
     * A tyto změněná rizika vrátí. (u všech, kde došlo ke změně)
     * @param code Kód rizika
     * @param newAmount Nová částka pojistného
     * @return Seznam změněných rizik
     */
    public List<InsuranceRisk> changeAllInsuranceAmountForInsuranceRiskToAllClientsAndReturnChangedInsuranceRisks(String code, BigDecimal newAmount) {
        return clients.stream()
                .flatMap(client -> client.getInsurancePolicies().stream())
                .flatMap(policy -> policy.getInsuranceRisks().stream())
                .filter(risk -> risk.getCode().equals(code))
                .peek(risk -> risk.setInsuranceAmount(newAmount)) // Oprava: Použití metody peek pro změnu pojistné částky
                .collect(Collectors.toList()); // Oprava: Použití Collectors.toList() pro sběr výsledků
    }
}

