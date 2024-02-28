# Homework for lesson #14

Task 1:</br>
Application allows user to reads information from the file. </br>
Sort files by correctness and write to separate files. </br>
Application contains:</br>
- Folder <code>log</code>
  - folder <code>error_log</code> <em>(The error_log file contains error information)</em>
  - folder <code>event_log</code> <em>(The event_log file contains event infomation)</em>
  
- Folder <code>resources</code> <em>(Contains file for check)</em>
- Folder <code>result</code> <em>(Contains 2 files with valid and invalid values)</em>
- Folder <code>src</code> "source" <em>(Contains the source code of the project)</em>
  - Folder <code>constants</code> <em>(Contains constants)</em>
  - Folder <code>launcher</code>
  
    - Class <code>Runner</code> <em>(Responsible for starting the program)</em>
  - Folder <code>service</code>
    - Class <code>ParserService</code> <em>(Splits the text into an array of strings)</em>
  - Folder <code>util</code> <em>(Contains auxiliary classes)</em>
    - Class <code>DateFormat</code> <em>(Sets the selected date format)</em>
    - Class <code>Logger</code> <em>(Creates event and error logs)</em>
  - Folder <code>validator</code>
    - Class <code>Validator</code> <em>(Contains methods to check the value)</em>
