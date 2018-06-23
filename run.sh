# Created by Bennett Levaton
# Allows for easy running of C# files
# Arguments filename
function timeout() { perl -e 'alarm shift; exec @ARGV' "$@"; }

javac -cp .:\* *.java
# add output and error messages
timeout 10 java -cp .:\* TestRunner >> Output.txt 2>&1


