package cz.robodreams.javadeveloper.homeworks.hw21junits;

/*
Zadání dlouhodobého projektu:

        10	Zaimplementovat Objekty a strukturu
        Vydefinovat základní třídy - knihy, uživatele
        přidat Construktory, gettery, settery, Nativní funkce objektu

        11 Zaimplementovat Dědičnost
private protected - package private, public
Overloading, overriding
        super
static vs member variable/ method

        Users:
        Jan Novák,
        Václav Novotný,
        Pavel Dvořák,
        Vladimír Černý,
        Iva Modrá,
        Eva Nová,

        Books:
        William Shakespeare, Kupec benátský, Beletrie
        William Shakespeare, Sen noci svatojánské, Beletrie
        William Shakespeare, Hamlet, Beletrie
        William Shakespeare, Mackbet, Beletrie

        Pavel Herout, Učebnice jazyka Java, Odborné
        Pavel Herout, Java a XML, Odborné
        Ward Brian, How Linux Works, Odborné
        Kali Linux Penetration Testing Bible, Odborné

        Antoine de Saint-Exupéry, Malý princ, Pohádka
        Bohumil Říha, Honzíkova cesta, Pohádka
        Josef Čapek, Povídání o pejskovi a kočičce, Pohádka

    Navrhněte třídy/objekty a naimplementujte:
        a) Zalistovani nové knihy na půjčování
        b) Výpis všech knih, které knihovna půjčuje
        c) Vypis všech volných knih k půjčení
        d) Vytvořte žánr knihy (beletrie, odborné, pohádka) a přiřaďte toto do
        svého návrhu
        e) Půjčení knihy uživatelem (co si půjčuje, čas od kdy do kdy)
        f) Výpis, co má který uživatel půjčené


        12 Zaimplementovat polymorfismus a zapouzdření
        Interface
        Abstraktni třídy
        Dědění interface



13	Zaimplementovat Generika
        přidat další artikl k vypůjčování a to časopisy, noviny. Tvým úkolem je tento požadavek naimplementovat, nejlépe s využitím generik.

        Refaktorujte třídu Library tak, aby byla generická. Měla by být schopná pracovat s libovolným typem objektů (nejen knihami).
        *     Umožněte třídě Library pracovat s různými typy knih nebo jiných objektů (například časopisy) pomocí generik.
        *     A tyto objekty nasledně vytvořtě.
        *     Upravte metodu displayBooks tak, aby byla generická a mohla zobrazovat různé typy objektů uložených v knihovně.

        Noviny:
        MF DNES, Seriózně-populární tisk
        Hospodářské noviny, Poloseriózní
        Deník, Seriózně-populární tisk
        Deník N, Poloseriózní
        E15, Poloseriózní

        Časopisy:
        IT systems
        Security World
        ChannelWorld
        CIO
        Security


        14
        Zaimplementovat návrhové vzory
        Creation - singleton, Builder
        Structural - Composite
        Behavior - strategy, observer

        15
        Zaimplementovat vlastní výjimky
        Bude využito vyjímek pro nestandartní situace běhu programu

        16
        Zaimplementovat funkce
        Využijete function a stream api
        Lambda výraz
        Consumer, Predicate, Supplier

        17
        Naimplementujte metody, které budou extrahovat data ze složitějšího modelu.
        Cílem je implementovat map, flatmap, stream, filtr, peek, collect, tolist, tomap, reduce.

        19
        Zaimplementovat, provádět paralelně převody (s využitím vláken), a to tak, aby nedošlo k deadlock

        Využijete vlákno
        Knihovna bude umet prijmout rezervaci na knihu pres sit.
        Tzn. Vytvorite server  v ramci knihovny, ktery prijme rezervaci a clienta ktery tuto rezervaci bude umet poslat.

        20
        Zaimplementovat networking a multivláknost
        Knihovna bude umet prijmout rezervaci na kniho pres sit. Tzn. Vytvorite server  v ramci knihovny, ktery prijme rezervaci a clienta ktery tuto rezervaci bude umet poslat.

        21
        Pokrýt projekt JUnit testy minimálně na coverage 10 % a ověřit pokrytí

 */

