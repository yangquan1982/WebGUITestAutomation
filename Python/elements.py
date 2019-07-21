#!/usr/bin/env python3
from selenium.webdriver.support.ui import WebDriverWait
from .utils import *

class BasePageElements(object):
    """Base page class that is initialized on every page object class."""

    def __set__(self, obj, value):
        """Sets the text to the value supplied"""
        driver = obj.driver
        element = get_element_wait_until_presence(driver, self.locator)
        element.clear()
        element.send_keys(value)

    def __get__(self, obj, owner):
        """Gets the text of the specified object"""
        driver = obj.driver
        element = get_element_wait_until_presence(driver, self.locator)
        return element.get_attribute("value")