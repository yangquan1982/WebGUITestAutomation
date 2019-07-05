#!/usr/bin/env python3
from selenium.webdriver.common.by import By

class SearchPageLocators(object):
    """A class for search page locators. All search page locators should come here"""
    SEARCH_BOX = (By.XPATH, '//*[@id="tsf"]/div[2]/div/div[1]/div/div[1]/input')
    SEARCH_BTN = (By.XPATH, '//*[@id="tsf"]/div[2]/div/div[3]/center/input[1]')
    SEARCH_BTN_2 = (By.XPATH, '//*[@id="tsf"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]')

class SearchResultsPageLocators(object):
    """A class for search results locators. All search results locators should come here"""
    RESULT_STATS = (By.XPATH, '//*[@id="resultStats"]')