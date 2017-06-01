# CS/COE 1530 - Software Engineering
Summer Semester 2017

### ASSIGNED 25 MAY 2017, DUE 8 JUNE 2017

## Deliverable 1

For the first sprint, each group will need to:

1. Determine initial user stories for the project, including prioritization
2. Write a walking skeleton and prototype UI of the application using gradle, which should include unit tests 
3. Write about the various decisions that the group came to, and how they did so

The team should determine the Scrum Master for this first sprint.  The Scrum Master will change each sprint.

## Format

For the first sprint, you will turn in:

1. A cover page, in the format described below
1. A screenshot of your product backlog on GitHub Projects
2. A description of decisions made in the sprint
3. A "walking skeleton" application available on GitHub (ADD ME AND THE TA AS COLLABORATORS!  Usernames "laboon" and "tazin-afrin").  This should include a basic UI of the program - note that this does not need to have any functionality asociated with it, and it may change in the future.

Each of these paper sections shall be CLEARLY MARKED (i.e. they should each have titles and start on their own page).

Format for cover page:
* The title "*your team name* - SPRINT 1 DELIVERABLE"
* The names of the people in the group, and their GitHub or GitLab username.  Mark down who the Scrum Master is this sprint, e.g. "Jane Doe (Scrum Master)"
* The date that it is due (8 JUNE 2017)

## Grading
* User Stories and Ranking: 25% of grade
* Walking Skeleton: 50% of grade
* Description of Decisions: 25% of grade

User stories shall be in the Connextra template ("As a.. I want.. so that..") and provide good, user-level descriptions of user needs and wants.  User stories should be printed in order of priority.  It is NOT expected that you will complete every single user story, or even that these are the final versions of the user story; they may change and be prioritized differently as the sprints go on.

All user stories shall have story points listed, either in the main description or in the comments.

User stories should flow from the needs of the customer.  Your discussions with the customer should guide the user stories themselves as well as their prioritization.

The number of user stories will vary based on the project, but it should be at least eight at the VERY minimum.  If there are fewer than eight stories, the project may be too small or your user stories too big.

The walking skeleton __must__ compile and show a basic UI for the application.You can have more functionality if you like, but it is essential that your program compiles, runs and displays a basic UI without error!

This basic UI should display:

1. The game area (including the 36 squares of the game with labels)
2. Tokens on the board, indicating players. 
3. A status area showing the the names of each player, along with their owned properties and current money

The game should ask for the number of players and names upon startup, which will be displayed in the status area.

The basic UI does _not_ need to respond to commands or have additional functionality for the first sprint.  However, note that you will have to add these soon and so it is recommended you have placeholders in your code for where functionality will occur.

The basic UI may change over the course of the project.

The walking skeleton __must__ be able to run on __everybody's__ computer!  Everybody should have access to the repository on GitHub and able to make commits by the end of this sprint.

You must "tag" the particular commit you want to have graded with the tag "D1".  Make sure you make an annotated and not a lightweight tag.  Also be sure you push the tag up to GitHub specifically!  Pushing up the branch to origin will NOT automatically push up the tag as well, you must do so separately.  If you want to tag the current commit, you may do so with the following commands:

```
git tag -a D1 -m "D1"
git push origin D1
```

Further details on tagging are here: https://git-scm.com/book/en/v2/Git-Basics-Tagging

The description of decisions should be, at an absolute minimum, one page of text.  It should include any background research you did on the domain, your interactions with the customer, and your team's opinions on prioritization.  Be sure to include any __disagreement__ your team had internally!  Software engineering is rarely without some sort of disagreement about the direction of the software. 

The description of decisions should also indicate what you think is effective and ineffective during this sprint, and what you plan to do about these going forward.  For example, stand-ups took up too much time so we're shortening them, people were stepping over each other's code so the team is going to use a different branching model, etc.  This concept of continuous improvement is important to the Scrum methodology.

Yes, grammar and spelling count.  Points will be deducted for more than one grammatical or spelling error per section.  Yes, this is important.

The needs of the user/customer (i.e., Bill Laboon) will be determined in class by interviewing the user/customer (once again, i.e., Bill Laboon).

## The Game

In this class, we are going to make a game, Oakland Oligarchy.  In this game, multiple players will roll a set of two dice, and move their token the number of squares indicated.  Each square will correspond to either an action in the game, or a property.  If a different player owns the property, the player must pay the rent on the property to the owner.  If the player already owns the property, nothing happens.  If the property is unowned, the player may purchase the property.

If a square is an action square, some specified action takes place.  These actions may include the player receiving money, having money or properties removed from them, allowing an unowned property to be purchased from the board, etc.

Actions should have some narrative associated with them ("Your property 339 Oakland Ave has been condemned!  It has been returned to city ownership.", not "Lose a property.").  Feel free to be creative.

Grouping of properties, specific actions and their narratives, values of properties, and naming of properties are at the discretion of the developers, but should be Oakland-related.

There should be a total of 36 spaces arranged in a square format (10 spaces on each side).

At each turn, players may initiate trades of property with other players.

Owned properties and current money shall be visible to all users.

We will start by allowing up to four players to play against each other on the same computer.  Future functionality may include playing the computer (AI), playing by email (correspondence), or via a server.

There should be a way to save and load games locally.

Further details on what other features, functionality, etc. may be found by interviewing the customer/user during the stakeholder interaction exercise.  Features and functionality are subject to change as the customer better understands the system and their own needs.

## Other

You must use the Java Swing framework for the graphical user interface.  You can use the following repository to either brush up on your Swing or learn it on your own: https://github.com/laboon/GameOfLife This contains a graphical version of Conway's Game of Life.

The following files from my CS0401 class may also be helpful as examples:

1. Frames - https://github.com/laboon/cs0401/blob/master/sample_code/FrameDemo.java
1. Panels - https://github.com/laboon/cs0401/blob/master/sample_code/PanelDemo.java and https://github.com/laboon/cs0401/blob/master/sample_code/PanelDemo2.java
2. Extending Panels - https://github.com/laboon/cs0401/tree/master/sample_code/extended_jpanel
3. Creating and Interacting with Buttons - https://github.com/laboon/cs0401/blob/master/sample_code/ButtonDemo.java
4. Creating a Grid Layout - https://github.com/laboon/cs0401/blob/master/sample_code/GridDemo.java
5. Dynamically Changing A Button - https://github.com/laboon/cs0401/blob/master/sample_code/NameChangeButtonDemo.java

We will also have an in-class exercise for a Swing refresher.

Please feel free to email me or come to office hours to discuss any problems you have.
