## CS/COE 1530 - Software Engineering
### Summer Semester 2017

### DUE DATE: 6 JULY 2017

### Deliverable 3

For the third sprint, each group will continue implementing user stories. You will also turn in several other reports - see the Format section, below.  Additionally, the customer has decided on a new piece of functionality which is of the utmost importance and must be added immediately!  See below for details.

NOTE: If I see nothing from you in the git commit history for a sprint in master, and you cannot explain and prove it (e.g., you focused on documentation this sprint with the agreement of your teammates, work was done in another branch but couldn't be merged to master, etc.), then you may get a 0 for the entire sprint.

You also retain the ability to anonymously ask that your group be graded individually based on contributions.   I understand that group projects are difficult.  Please feel free to come see me regarding any issues.

### Format

For the second sprint, you will turn in:

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
4. A *link to the code on GitHub/GitLab*.  If I or the TA cannot access it (that is, usernames laboon and tazin-afrin are not added as collaborators), there is an automatic -15 point deduction. 
4. Details on why you decided on those user stories
5. A list of any defects found (by unit testing, manual testing, or by developers), and how they were discovered and fixed (or if not fixed, why you decided not to fix them this sprint). This can include defects found by unit testing or system testing by QA (or other methods, such as issues found by the customer). If no defects were found, then please write a paper on how you have developed a way to develop software without making any mistakes, because I would be happy to read it!

Each of these sections shall be CLEARLY MARKED (i.e. they should each have titles and start on their own page).

Remember that user stories are not to be marked as complete until they meet the DEFINITION OF DONE - that is, they have been developed, tested, and reviewed according to the plan laid out in the first deliverable.

Remember to use the 1-2-4-8-16 story point format, where 16 points is one developer working only on one story for a sprint.  

Remember that your main goal is to deliver a working version of the software (i.e., can be compiled and executed on any individual member's computer).  Think about that when planning and prioritizing!  During the in-class retrospective and sprint planning session, you can apportion responsibilities, agree on the story ordering, etc.

If I have any questions on the code, I may ask *any* individual member to show me the code running on their computer.  Therefore, if anyone has a problem running the current version of the code, that fact needs to be included as a defect.  Failure to have a working version of the project at end of sprint may mean a drastically lower score for the project.

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

### Clock Story

__As a user__  
__I want to have a clock displayed__  
__So that I know how much I have spent playing this game__  

I would like a clock which shows, in hours:minutes:seconds format (e.g., `01:20:07` would show a game that has been played for 1 hour, 20 minutes, and 7 seconds) how long the game has been played.  It should update once per second.  You should execute the clock timer on a separate thread.

Note that this clock starts from the beginning of the game and counts only while the game is being played.  If the user saves the game, the current time will be saved, and the clock will restart from that time after the saved game is loaded.  It will not take into account any time spent while the game is not actively running.

Also note that it has not yet been required to implement game save/load - this will come next sprint (spoiler alert).

### Tagging

You must "tag" the particular commit you want to have graded with the tag "D3".  Make sure you make an annotated and not a lightweight tag.  Also be sure you push the tag up to GitHub specifically!  Pushing up the branch to origin will NOT automatically push up the tag as well, you must do so separately.  If you want to tag the current commit, you may do so with the following commands:

You _must_ use the tag `D3`.  Do not call it `deliverable-3` or `0.3` or anything else other than `D3`.

```
git tag -a D3 -m "D3"
git push origin D3
```

Further details on tagging are here: https://git-scm.com/book/en/v2/Git-Basics-Tagging

#### Format for cover page:

Format for cover page:
* The title "*your team name* - SPRINT 3 DELIVERABLE"
* The names of the people in the group, and their GitHub username.  Mark down who the Scrum Master is this sprint, e.g. "Jane Doe (Scrum Master)"
* The date that it is due (06 JULY 2017)

### Grading

Group Grading:

1. Listing of Completed User Stories And Story Points: 5% of grade
1. Details of Why Those User Stories Were Chosen: 5% of grade
1. Description of Sprint: 10% of grade
1. Listing of Defects: 15% of grade
1. Code and Tests: 65% of grade
  * Functionality: Players can buy, sell, trade, and auction property, "action" squares work, players can win/lose, tokens displayed, and clock functionality is added.
  * Code: All methods should be commented (with JavaDoc or similar)
  * Tests: There are unit tests for any "computational" methods (i.e. those that do not display data to the screen)
  * Code quality: Separate computation from display, good method/variable names, code is easy to understand, etc.


Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for many, if not most, methods.

Defects should include at least the following information:

1. Reproduction Steps (or reference unit test or other test that caught failure)
1. Expected Behavior (What did you expect to happen?)
1. Observed Behavior (What did you actually see happen?)

### Other

Please feel free to email me or come to office hours to discuss any problems you have.
