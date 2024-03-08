package cz.robodreams.javadeveloper.homeworks.hw14filestructure;

//
/*
Naimplementujte adresářovou strukturu tak, jak známe z operačního
systému.
Implementace kořenového adresářového stromu:
Představte si, že máte za úkol implementovat adresářový strom pro
správu souborů a adresářů na vašem počítači. Použijte návrhový vzor
Strategy k definici různých strategií pro třídu reprezentující
manipulaci s obsahem adresáře (např. výpis souborů, hledání souborů,
odstranění souborů atd.).
Dále použijte návrhový vzor Composite k vytvoření stromové struktury,
která umožňuje reprezentovat adresáře jako složité objekty, které mohou
obsahovat soubory a další podadresáře. Každý objekt ve stromě může mít
svou vlastní strategii pro manipulaci s obsahem.
Zde je několik konkrétních úkolů:
Vytvořte třídu File reprezentující soubor. Tato třída by měla mít
metodu pro získání názvu souboru a metodu pro provádění různých operací
souboru, jako je čtení a zápis dat.
Vytvořte rozhraní DirectoryStrategy, které bude obsahovat metody pro
různé strategie manipulace s obsahem adresáře, například výpis souborů,
hledání souborů atd.
Implementujte několik konkrétních strategií, které implementují
rozhraní DirectoryStrategy. Například ListFilesStrategy,
SearchFileStrategy, DeleteFileStrategy, atd.
Vytvořte třídu Directory reprezentující adresář. Tato třída by měla
umožňovat přidávání souborů a podadresářů a také by měla mít možnost
nastavení strategie pro manipulaci s obsahem adresáře.
Vytvořte stromovou strukturu pomocí návrhového vzoru Composite, kde
adresáře a soubory budou reprezentovány jako kompozitní objekty. Strom
by měl obsahovat několik úrovní adresářů a souborů.
Demonstrujte použití vaší implementace tím, že provedete různé
operace, jako je výpis souborů, hledání souborů a odstranění souborů ve
vašem adresářovém stromu pomocí různých strategií.

V rámci úkolu si vytvoříte i package po vzoru předchozích úkolu, do
kterého úkol naimplementujete. Proto tu není odkaz na github.

 */