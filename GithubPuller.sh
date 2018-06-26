echo "All Grades" > Output.txt
echo " " >> Output.txt

PROJECT_NAME=" " #The name of your project before special IDs
YOUR_PROGRAM=" " #The name of your orginization
YOUR_TEST_FILE=" "; #The name of the Java file you want tested

while IFS= read -r line; do
    echo $line >> Output.txt
    echo $"---------------------------------------------------" >> Output.txt
    git clone https://github.com/$YOUR_PROGRAM/$PROJECT_NAME-$line.git
    cp ./$PROJECT_NAME-$line/$YOUR_TEST_FILE.java .
    cd $PROJECT_NAME-$line
    DATE=$(git rev-list --format=format:'%ci' --max-count=1 `git rev-parse HEAD`)
    cd ..
    Java DateFormat $DATE >> Output.txt
    echo $"---------------------------------------------------" >> Output.txt
    bash run.sh
    rm -r $PROJECT_NAME-$line
done < GitHubUserNames.txt
