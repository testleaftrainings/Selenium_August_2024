#### Advanced xPath(Axes based xPath)*
     1. Parent to Child:
        Syntax:
         `BasicRelativeXpathforParent/childTagname`
        Example:
          `(//form[@id='login']/p)[2] `

     2. Child to Parent:
        Syntax:
         ` BasicRelativeXpathforChild/parent::parenttagname` 
        Example:
        ` //label[text()='Password']/parent::p`
         `//p[@class='top']/parent::form`    

     3. GrandParent to GrandChild:
        Syntax:
          `BasicRelativeXpathforGrandParent//grandchildTagname` 
        Example:
          `(//form[@id='login']//input)[3] `     

     4. GrandChild to GrandParent:
        Syntax:
            ` BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname`   
        Example:
          `//input[@class='decorativeSubmit']/ancestor::form` 

     5. ElderCousin to YoungerCousin:
        Syntax:
           `BasicRelativeXpathforElderCousin/following::youngerCousintagname`   
        Example:
           `//span[text()='Company Name']/following::input  
           
     6. YoungerCousin to ElderCousin:
        Syntax:
            `BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname`   
        Example:
           `//input[@id='createLeadForm_firstName']/preceding::input[2] ` 


     7. ElderSibling to YoungerSibling:
        Syntax:      
           `BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname`
        Example:
           `//label[text()='Username']/following-sibling::input`
      
     8. YoungerSibling to ElderSibling:
        Syntax:
          `BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname`
        Example:  
           `//input[@id='username']/preceding-sibling::label`    