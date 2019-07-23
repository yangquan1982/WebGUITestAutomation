#!/usr/bin/env python3
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains

WAIT_TIME = 10

# Click unique element by its locator
def click_element_by_locator(driver, locator):
    element = get_element_wait_until_presence(driver, locator)
    actions = ActionChains(driver)
    actions.move_to_element(element).perform()
    element.click()

# Click unique element by its locator
def click_element_with_index_by_locator(driver, locator, index):
    elements = get_elements_wait_until_presence(driver, locator)
    actions = ActionChains(driver)
    actions.move_to_element(elements[index]).perform()
    elements[index].click()

# Explicitly wait until the element presence and return it
def get_element_wait_until_presence(driver, locator):
    try:
        element = WebDriverWait(driver, WAIT_TIME).until(
            EC.presence_of_element_located(locator)
        )
    except:
        print("Error: Element not presence within " + str(WAIT_TIME) + " s")
        raise
    return element

# Explicitly wait until all elements presence and return it
def get_elements_wait_until_presence(driver, locator):
    try:
        elements = WebDriverWait(driver, WAIT_TIME).until(
            EC.presence_of_all_elements_located(locator)
        )
    except:
        print("Error: Element not presence within " + str(WAIT_TIME) + " s")
        raise
    return elements