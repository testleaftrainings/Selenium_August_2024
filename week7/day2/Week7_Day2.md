## Read data from Properties file:
    1. Create a file with extension as .properties
    2. Where in the file write a value based on key-pair
    3. With the help of Properties class read data from the file

## Steps to implement Property file:
        1. Create a properties file and assign a key-value pair
        2. Before launching the browser create object for Properties class and load the properties file
        3. In the username field (Remove the hardcorded value and replace with prop.getProperty("key"))



## Steps to import the existing project:
        1. Click on the 'new' from file menu
        2. Click on the 'import' under file
        3. Expand 'maven' folder
        4. Click on 'Existing maven project' and click on next
        5. Choose the project location and click on finish

## Steps to take screenshot
        1. Take Screenshot - use getScreenshotAs(OutputType.FILE) and store as file
        2. Set screenshotLocation - Create object for File and set the file location along with file name and extension
        3. Save the Screenshot - Copy the screenshot into the screenshot location by copyFile() in FileUtils class

        Required dependency to use copyFile()
        ------------------------------------
        
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.11.0</version>
        </dependency>