from time import sleep
from datetime import datetime
import requests
from bs4 import BeautifulSoup
import csv

def convertTuple(tup):
 str = '\n'.join(tup)
 return str

today = datetime.today().strftime('%d_%m_%Y')

x= 1
with open("linki_meskie_trampki_08_07_2019.csv", "r") as rfile:
 myfile = rfile.read().splitlines()
 for line in myfile:
  print(x)
  x += 1
  sleep(0.2)
  link = line
  html_doc = requests.get(link).text
  soup = BeautifulSoup(html_doc, 'html.parser')
  name = soup.find("h1", {"class": "product-details-full-name"}).text
  price_all = []
  for price in soup.find_all("div", {"class": "sk4-p-price"}):
   price = price.find().text
   price_all.append(price)
  price_all = convertTuple(price_all)

  with open(f"index_{today}.csv", "a") as csv_file:
   writer = csv.writer(csv_file)
   writer.writerow([name, price_all, datetime.now(), link])
