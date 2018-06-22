# Created by Bennett Levaton
# Allows for easy running of C# files
# Arguments filename
javac -cp .:\* *.java
# add output and error messages
java -cp .:\* TestRunner >> Output.txt 2>&1

