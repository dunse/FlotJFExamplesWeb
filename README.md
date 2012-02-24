# About

This is a web project to illustrate how to use [Flot](http://code.google.com/p/flot) together with [FlotJF](https://github.com/dunse/FlotJF) to create graphs.

# Building

**Dependencies:**

Maven 2+  
  
**Setup workspace:**
    
    
    git clone git://github.com/dunse/FlotJF.git
    git clone git://github.com/dunse/FlotJFExamplesWeb.git
    

**Build FlotJFExamplesWeb**
    
    cd FlotJF
    mvn install
    cd ..
    cd FlotJFExamplesWeb
    mvn package

This will create the compiled .war file under _target_ directory which can be deployed to an application server of choice.

To use the application, access it through: [http://localhost:PORT/FlotJFExamplesWeb/index.html](http://localhost:PORT/FlotJFExamplesWeb/index.html)

# Screenshots

## Example 1 - Simple Line Graph

![](/dunse/FlotJFExamplesWeb/raw/master/src/main/java/doc-files/example1.jpg)

## Example 2 - Two Y Axis, Two lines

![](/dunse/FlotJFExamplesWeb/raw/master/src/main/java/doc-files/example2.jpg)

## Example 3 - Different Graph Types

![](/dunse/FlotJFExamplesWeb/raw/master/src/main/java/doc-files/example3.jpg)

## Example 4 - Realtime graph using AJAX (update every 3sec)

![](/dunse/FlotJFExamplesWeb/raw/master/src/main/java/doc-files/example4.jpg)

## Example 5 - Colour and Opacity gradient

![](/dunse/FlotJFExamplesWeb/raw/master/src/main/java/doc-files/example5.jpg)

## Example 6 - Tooltip

![](/dunse/FlotJFExamplesWeb/raw/master/src/main/java/doc-files/example6.jpg)
