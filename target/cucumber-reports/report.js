$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/calculator.feature");
formatter.feature({
  "name": "Calculator app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Show correct result in calculator app",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The calculator app is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinition.CalculateStep.the_calculator_app_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters a calculation",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinition.CalculateStep.the_user_enters_a_calculation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The correct result will be showed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinition.CalculateStep.the_correct_result_will_be_showed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});