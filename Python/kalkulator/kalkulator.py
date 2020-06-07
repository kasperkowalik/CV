import math

def menu():
    print("Funkcje:\n"
          "1 - Dodawanie\n"
          "2 - Odejmowanie\n"
          "3 - Mnożenie\n"
          "4 - Dzielenie\n"
          "5 - Dzielenie liczb całkowietych (reszta w formie ulamka)\n"
          "6 - Potęgowanie\n"
          "M - Menu\n"
          "Q - Zakończ\n")
    kalkulator()


def wybierz_funkcje():
    return input('Wybierz funkcję: ')

def sprawdz(x):
    try:
        float(x)
        return x
    except ValueError:
        print("To nie jest liczba")
        return sprawdz(input("Podaj ponownie liczbę: "))

def sprawdz2(x):
    if x % 1 == 0:
        return int(x)
    else:
        return float(x)

def sprawdz3(x):
    try:
        int(x)
        return x
    except ValueError:
        print("To nie jest poprawna liczba")
        return sprawdz3(input("Podaj ponownie liczbę: "))


def wybrana_liczba():
    liczba1 = sprawdz(input('Podaj pierwszą liczbę: '))
    liczba2 = sprawdz(input('Podaj drugą liczbę: '))
    return liczba1, liczba2

def dzielenie_z_ulamkiem():
    a = sprawdz3(input("Wpisz mianownik (liczba całkowita): "))
    b = sprawdz3(input("Wpisz dzielnik (liczba całkowita): "))

    a = int(a)
    b = int(b)

    dzielenie = a / b
    reszta = a % b
    nwd = math.gcd(reszta, b)
    uproszczony_dzielnik = int(b / nwd)
    uproszczona_reszta = int(reszta / nwd)
    if uproszczona_reszta != 0:
        print("Wynik dzielenia to {} i {}/{}".format(int(dzielenie), uproszczona_reszta, uproszczony_dzielnik))
    else:
        print("Wynik dzielenia to {}".format(int(dzielenie)))

def kalkulator():
    operacja = wybierz_funkcje()
    if operacja == "1":
        print("--Dodawanie:--")
        l1, l2 = wybrana_liczba()
        print("{} + {} = {}".format(l1, l2, sprawdz2(sprawdz2(float(l1)) + sprawdz2(float(l2)))))
        kalkulator()
    if operacja == "2":
        print("--Odejmowanie:--")
        l1, l2 = wybrana_liczba()
        print("{} - {} = {}".format(l1, l2, sprawdz2(sprawdz2(float(l1)) - sprawdz2(float(l2)))))
        kalkulator()
    if operacja == "3":
        print("--Mnożenie:--")
        l1, l2 = wybrana_liczba()
        print("{} * {} = {}".format(l1, l2, sprawdz2(sprawdz2(float(l1)) * sprawdz2(float(l2)))))
        kalkulator()
    if operacja == "4":
        print("--Dzielenie:--")
        l1, l2 = wybrana_liczba()
        print("{} / {} = {}".format(l1, l2, sprawdz2(sprawdz2(float(l1)) / sprawdz2(float(l2)))))
        kalkulator()
    if operacja == "5":
        print("--Dzielenie z ułamkiem:--")
        dzielenie_z_ulamkiem()
        kalkulator()
    if operacja == "6":
        print("--Potęgowanie:--")
        l1, l2 = wybrana_liczba()
        print("{} do potęgi {} = {}".format(l1, l2, sprawdz2(sprawdz2(float(l1)) ** sprawdz2(float(l2)))))
        kalkulator()
    if operacja == "M" or operacja == "m":
        menu()
    if operacja == "Q" or operacja == "q":
        exit()
    else:
       print("--Błędna wartość--")
       kalkulator()


menu()
