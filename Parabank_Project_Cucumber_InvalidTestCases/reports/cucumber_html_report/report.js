$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/parabnk.feature");
formatter.feature({
  "line": 2,
  "name": "Parabank Invalid Registration and Login",
  "description": "",
  "id": "parabank-invalid-registration-and-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Invalid_Registration_And_Login"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Invalid Registration due to already existed username",
  "description": "",
  "id": "parabank-invalid-registration-and-login;invalid-registration-due-to-already-existed-username",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the Parabank Registration page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters the details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "submits the registration and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBank_Registeration.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 10786329900,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Registeration.the_user_open_the_Parabank_Registration_page()"
});
formatter.result({
  "duration": 5680908800,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Registeration.user_enters_the_details()"
});
formatter.result({
  "duration": 3614530600,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Registeration.submits_the_registration_and_close_the_browser()"
});
formatter.result({
  "duration": 3719602000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Invalid Registration if any one field is leftblank",
  "description": "",
  "id": "parabank-invalid-registration-and-login;invalid-registration-if-any-one-field-is-leftblank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tc_02"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the user launchs the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user open the Parabank Registration Page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user enters the details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "submits the registration and the closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBank_RegistrationInvalid.the_user_launchs_the_chrome_application()"
});
formatter.result({
  "duration": 9480339400,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_RegistrationInvalid.the_user_open_the_Parabank_Registration_Page()"
});
formatter.result({
  "duration": 7126660700,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_RegistrationInvalid.the_user_enters_the_details()"
});
formatter.result({
  "duration": 6207287900,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_RegistrationInvalid.submits_the_registration_and_the_closes_the_browser()"
});
formatter.result({
  "duration": 9589812400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Invalid Login due to wrong Username",
  "description": "",
  "id": "parabank-invalid-registration-and-login;invalid-login-due-to-wrong-username",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@tc_03"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user open the Parabankpage",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "then login and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBank_Login_InvalidUser.the_user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 9592268100,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_InvalidUser.the_user_open_the_Parabankpage()"
});
formatter.result({
  "duration": 6366576700,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_InvalidUser.user_enters_the_username_and_password()"
});
formatter.result({
  "duration": 251348300,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_InvalidUser.then_login_and_close_the_browser()"
});
formatter.result({
  "duration": 8570779800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Invalid Login due to wrong Password",
  "description": "",
  "id": "parabank-invalid-registration-and-login;invalid-login-due-to-wrong-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@tc_04"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "the user launchs chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the user opens the Parabankpage",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user enters the username and password in the fields",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "the user login into the application and close browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBank_Login_InvalidPassword.the_user_launchs_chrome_browser()"
});
formatter.result({
  "duration": 9567332400,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_InvalidPassword.the_user_opens_the_Parabankpage()"
});
formatter.result({
  "duration": 10808673900,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_InvalidPassword.user_enters_the_username_and_password_in_the_fields()"
});
formatter.result({
  "duration": 212626200,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_InvalidPassword.the_user_login_into_the_application_and_close_browser()"
});
formatter.result({
  "duration": 9053761100,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Invalid Login due to any of the field left blank",
  "description": "",
  "id": "parabank-invalid-registration-and-login;invalid-login-due-to-any-of-the-field-left-blank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@tc_05"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the user open the ParabankLoginpage",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "then the user login and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBank_Login_Invalid.the_user_launchs_the_chrome_browser()"
});
formatter.result({
  "duration": 9621269600,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_Invalid.the_user_open_the_ParabankLoginpage()"
});
formatter.result({
  "duration": 7317242200,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_Invalid.user_enters_username_and_password()"
});
formatter.result({
  "duration": 153062100,
  "status": "passed"
});
formatter.match({
  "location": "ParaBank_Login_Invalid.then_the_user_login_and_close_the_browser()"
});
formatter.result({
  "duration": 7381872100,
  "status": "passed"
});
});