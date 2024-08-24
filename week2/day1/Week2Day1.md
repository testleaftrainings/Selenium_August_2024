## Methods:

*Definition:* 
   A method in Java is a set of instructions or a block of code encapsulated within a named unit. It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. They are defined using the def keyword, followed by the method's signature, which includes its name, parameters, and return type.

Explanation: 
   Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.

## Objects:

*Definition:*
    In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.

Explanation
   Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.


### Selenium Introduction:
1. **What is Selenium?**
    - Selenium is a powerful tool used for automating web browsers. 
    - It can interact with web pages, simulating actions that a human would do, like clicking buttons, entering text, and navigating through websites. 
    - Testers use Selenium to test their web applications, ensuring that they work as expected across different browsers and environments.

2. **Why Selenium?**
    - The reason Selenium is so popular is because it's open-source, which means it's free to use and has a large community of users contributing to its development. 
    - This tool supports multiple programming languages like Java, Python, and C#, allowing a wide range of developers to use it. 
    - Additionally, Selenium can work with various browsers such as Chrome, Firefox, and Safari, making it versatile. 
    - Its ability to automate repetitive tasks not only saves time but also improves the accuracy of testing, as it removes the likelihood of human error.

3. **When to Use Selenium?**
    - Selenium is ideal for testing web applications. 
    - If you have a website or a web application that needs to be tested across different browsers and operating systems, Selenium is a great choice. 
    - It's especially useful for regression testing, where you need to repeatedly test the same application following changes or updates. 
    - It's also used for creating robust, browser-based regression automation suites and tests, and for scaling and distributing scripts across different environments.

4. **Tool Usage Across the World**
   - Globally, Selenium leads in usage and downloads, indicating its widespread acceptance and reliability in the field of web automation. 
   - Playwright and Cypress, while also popular, follow Selenium in terms of the user base and application in various industries.

5. **Tool - Scripting Languages**
   - A significant advantage of Selenium is its support for multiple scripting languages like Java, Python, C#, and others, offering flexibility to and testers. 
   - In contrast, Playwright and Cypress are more focused on JavaScript, catering to a specific segment of developers.

6. **How Selenium Emerged?**
   - The development of Selenium began at Thoughtworks in 2004, evolving from a simple internal tool to a comprehensive testing framework. 
   - Over the years, it expanded from Selenium Core to include RC, IDE, and WebDriver, each addressing specific testing needs and overcoming the limitations of its predecessors.

7. **Selenium Components**
   - The Selenium suite comprises various components like WebDriver, RC, IDE, Grid, and its different versions. - Each component serves a specific purpose, from direct browser automation (WebDriver) to parallel test execution (Grid), making Selenium a versatile tool for diverse testing requirements.

8. **What Selenium Can and Cannot Do**
   - While Selenium excels in automating browser interactions and supporting cross-platform testing, it has limitations. 
   - It cannot directly interact with databases or automate non-web applications. For such tasks, additional tools or frameworks are often required to complement Selenium's capabilities.

9. **How Selenium Talks to Browsers**
  - Selenium communicates with browsers through language-specific bindings and browser drivers. 
  - These drivers act as intermediaries, translating commands written in programming languages like Java or Python into actions that the browser can perform. 
  - This communication is standardized through the W3C WebDriver protocol, ensuring consistency and compatibility across different web browsers.

### Selenium interaction:
1. **How Communication Happens?**
   - Selenium automations are performed using the WebDriver, which is an interface that sends commands to a browser and retrieves results. 
   - The process is streamlined through WebDriver's ability to communicate across various browsers using the same script in a chosen programming language.

**Maven Central Cloud Repository**
   https://repo1.maven.org/maven2/   


**Maven Repository**
   https://mvnrepository.com/

**Selenium Official Site**
   https://selenium.dev


**Maven Local Repository**
   Go to LocalDisk (C) -->  Users --> Open your user profile --> .m2 folder (If folder is not visible , enable the option to view hidden folder) --> repository

