/**
 * Název úkolu: Správa letiště
 *
 * Úkol: Vytvořte program v jazyce Java pro správu letiště. Tento program bude obsahovat následující koncepty:
 *
 *     Rozhraní:
 *
 *     Vytvořte rozhraní Flight, které bude reprezentovat lety na letišti. Toto rozhraní by mělo obsahovat metody:
 *         String getFlightNumber(): Vrátí číslo letu.
 *         String getDestination(): Vrátí cílové místo letu.
 *         int getPassengerCount(): Vrátí počet cestujících na letu.
 *
 *     Abstraktní třída:
 *
 *     Vytvořte abstraktní třídu AbstractAircraftFlight, která bude implementovat rozhraní Flight. Tato třída bude obsahovat atributy pro číslo letadla a aktuální počet cestujících na palubě. Implementujte metody z rozhraní.
 *
 *     Konkrétní třídy:
 *
 *     Vytvořte několik konkrétních tříd, které dědí od AbstractAircraft:
 *         PassengerPlaneFlight: Tato třída bude reprezentovat osobní letadlo. Může obsahovat atributy jako počet sedadel a třídu letu (první třída, ekonomická třída).
 *         CargoPlaneFlight: Tato třída bude reprezentovat nákladní letadlo. Může obsahovat atributy jako maximální váha nákladu a typ nákladu (např. zboží, potraviny).
 *
 *     Polymorfismus:
 *
 *     Vytvořte seznam letů a proveďte několik operací, jako je zjišťování počtu cestujících na daném letu, výpis informací o letech.
 *
 *     Hlavní program:
 *
 *     Vytvořte hlavní program, který umožní uživateli přidávat nové lety, zjišťovat informace o letech a provádět další operace související s letištní správou.
 */
package cz.robodreams.javadeveloper.homeworks.hw12objectinterfaces;
