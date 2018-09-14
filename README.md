# JUnit-Grader
  A simple JUnit grader. Runs all JUnit test cases in a given file (Master). Pulling github usernames from a text file line by line. It then clones the repo and runs the specified file name in the directory. Then appends the output and grade for the run into a text file with the failed test cases.
  
# How to use
  1) Open Run.sh and make sure the Output is being sent to the proper file. Default is Output.txt which will be created if it is not already in the folder.
  2) Open TestRunner and add your JUnit test file to the location that says YOUR_CLASS_HERE
  3) Changes the deduction and totalPossible values to your programming grading requirments
  4) Open GithubPuller.sh change your github URL to be the base URL for all of your programming assignments.
        * YOUR_PROGRAM -> this is the name of your Organization
        * PROJECT_NAME -> the name of the project 
        Sample:
                https://github.com/bennettlevaton/JUnit-Grader-$line.git
        The $line will add the username of the person being graded. Do not remove this.
  5) Then change your copy command to pull the proper file to be tested into your main folder.
        * YOUR_TEST_FILE -> the name of the java file youd like to copy
        Sample:
                cp ./set-$line/TestRunner.java .
                
You're ready to Run!
  
# Sample Output
![Sample Output Image](https://i.imgur.com/pLvicaz.png)
