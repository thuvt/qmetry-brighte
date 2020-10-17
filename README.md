# Prerequisite
The system requirements information are below:
- BDD
- Java 8+
- Maven (prefer latest version)
- Selenium
- Eclipse (prefer latest version)

# Instructions
Maven directory structure:
- The 'config' directory contains testng.xml file, and is a place holder for configuration files.
- The 'resources' directory contains all required resources including properties files and data files, and is a place holder for other resources.
- The 'src' directory contains all java files and is a place holder for other java files.
- The 'test-results' directory contains result files.
- The 'scenarios' directory is the default place holder for all the scenario files (bdd files).
- The 'testdata' directory contains test data files, excel format.

To change/modify dependencies, check pom.xml

To run the project, from command prompt go to project home and run 'mvn clean test' or run it from Eclipse. Then open test-results/emailable-report.html to view results.

# Assumption
No formula to calculate the preapproval eligible amount and  maximum repayment amount. Assume that the expected amounts calculated from the excel file

# Note
This project uses Chrome driver and it requires Chrome driver binary. You need to download and set webdriver.chrome.driver property in application.properties file with driver binary path.

Please refer https://qmetry.github.io/qaf/ for more information

Thanks,

Thu

