# Allows for easy running of Java Files

function timeout() { perl -e 'alarm shift; exec @ARGV' "$@"; } #Timeout in case of infinite loop

javac -cp .:\* *.java
#Change timout amount for longer run time programs
timeout 10 java -cp .:\* TestRunner >> Output.txt 2>&1


