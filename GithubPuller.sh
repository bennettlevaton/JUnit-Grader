# Created by Bennett Levaton
# Allows for easy running of C# files
# Arguments filename

while IFS= read -r line; do
    echo $line >> Output.txt
    git clone https://github.com/YOUR_PROGRAM/PROJECT_NAME-$line.git
    #Copy Lines needed
    cp ./set-$line/YOUR_TEST_FILE.java .
    bash run.sh
    rm -r set-$line
done < file.txt

