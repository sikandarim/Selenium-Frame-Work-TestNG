Hybrid test automation framework based on:
  - Selenium WebDriver
  - TestNG 
  - Maven 
  - ExtentReports
  - Log4j2 
 
  
With this framework, automation engineers can get started quickly on automating their tests rather than wasting time on designing and maintaining the framework. New features are being added to the framework constantky. My intent in designing this framework is to make it easy to setup and start quickly with selenium. But at the same time, I have tried to make it extendable, readable and maintainable.  Users can clone and adapt the framework according to their respective requirements if needed.

Following patterns are followed in this framework (some of which shall be altered according to the usability)
  - Page Object Model is followed which is golden rule for test automation. Page Factory is not used in finding the elements but the page elements are segregated to separate classes and used the respective page classes. 
  - Factory pattern is used in initialising the Webdriver for different browsers, hence it can be extended to add any new browser driver supported by Selenium. 
  - Decorated driver and element are used in the entire framework which makes the logging easy. Only a few actions are added now which can be updated according to individual requirements.
  - Fluent pattern is used in the sample tests to enhance the readability of the tests which can be altered according to  the taste of the user.
