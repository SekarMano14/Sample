$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/product.feature");
formatter.feature({
  "name": "Verifying the Amazon App Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Place the order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the amazon app",
  "keyword": "Given "
});
formatter.step({
  "name": "User select language",
  "keyword": "When "
});
formatter.step({
  "name": "User select sigin option",
  "keyword": "And "
});
formatter.step({
  "name": "User search the \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select the first item and place order",
  "keyword": "And "
});
formatter.step({
  "name": "User verify the product place dor not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Place the order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the amazon app",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginpageSteps.user_is_on_the_amazon_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select language",
  "keyword": "When "
});
formatter.match({
  "location": "LoginpageSteps.user_select_language()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select sigin option",
  "keyword": "And "
});
formatter.match({
  "location": "LoginpageSteps.user_select_sigin_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search the \"iphone\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginpageSteps.user_search_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the first item and place order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginpageSteps.user_select_the_first_item_and_place_order()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: The swipe did not complete successfully\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MANO\u0027, ip: \u0027192.168.43.150\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {appActivity: com.amazon.mShop.splashscre..., appPackage: in.amazon.mShop.android.sho..., databaseEnabled: false, desired: {appActivity: com.amazon.mShop.splashscre..., appPackage: in.amazon.mShop.android.sho..., deviceName: Lenovo K3 Note, platformName: android, platformVersion: 6}, deviceManufacturer: LENOVO, deviceModel: Lenovo K50a40, deviceName: LFIV6DRSU8ONR8FA, deviceScreenSize: 1080x1920, deviceUDID: LFIV6DRSU8ONR8FA, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: Android, platformVersion: 6.0, takesScreenshot: true, warnings: {}, webStorageEnabled: false}\nSession ID: 2453eef0-2b56-402e-8233-e13bb75c3825\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat io.appium.java_client.PerformsTouchActions.performTouchAction(PerformsTouchActions.java:41)\r\n\tat io.appium.java_client.TouchAction.perform(TouchAction.java:187)\r\n\tat com.base.BaseClass.scrollDown(BaseClass.java:71)\r\n\tat com.stepdefinition.LoginpageSteps.user_select_the_first_item_and_place_order(LoginpageSteps.java:43)\r\n\tat ✽.User select the first item and place order(file:src/test/resources/product.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User verify the product place dor not",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginpageSteps.user_verify_the_product_place_dor_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});