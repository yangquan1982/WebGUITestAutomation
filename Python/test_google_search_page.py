#!/usr/bin/env python3
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from .driver_factory import ChromeDriver
from .page import SearchPage, SearchResultsPage
import pytest

class TestGoogleSearch:

    @classmethod
    def setup_class(cls):
        # cls.chrome_options = Options()
        # cls.chrome_options.add_argument('--headless')
        # cls.driver = webdriver.Chrome(options=cls.chrome_options)
        # cls.driver = webdriver.Chrome()
        cls.driver = ChromeDriver().get_driver()
        cls.driver.get("https://www.google.com/")

    def test_google_search(self):
        google_page = SearchPage(self.driver)
        assert google_page.is_title_matches()
        google_page.search_text_element = "Python"
        google_page.click_search_button()
        search_results_page = SearchResultsPage(self.driver)
        assert search_results_page.is_results_found()
    
    @classmethod
    def teardown_class(cls):
        cls.driver.close()
        cls.driver.quit()