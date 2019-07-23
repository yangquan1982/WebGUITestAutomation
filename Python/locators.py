#!/usr/bin/env python3
from selenium.webdriver.common.by import By

class SearchPageLocators(object):
    """A class for search page locators. All search page locators should come here"""
    SEARCH_BOX = (By.XPATH, '//input[@title="Search"]')
    SEARCH_BTNS = (By.XPATH, '//input[@value="Google Search"]')

class SearchResultsPageLocators(object):
    """A class for search results locators. All search results locators should come here"""
    RESULT_STATS = (By.XPATH, '//*[@id="resultStats"]')