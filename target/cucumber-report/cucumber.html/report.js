$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computer.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page Test",
  "description": "As a user I want to build my own computer and add that to cart successfully",
  "id": "computer-page-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "User should build own computer and add them to cart succesfully",
  "description": "",
  "id": "computer-page-test;user-should-build-own-computer-and-add-them-to-cart-succesfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on desktops link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on product name \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select processor \"\u003cprocessor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select RAM \"\u003cram\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select HDD \"\u003chdd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select os \"\u003cos\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select software \"\u003csoftware\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify message \"The product has been added to your shopping cart\" once finished",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "computer-page-test;user-should-build-own-computer-and-add-them-to-cart-succesfully;",
  "rows": [
    {
      "cells": [
        "processor",
        "ram",
        "hdd",
        "os",
        "software"
      ],
      "line": 30,
      "id": "computer-page-test;user-should-build-own-computer-and-add-them-to-cart-succesfully;;1"
    },
    {
      "cells": [
        "2.2 GHz Intel Pentium Dual-Core E2200",
        "2 GB",
        "320 GB",
        "Vista Home [+$50.00]",
        "Microsoft Office [+$50.00]"
      ],
      "line": 31,
      "id": "computer-page-test;user-should-build-own-computer-and-add-them-to-cart-succesfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5727134700,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User should build own computer and add them to cart succesfully",
  "description": "",
  "id": "computer-page-test;user-should-build-own-computer-and-add-them-to-cart-succesfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on desktops link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on product name \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select processor \"2.2 GHz Intel Pentium Dual-Core E2200\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select RAM \"2 GB\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I select HDD \"320 GB\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select os \"Vista Home [+$50.00]\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select software \"Microsoft Office [+$50.00]\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I verify message \"The product has been added to your shopping cart\" once finished",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 90273600,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 754945200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnDesktopsLink()"
});
formatter.result({
  "duration": 619845700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 25
    }
  ],
  "location": "ComputerSteps.iClickOnProductName(String)"
});
formatter.result({
  "duration": 1023962000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.2 GHz Intel Pentium Dual-Core E2200",
      "offset": 20
    }
  ],
  "location": "ComputerSteps.iSelectProcessor(String)"
});
formatter.result({
  "duration": 128699400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 GB",
      "offset": 14
    }
  ],
  "location": "ComputerSteps.iSelectRAM(String)"
});
formatter.result({
  "duration": 168901600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "320 GB",
      "offset": 14
    }
  ],
  "location": "ComputerSteps.iSelectHDD(String)"
});
formatter.result({
  "duration": 119203200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Home [+$50.00]",
      "offset": 13
    }
  ],
  "location": "ComputerSteps.iSelectOs(String)"
});
formatter.result({
  "duration": 83259700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft Office [+$50.00]",
      "offset": 19
    }
  ],
  "location": "ComputerSteps.iSelectSoftware(String)"
});
formatter.result({
  "duration": 115962900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 78998100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 18
    }
  ],
  "location": "ComputerSteps.iVerifyMessageOnceFinished(String)"
});
formatter.result({
  "duration": 835442600,
  "status": "passed"
});
formatter.after({
  "duration": 887371800,
  "status": "passed"
});
});