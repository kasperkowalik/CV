from datetime import datetime

import requests
from bs4 import BeautifulSoup

link = "https://www.eastend.pl/trampki/oferta#dla=m"
html_doc = requests.get(link).text
soup = BeautifulSoup(html_doc, 'html.parser')

link = soup.find("div", {"class": "listing listing-1"})

data = []
x = 0

for div in link.find_all('a'):
    div = div.get('href')
    if div == None:
        break
    else:
        data.append(f'https://www.eastend.pl{div}')
        print(x)
        x += 1

today = datetime.today().strftime('%d_%m_%Y')

with open(f'linki_meskie_trampki_{today}.csv', "w") as the_file:
    for t in data:
        the_file.write(''.join(str(s) for s in t) + '\n')
