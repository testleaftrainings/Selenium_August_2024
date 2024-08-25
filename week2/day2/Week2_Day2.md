
### Selenium interaction:
1. **How Communication Happens?**
   - Selenium automations are performed using the WebDriver, which is an interface that sends commands to a browser and retrieves results. 
   - The process is streamlined through WebDriver's ability to communicate across various browsers using the same script in a chosen programming language.

2. **Why Selenium Communicates with Webpage Through HTML Document-DOM?**
   - Understanding the Document Object Model (DOM), which is the logical structure of HTML documents, allows Selenium to interact with various elements on a webpage. 
   - By communicating through the DOM, Selenium can simulate user actions like clicking and typing in a way that mirrors real user behavior.

3. **What is DOM?**
   - The DOM is a representation of a browser’s current web document. 
   - It's a hierarchical tree of objects that enables scripts to dynamically access and update the content, structure, and style of documents.
   - Understanding the DOM is crucial for locating elements to interact with during testing.

4. **Understanding HTML Structure and Tags**
   - The HTML structure is composed of various tags like
      `<html>`, `<a>`, `<button>`, `<div>`, `<iframe>`, `<img>`, `<input>`, `<option>`, `<select>`, `<span>`, and `<table>`. 
   - Each tag has a specific purpose, such as defining hyperlinks, sections in a document, or input fields. Knowing these tags helps in identifying elements for Selenium to interact with.

5. **To Locate Element in DOM**
   - Different locators such as `id`, `name`, `className`, `linkText`, `partialLinkText`, `xpath` are used to find elements in the DOM. 
   - Each locator has a specific use case, 
     for example, `id` is used when the element has a unique identifier, while `xpath` are used when elements are dynamic or duplicate name, class, or ID.

6. **How to Use Locators?**
   - Locators are used with the 
   **Syntax:**
   ```java
   `driver.findElement(By.locator("value"))` 
   ```
    For instance, `By.id("login")` would locate an element with the ID of 'login'.

7. **When to/Not to Use Locators**
   - Guidelines are provided on when to use specific locators. 
   - For example, `id` should be used when it's available,
   - `name` if `id` does not exist, 
   - `linkText` for links, 
   - `className` when the class attribute is unique,
   - `tagName` for collections,
   - `xpath` if no other locator works.



##### Steps to Open DOM(Document object Model)/DevTool

   1. right click on the Webpage ---> Click on Inspect
   2. shortcut --> ctrl+shift+i --> by using this shortcut able to open/close the DOM
   3. Click on the three vertical dots in top right --> Click on more tools --> Click Developer tools
   4. shortcut keys --> F12 or fn + F12


###### Steps to locate the WebElement in the DOM

   1. right click on the WebElement ---> Click on Inspect
   2. Enable a spyTool(dotted square with arrow)--> locate the WebElement in the WebPage--> click on the WebElement.

### Dropdown:
1. **What is a Dropdown?**
   - A dropdown in web development is a user interface element that allows users to select one option from a list of options. 
   - In HTML, this is structured with a `<select>` tag as the parent element and `<option>` elements as children.
   - Selenium must be able to interact with these elements to test web applications thoroughly.

2. **How to Handle Dropdown?**
   - Selenium provides a `Select` class specifically for interacting with dropdown elements. 
   - The `Select` class offers methods to select options within a dropdown easily.

3. **When to Use?**
   - The `Select` class should be used when an element in the DOM is identified with a `<select>` tag, indicating a dropdown menu.

4. **`<select>` Structure in DOM**
   - The `<select>` tag in the DOM represents the dropdown element,
   - and the nested `<option>` tags represent the individual choices available to the user.

5. **How to Use Select Class?**
   - To use the `Select` class, a Selenium script must first identify the `<select>` element in the DOM. 
   - Then, an instance of the `Select` class is created by passing the located WebElement as an argument to its constructor. 
   - This allows the script to manipulate the dropdown as needed.

6. **Helper Methods**
   - The `Select` class provides various methods to select options from a dropdown, such as:
     - `selectByIndex(index)`: Selects an option by its index in the dropdown, starting with 0.
     - `selectByVisibleText("text")`: Selects an option by the text visible to the user in the dropdown.
     - `selectByValue("value")`: Selects an option by the value of its `value` attribute.


1. **Definition and Structure**:
   - **Absolute XPath**: It starts from the root (`html`) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash `/`, indicating the root. For example: `/html/body/div[2]/div[2]/div/form/p[1]/input`.
`.
   - **Relative XPath**: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, not necessarily detailing the entire path from the root. It starts with a double forward slash `//`, indicating the search can begin anywhere. 
   For example: `//input[@id=‘username’]`.

2. **Robustness**:
   - **Absolute XPath**: It is less robust because if there are any changes in the path or structure of the web page, the XPath would break, leading to failed element location.
   - **Relative XPath**: It is more robust as it usually focuses on specific attributes or elements, making it less susceptible to changes in the overall structure of the webpage.

3. **Length and Complexity**:
   - **Absolute XPath**: These tend to be longer . They map the entire path from the root to the element, making them more complex.
   - **Relative XPath**: They are generally shorter and more concise, targeting specific elements directly without detailing the entire path, reducing complexity.

4. **Flexibility and Use Cases**:
   - **Absolute XPath**: It's less commonly used in dynamic web environments where page structures can change frequently.
   - **Relative XPath**: More commonly used in web automation and scraping because of its adaptability to web page changes and ability to precisely target elements.

5. **Performance**:
   - **Absolute XPath**: It can be slower in performance as it requires traversing the entire hierarchy of the DOM (Document Object Model) from the root.
   - **Relative XPath**: Generally offers better performance as it allows for more direct queries and doesn't necessarily traverse from the root.


2. **Relative Xpath:**

    a.*Basic xpath*
    1. Attribute based xPath:
       Syntax:
       `//tagname[@attributename='attributeValue']`
       Example:
      ` //input[@id='password']`
      `//input[@id='twotabsearchtextbox']`

    2. Text based xPath:
       Syntax:
       ` //tagname[text()='textvalue'] ` 
       Example:
       ` //a[text()='Leads']`
       `//span[text()='Hello, sign in']`

    3. Partial Attribute based xpath:
       Syntax:
       `//tagname[contains(@attributename,'partialattributevalue')]`
       Example:
         `//input[contains(@class,'decorative')]`
         `//input[contains(@id,'twotab')]`

    4. Partial Text based xpath:  
       Syntax:
         `//tagname[contains(text(),'partialtextvalue')] `
       Example:
        `//a[contains(text(),'SFA')]`  
        `//span[contains(text(),'Hello')]`

    5. Index based xpath:
       Syntax:
       '(any xpath)[index]'
        `(//tagname[@attributename='attributeValue'])[2]`        
        ` (//tagname[text()='textvalue'])[3] `
       Example:
         `(//a[contains(text(),'Lead')])[3] `
