## Exercise 7: Code Review

Each person in your group should review the code written so far and issue a pull request with a refactoring fix.  "Refactoring" refers to modifying code without changing the actual functionality of the code.  Somebody else in your group will then review it, make comments, and if all is well, merge it in.

Some of the things which you should look for when reviewing code include:

1. Poor design decisions
2. Magic numbers (e.g., `int numMinutes = numHours * 60` would be better written with a constant `final int MINUTES_PER_HOUR = 60; int numMinutes = numHours * MINUTES_PER_HOUR`)
3. Poorly named variables
4. Poor algorithm choice
5. Poor, misleading, or missing comments
6. Unreadable code
7. Missing JavaDoc
8. Missing tests
9. Tautological tests (e.g., `assertTrue(true)`)
9. Anything which would make the codebase better

### How To Issue a Pull Request

1. Ensure you have the latest version of your group's repo (`git pull`)
1. Ensure you are in master (`git checkout master`)
2. Make a new branch (`git checkout -b BRANCH_NAME`)
3. You are now in a different branch, BRANCH_NAME.  Make the changes you want to see.
4. Commit those changes (`git commit -am "commit message"`)
5. Push back to origin (GitHub) (`git push origin BRANCH_NAME`)
6. Go the main page of your repository (https://github.com/USERNAME/REPO_NAME)
7. You should see a banner with a green button labeled "Compare & pull request".  Click the button.
8. Add any additional notes you want to the textbox.
9. Click the green "Create pull request" button.

### Review

1. First, email me a link to the PR!  You will need this for credit for the exercise.
2. Ask somebody else to review your code by clicking "No reviews - _request one_" under the "Reviewers".
3. The reviewer should review the changes and make at least ONE comment in the code.  This is done by clicking on the "Files changed" tab, hovering over a line until you see the "+".  Click the "+" button and leave comments.  Note that this review can be as simple as ":+1:" or "I like it" _if_ there is nothing to change.
4. Original developer should make modifications and re-push, if necessary.
5. Otherwise, the _reviewer_ should merge the changes.  This is done by clicking the "Merge pull request" and then "Confirm merge" button.
6. At this point, the status of the PR should have moved from "Open" to "Merged".
6. Optionally, you may delete the branch from your GitHub repo from the web by clicking the "delete branch" button.

If you cannot find anything in your codebase which could have been done better, please email me a link to your repository and I will do my best to critique your code.

If you do not complete this in class, you may complete it by the beginning of next class.

