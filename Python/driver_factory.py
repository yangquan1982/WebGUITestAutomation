#!/usr/bin/env python3
import os
import time
from selenium import webdriver
from selenium.common.exceptions import WebDriverException

class ChromeDriver():

    def get_driver(self):
        count = 0
        while(True):
            try:
                ce = "http://0.0.0.0:4444/wd/hub"
                driver = webdriver.Remote(
                    command_executor=ce,
                    desired_capabilities={
                        "browserName": "chrome",
                        "platform": "LINUX"
                    }
                )
                return driver
            except WebDriverException as e:
                s = "%s" % e
                print("Got exception %s" % s)
                print("%s" % dir(s))
                if "Empty pool of VM for setup Capabilities" not in s:
                    raise
                time.sleep(5)
            if count == 60:
                raise Exception("Time out trying to get a browser")
            count += 1