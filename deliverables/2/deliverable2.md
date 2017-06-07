## CS/COE 1530 - Software Engineering
### Summer Semester 2017

### DUE DATE: 22 June 2017

### Deliverable 2

For the second sprint, each group will start implementing user stories on top of the walking skeleton developed for the first sprint. You will also turn in several other reports - see the Format section, below.

NOTE: If I see nothing from you in the git commit history for a sprint in master, and you cannot explain and prove it (e.g., you focused on documentation this sprint with the agreement of your teammates, work was done in another branch but couldn't be merged to master, etc.), then you may get a 0 for the entire sprint.

### Format

For the second sprint, you will turn in:

1. A cover page, in the format described below
2. An approximately one or two page description of what was accomplished this sprint. This can (but is not limited to) cover details such as:
  1. How teams communicated
  1. What disagreements arose
  1. How problems were resolved
  1. Changes in process since first sprint
  1. Interactions with customer
  1. Challenges writing the code or tests
  1. Design patterns or architectural patterns used
  1. Anything else that might be of interest
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

Code should not be merged to master without the approval of at least ONE other member of the team.  Please do this using pull requests and have the reviewer comment on the PR itself.  We will go over this with an in-class.

If you perform any merges of code into the master branch before the day of the code review exercise, they should still be reviewed, but they do not need to be PR'd (although I recommend it).  After this sprint, no code should be committed directly to master.  Adding documentation or similar artifacts may be committed directly to master, but this is not recommended.

Review consists of checking the code to be merged to master for:

1. Correctness
2. Compilability
2. Readability
3. Optimal algorithm usage
4. Documentation (remember methods should be commented with JavaDoc, complex code should have comments, etc.)
5. Following standard Java practices (e.g., classes should be in PascalCase, variables in camelCase, constants in ALL_CAPS_SNAKE_CASE, etc.)
6. Following any specific standards your team has determined 

### Tagging

You must "tag" the particular commit you want to have graded with the tag "D2".  Make sure you make an annotated and not a lightweight tag.  Also be sure you push the tag up to GitHub specifically!  Pushing up the branch to origin will NOT automatically push up the tag as well, you must do so separately.  If you want to tag the current commit, you may do so with the following commands:

```
git tag -a D2 -m "D2"
git push origin D2
```

Further details on tagging are here: https://git-scm.com/book/en/v2/Git-Basics-Tagging

#### Format for cover page:

Format for cover page:
* The title "*your team name* - SPRINT 2 DELIVERABLE"
* The names of the people in the group, and their GitHub username.  Mark down who the Scrum Master is this sprint, e.g. "Jane Doe (Scrum Master)"
* The date that it is due (22 JUNE 2017)

### Grading

Group Grading:

1. Listing of Completed User Stories And Story Points: 5% of grade
1. Details of Why Those User Stories Were Chosen: 5% of grade
1. Description of Sprint: 15% of grade
1. Listing of Defects: 15% of grade
1. Code and Tests: 60% of grade
  1. Functionality: Pieces can move and take turns, players can buy property (no need for auctions yet), players are charged rent when they land on someone else's property (automatic deduction of cash when player lands on it - no need for win/loss code, mortgaging, trading, etc for this deliverable)
  1. Code: All methods should be commented (with JavaDoc or similar)
  1. Tests: There are unit tests for any "computational" methods (i.e. those that do not display data to the screen)
  1. Code quality: Separate computation from display, good method/variable names, code is easy to understand, etc.


Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for many, if not most, methods.

Defects should include at least the following information:

1. Reproduction Steps (or reference unit test or other test that caught failure)
1. Expected Behavior (What did you expect to happen?)
1. Observed Behavior (What did you actually see happen?)

### Other

Please feel free to email me or come to office hours to discuss any problems you have.
