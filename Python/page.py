#!/usr/bin/env python3
from .element import BasePageElement
from .locators import SearchPageLocators
from .utils import *

class SearchTextElement(BasePageElement):
    """This class gets the search text from the specified locator"""

    #The locator for search box where search string is entered
    def __init__(self, locator):
        self.locator = locator

class BasePage(object):
    """Base class to initialize the base page that will be called from all pages"""

    def __init__(self, driver):
        self.driver = driver

class SearchPage(BasePage):
    #Declares a variable that will contain the retrieved text
    search_text_element = SearchTextElement(SearchPageLocators.SEARCH_BOX)

    def is_title_matches(self):
        """Verifies that the hardcoded text "Google" appears in page title"""
        return "Google" in self.driver.title

    def click_search_button(self):
        """Triggers the search"""
        click_element_with_index_by_locator(self.driver, SearchPageLocators.SEARCH_BTNS, 0)

class SearchResultsPage(BasePage):
    """Search results page action methods come here"""

    def is_results_found(self):
        # Probably should search for this text in the specific page
        # element, but as for now it works fine
        return "No results found." not in self.driver.page_source