Instructions on run.

1. Tests are executtable by running "mvn clean test" command in the console
2. Description on directories in the test folder of the project:
- "Context": Setting up the environment variables are needed in the project as well as WebDriver
- "facroty": Returns single instance of PageinstancesFactory
- "Listeners": Implementation of the interfaces regarding results of the test run
- "Pages": Decription of the elemnts from the testing page pages/Defining default waiter
- "Report": Class which handles the report activities.
- "Tests": Tests on scenarios for the testing as well as some wrappers
- "Util": utility classes to configure the Logging/Reporting properties
- Results of the previous tests run are attached by following path in the repo: https://github.com/vlodch/AkamaIUITestVC/blob/main/TestAkamaiProjectUI/logfile.log
