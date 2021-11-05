# Git

Git is the most popular Version Control System, a versin control system records the changes made in our Code over time in a special database called repository. This allows easy scaling and team projects to be easier.

**Why Git**

1. Free
2. Open-Source
3. Super Fast
4. Scalable
5. Cheap Branching and Merging

**Types of VCS**

1. Centralized VCS : All works on a central repository of data, eg Subversion and Team Foundation.
2. Distributed VCS : All have a different copy of the entire project, eg Git and Mercurial.

**Using Git**

1. Command Line
2. IDEs
3. GUIs(Always have limitations)

*Use the right tool for right job, GUI also have it's Advantages*

**Git Configure**

For username, email, password.

1. System   : All users
2. Global   : All repositories of Current User
3. Local    : Current Repositories

## Git Command

1. git init : Use in any directory to Initializes a Git Repository, it will create a .git folder in your Directory. Here is where git stores information about our project history. If we delete the .git repository we risk losing our Project History.

2. Git Workflow : What we do every day is work on our project making changes in our Directory, when we reach a place where we want to make a Commit/take a Snapshot of our project. In git we have an intermediate step called the Staging Area to hold what we are proposing. Once we have reviewed our changes we commit them to our repository with a message for Documentation.

Once we have made a commit the staging area doesn't get erased instead it stays their for the next change comparison.

git add <filename>      : To Add to Staging Area
git commit -m "Message" : To Push the Changes to Repository

Commit Has the Following Items : ID, Message, Date/Time, Author, Complete Snapshot.

*The Snapshot is extremely memory efficient as it compresses the Data and Doesn't store any duplicate data.*

3. Staging Area : 

    1. git status : For the report of current Repository, see what files have been changed, deleted and if they have been added to the Staging area.

    2. git add <file_name> : To add files to the Staging area.

    3. git commit -m "<Message>"  or git commit <ENTER> Write a short Description : In case the Message seems in-sufficient.

    4. Commit Best Practices:
        1. Commit should not be too big or too small.
        2. Each commits should have a logically seperate change set.
    
    5. Ignore a File : Suppose we have added .gitignore file but we have already commited a file to staging area then that file will have to be removed seperately before push.