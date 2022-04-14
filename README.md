# Project  Prestashop

The education project implementation of the following
patterns:

1. Page object
2. Steps
3. Chain of invocations
4. Loadable component

[Prestashop.qatestlab.com](http://prestashop.qatestlab.com.ua/en/) was used as testing product.


## Test case 1 - SignIn Test

| step | desc | expected result |
| --- | --- |  --- |
| 1 | open [Prestashop](http://prestashop.qatestlab.com.ua/en/) | Home page loaded |
| 2 | click Sign In | Authentication page loaded|
| 3 | check Form Create New Account | Form Create New Account is displayed |
| 4 | check Form Registered Account | Form Registered Account is displayed |


## Test case 2 - Account Test

| step | desc | expected result |
| --- | --- |  --- |
| 1 | open Create New Account page | Create New Account page loaded |
| 2 | open Registered Account page | Registered Account page loaded |
| 3 | add New Account | New Account added into account list |
| 4 | validate Registered Account | check that adding info is displayed |

TestNG command for run:
    - mvn clean test

Allure command for run:
    - mvn allure:serve
    - mvn allure:report