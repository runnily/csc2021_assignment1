# This is an implementation of a project manager which manages students data in a univeristy deparments. The following features include:
1. It must be possible to create multiple Record Managers (e.g. for different departments).
2. The data in the Record Manager only needs to exist during runtime - There does not need to be any persistence beyond the lifetime of the program.
//no files
3. The following information must be stored about each student by the Record Manager: unchangeable ID, name, postal address (as a single String), e-mail address, degree course title and the date they first enrolled on the course (as either a String or a Calendar) plus a list of modules. Each module consists of a module code (which you can assume is like Newcastle codes – three letters + four numbers), the module title, the module mark (as an integer between 1 and 100 – you may assume a student scores at least 1%) and the number of credits for that module. There is no limit on the number of modules a student can take.
//student should have the relevant details:
•	String: ID: immutable: cannot be changed need to learn more about immutable classes.
•	String: Name
•	String: Address
•	String: Email address
•	String: Degree course title
•	Date: first enrolled
•	A list of modules: class
•	String: Module code
•	String: Module title
•	Int: Module mark
•	Int credits.

4. A full list of all students and their details can be retrieved from a Record Manager.
// To string method
5. A user can search the Record Manager (for completely matching) student names.
  - This should return a list of all matches and their details.
// How would you implement this? //returns the student data structure which holds student name // or implementing it using what search
6. The Record Manager can be used to change a student’s name and postal address.
//change students name using set methods
//change address using set methods
7. The Record Manager can be used to add the details of a new module for a student, given that student’s ID.
//Record manager is used to add student details of a new module
//We could add a new module
8. The Record Manager can be used to calculate a student’s average mark as a double, given that student’s ID. This average is simply the average of all the module marks currently held on a student’s record.
// method called average takes in students marks given by students ID
//search method would be used here
// calculate average mark returns it
// gets module marks in student name using sequential search
