package com.pxu.demo;

import com.redhat.darcy.web.api.Browser;
import com.redhat.darcy.web.api.BrowserFactory;
import com.redhat.darcy.webdriver.ChromeBrowserFactory;
import com.redhat.synq.Event;

import java.time.temporal.ChronoUnit;

public class Demo {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "chromedriver.exe");
//        BrowserFactory browserFactory = new InternetExplorerBrowserFactory();
        BrowserFactory browserFactory = new ChromeBrowserFactory();
        Browser browser = browserFactory.newBrowser();

        Event<BaiduPage> openBaidu = browser.open(BaiduPage.url());
        BaiduPage baiduPage = openBaidu.waitUpTo(20, ChronoUnit.SECONDS);
        browser.closeAll();
    }

}
