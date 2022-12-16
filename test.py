# ---
# jupyter:
#   jupytext:
#     formats: ipynb,py:light
#     text_representation:
#       extension: .py
#       format_name: light
#       format_version: '1.5'
#       jupytext_version: 1.14.4
#   kernelspec:
#     display_name: Python 3 (ipykernel)
#     language: python
#     name: python3
# ---

import requests
from bs4 import BeautifulSoup

res = requests.get('https://weather.naver.com/')

soup = BeautifulSoup(res.content, 'html.parser')

print(soup.find('thead').get_text())
