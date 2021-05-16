# Zadání _Pokojové rostliny_

## Model dat &mdash; pokojová rostlina

Připravte třídu pro ukládání informací o pokojových rostlinách (_plant_).
1. U každé rostliny budeme mít uložen: 
    - název (_name_), 
    - datum, kdy byly zasazena (_planted_),
    - datum poslední zálivky (_watering_)
    - běžnou frekvenci zálivky ve dnech (_frequency of watering_)
2. Vytvořte tři konstruktory:
    - jeden pro nastavení všech atributů
    - druhý nastaví jako poznámku prázdný řetězec a datum poslední zálivky nastaví na dnešní datum.
    - třetí nastaví totéž co druhý a&nbsp;navíc výchozí frekvenci zálivky na 7 dnů a&nbsp;datum zasazení na dnešní 
        datum. (Uživatel tedy bude zadávat pouze název rostliny.)
3. Vytvořte výchozí přístupové metody pro všechny atributy.
4. Připravte metodu `getWateringInfo()`, která vrátí název květiny, 
    datum poslední zálivky a datum doporučené další zálivky.
5. Vytvořte třídu seznam rostlin, která bude mít jako parametr 
    kolekci instancí třídy pokojová rostlina.

## Ošetření vstupů a výjimky

1. Vytvořte novou třídu výjimek s názvem `PlantException`.
    Bude potomkem (extends) třídy `Exception`.
2. Ošetřete zadávání frekvence zálivky &mdash; pokud je parametrem 0 nebo záporné číslo,
    systém vyhodí výjimku třídy `PlantException` s&nbsp;vhodným popisem.
3. Obdobně ošetřete zadávání data poslední zálivky &mdash; nesmí být starší než datum zasazení rostliny.

## Vytvoření seznamu květin

1. Vytvořte třídu pro ukládání seznamu pokojových květin.
2. Přidejte metody pro přidání nové květiny, získání květiny na zadaném pořadí
    a&nbsp;odebrání květiny ze seznamu.

## Načtení ze souboru
1. Přidejte do seznamu květin metodu pro načtení květin ze souboru.
    - V&nbsp;případě chybného vstupu vraťte výjimku `ParseException`.
2. Přidejte do seznamu květin metodu pro uložení aktualizovaného seznamu do souboru.

## Ověření
1. Načtěte seznam květin ze souboru [kvetiny.txt](src/Plants/kvetiny.txt).
2. Vypište na obrazovku informace o&nbsp;zálivce pro všechny květiny.
2. Přidejte dvě nové květiny do seznamu. Jednu květinu odeberte.
3. Uložte seznam květin do nového souboru a&nbsp;ověřte, že je jeho obsah správný.
    Výsledný soubor by měl vypadat takto:  [vystup.txt](vzor_vystup.txt).
4. Vyzkoušejte opětovné načtení vygenerovaného souboru. 
