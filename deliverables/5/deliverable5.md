## CS/COE 1530 - Software Engineering
### Summer Semester 2017

### DUE DATE: 20 JULY 2017

### Deliverable 5

For the fifth and final sprint, each group will continue implementing user stories, including some new features! You will also turn in several other reports - see the Format section, below.  Finally, you will give a short presentation showing your work to the class.

NOTE: If I see nothing from you in the git commit history for a sprint in master, and you cannot explain and prove it (e.g., you focused on documentation this sprint with the agreement of your teammates, work was done in another branch but couldn't be merged to master, etc.), then you may get a 0 for the entire sprint.

You also retain the ability to anonymously ask that your group be graded individually based on contributions.   I understand that group projects are difficult.  Please feel free to come see me regarding any issues.

### Format

For the final sprint, you will turn in:

1. A cover page, in the format described below
2. An approximately one or two page description of what was accomplished this sprint. This can (but is not limited to) cover details such as:
  * How teams communicated
  * What disagreements arose
  * How problems were resolved
  * Changes in process since first sprint
  * Interactions with customer
  * Challenges writing the code or tests
  * Design patterns or architectural patterns used
  * Anything else that might be of interest
3. User stories completed this sprint, along with their indicated number of story points and total velocity
4. A *link to the code on GitHub/GitLab*.  If neither the TA nor I can access it (that is, usernames laboon and tazin-afrin are not added as collaborators), there is an automatic -15 point deduction. 
5. A list of any defects found (by unit testing, manual testing, or by developers), and how they were discovered and fixed (or if not fixed, why you decided not to fix them this sprint). This can include defects found by unit testing or system testing by QA (or other methods, such as issues found by the customer). If no defects were found, then please write a paper on how you have developed a way to develop software without making any mistakes, because I would be happy to read it!

Each of these sections shall be CLEARLY MARKED (i.e. they should each have titles and start on their own page).

Remember that user stories are not to be marked as complete until they meet the DEFINITION OF DONE - that is, they have been developed, tested, and reviewed according to the plan laid out in the first deliverable.

Remember to use the 1-2-4-8-16 story point format, where 16 points is one developer working only on one story for a sprint.  

Remember that your main goal is to deliver a working version of the software (i.e., can be compiled and executed on any individual member's computer).  Think about that when planning and prioritizing!  During the in-class retrospective and sprint planning session, you can apportion responsibilities, agree on the story ordering, etc.

If I have any questions on the code, I may ask *any* individual member to show me the code running on their computer.  Therefore, if anyone has a problem running the current version of the code, that fact needs to be included as a defect.  Failure to have a working version of the project at end of sprint may mean a drastically lower score for the project.

### Presentation

Your group will demonstrate your program to the class, for a five to ten minute presentation.  This presentation should show a complete game being played and especially show off the additional functionality that you added this final sprint.

You do not need to do a slide deck or have everybody demonstrate the program.  It is sufficient if one person does it, although if you all want to give it that is fine as well.

### Code Review

Once again, code should not be merged to master without the approval of at least ONE other member of the team.  Do this using pull requests and have the reviewer comment on the PR itself.

No code should be committed directly to master.  Points will be lost if any is.

Review consists of checking the code to be merged to master for:

1. Correctness
2. Compilability
2. Readability
3. Optimal algorithm usage
4. Documentation (remember methods should be commented with JavaDoc, complex code should have comments, etc.)
5. Following standard Java practices (e.g., classes should be in PascalCase, variables in camelCase, constants in ALL_CAPS_SNAKE_CASE, etc.)
6. Following any specific standards your team has determined 

### Tagging

You must "tag" the particular commit you want to have graded with the tag "D5".  Make sure you make an annotated and not a lightweight tag.  Also be sure you push the tag up to GitHub specifically!  Pushing up the branch to origin will NOT automatically push up the tag as well, you must do so separately.  If you want to tag the current commit, you may do so with the following commands:

You _must_ use the tag `D5`.  Do not call it `deliverable-5` or `0.5` or anything else other than `D5`.

```
git tag -a D5 -m "D5"
git push origin D5
```

Further details on tagging are here: https://git-scm.com/book/en/v2/Git-Basics-Tagging

#### Format for cover page:

Format for cover page:
* The title "*your team name* - SPRINT 5 DELIVERABLE"
* The names of the people in the group, and their GitHub username.  Mark down who the Scrum Master is this sprint, e.g. "Jane Doe (Scrum Master)"
* The date that it is due (3 AUG 2017)

The customer has decided that there is a risk of people modifying the save files.  You must develop a way of ensuring that users cannot modify these files (for example, giving their player MAXINT dollars).  There are several ways to go about doing this:

1. Using a simple Caesar cipher (e.g., incrementing the ASCII value of all characters written by n, then decrementing by n when reading back in).  See https://en.wikipedia.org/wiki/Caesar_cipher for details.
2. Adding a file checksum (such as an MD5 hash) at the end of the file. https://en.wikipedia.org/wiki/Checksum
3. Implementing a more complex cipher using the `javax.crypto` libraries. https://docs.oracle.com/javase/7/docs/api/javax/crypto/package-summary.html

Any of these ways would count for full credit.  You may assume a non-sophisticated actor when implementing this.  That is, as long as it is not trivially easy to modify the data and thus "cheat" at the game, you will receive full credit.  The threat model of this program does not include the National Security Agency or other state actors.

Remember that the program should provide an appropriate error message (e.g. "Could not read savefile" or "File corrupted") if the file is modified!  Your program should not crash if it finds invalid data.  Remember Postel's Principle!

Secondly, you must implement the 61 Bus System.  There should be four bus squares, one on each side of the board.  The specific location is up to you.  These bus squares will be labeled "61A", "61B", "61C", and "61D".  The "rent" for these squares will double each time a new one is owned.  For example, if you own the "61A", and the rent per square is $100 (this base value is up to you), owning the "61B" square would have the rent be $200, and then owning the "61C" square would mean that the rent is $400.

If a player owns all of the 61 buses, they have acquired a "Transit Monopoly" and win the game automatically.

Please generate user stories based on these new requirements and implement them for the final sprint.

You should also add one or more _additional_ pieces of functionality.  It is up to you to decide what functionality you would like to add.  You may implement more than one piece of functionality, which may give you extra credit to counteract any points lost in other sections.

Possible additional functionality:

1. Change colors of pieces / board
1. Use custom-loadable images for pieces
1. An AI which plays against the user (moves can be random)
1. A "trash talk" box which uses a separate thread and textbox to insult/praise/comment on the game as it is running
1. Show dice being rolled (animation)
1. Ability to do something else in a turn besides roll dice or trade - for example, take away someone else's turn in exchange for losing your turn and $50, or pay $100 to teleport to a random square, etc.
1. "Demo mode" where the computer plays itself
1. Whatever ideas you have!  If you have any questions on whether or not it is permissible, feel free to ask me.

If you have already implemented something which you believe counts as additional functionality, that will count for this.  

#### "Hard" functionality - Extra credit if implemented well

1. Play with people over a network (different computers)
1. A "real" AI which does not move randomly, but follows a strategy and "learns" how to win
1. Other ideas you may have

### Grading

Group Grading:

1. Listing of Completed User Stories And Story Points: 5% of grade
1. Description of Sprint: 5% of grade
1. Listing of Defects: 5% of grade
1. Presentation: 10% of grade
1. Code and Tests: 75% of grade
  * Functionality: Game playable (no regression failures), 61 Bus System, anti-file-tampering system, additional functionality (described above)
  * Code: All methods should be commented (with JavaDoc or similar)
  * Tests: There are unit tests for any "computational" methods (i.e. those that do not display data to the screen)
  * Code quality: Separate computation from display, good method/variable names, code is easy to understand, etc.

Keep in mind that this is the final sprint!  Keep in mind trade-offs during the march to the finish.  You have a hard deadline and you are familiar with how assignments are graded at this point.  What can/should you do to ensure that you meet the goals?

Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for many, if not most, methods.

Defects should include at least the following information:

1. Reproduction Steps (or reference unit test or other test that caught failure)
1. Expected Behavior (What did you expect to happen?)
1. Observed Behavior (What did you actually see happen?)

### Other

Please feel free to email me or come to office hours to discuss any problems you have.

