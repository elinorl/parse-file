# ParseFile

ParseFile will read in a file and parse each line into a list of tokens using various token delimiters. 
Each invocation will determine its delimiter by the file extension. Only tabs are currently supported. 
Check back for other delimiters to be added in the future.

## Prerequisites
Java\
Gradle

## Installation
Extract All... from compressed zipped folder parse-file.

## Usage
To build the program:
```
gradlew build
```
Unit tests are located in src/test/java/com/el/ParseFileTest.java\
The test summary is located in build/reports/test/test/index.html

To run the program:
```
java -jar build\libs\parse-file.jar test.tab
```
Try with test files in the project home directory empty.tab, test.csv, or create your own.


## Author
Elinor Leong