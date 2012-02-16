# Building

**Dependencies:** Maven 2+  
  
**Setup workspace:**
    
    
    git clone git@github.com:dunse/FlotJF.git
    git clone git@github.com:dunse/FlotJFExamplesWeb.git
    

**Build FlotJFExamplesWeb**
    
    cd FlotJF
    mvn install
    cd ..
    cd FlotJFExamplesWeb
    mvn package

This will create the compiled .war file under _target_ directory which can be deployed to an application server of choice.
To use the application, access it through: [http://localhost:PORT/FlotJFExamplesWeb/index.html](http://localhost:PORT/FlotJFExamplesWeb/index.html)
