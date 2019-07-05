#!/usr/bin/env python3
from selenium.webdriver.common.action_chains import ActionChains
import time

class ClickElement():

    def click_by_locator(self, driver, locator):
        element = driver.find_element(*locator)
        actions = ActionChains(driver)
        actions.move_to_element(element).perform()
        element.click()