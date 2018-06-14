# Created by Bennett Levaton
# Allows for easy testing of JUnit Java files
javac -cp .:\* *.java
java -cp .:\* TestRunner > Output.txt

