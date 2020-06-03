$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/SampleTest.feature");
formatter.feature({
  "line": 1,
  "name": "BrightTalk  Sample Test",
  "description": "",
  "id": "brighttalk--sample-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2478366202,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sample",
  "description": "",
  "id": "brighttalk--sample-test;sample",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 964986051,
  "status": "passed"
});
formatter.after({
  "duration": 176710432,
  "status": "passed"
});
});