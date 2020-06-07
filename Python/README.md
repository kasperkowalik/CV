## [Kalkulator.py](kalkulator/kalkulator.py)
Prosty program do w którym wybieramy działanie matematyczne z menu, następnie podajemy dwie liczby i otrzymujemy wynik.
Program waliduje wprowadzone dane i pozwala je poprawić.

## [Scrapper](Scrapper)
[Scrapper_links.py](Scrapper/scrapper_links.py) Program który spobiera linki do wszystkich butów we wskazanej kategorii na stronie *www.eastend.pl* i zapisuje je w pliku .csv  
[Scrapper.py](Scrapper/scrapper.py) Program który sprawdza ceny butów z linków we wcześniej utworzonym pliku .csv prezentując je w formie tabeli w nowym pliku .csv  
  
Przykłady utworzonych plików:  
* [linki_meskie_trampki_08_07_2019.csv](Scrapper/linki_meskie_trampki_08_07_2019.csv) Plik utworzony przez **scrapper_links.py** zawiera linki do wszystkich butów znajdujące sie w kategorii męskie trampki pod linkiem *www.eastend.pl/trampki/oferta#dla=m*  
* [index_08_07_2019.csv](Scrapper/index_08_07_2019.csv) Tabela utworzona przez **scrapper.py** zawierająca nazwę butów, cenę (dwie ceny występują w modelach które promowane są w niższej cenie na portalu *www.domodi.pl*) , datę kiedy zostały pobrane dane, link do butów.
