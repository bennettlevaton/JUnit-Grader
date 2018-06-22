# Created by Bennett Levaton
# Allows for easy running of C# files
# Arguments filename
echo "Grades Assignment Set"; > Output.txt
while IFS= read -r line; do
    echo $line >> Output.txt
    git clone https://github.com/210Summer18/set-$line.git
    #Copy Lines needed
    cp ./set-$line/SortedStringSet.java .
    bash run.sh
    rm -r set-$line
done < file.txt

