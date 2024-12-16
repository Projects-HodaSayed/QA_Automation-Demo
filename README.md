# Demo App

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before you can run this project, you need to have the following installed:
- Java
- IntelliJ IDEA
- Node.js
- Appium Version 2
- A real device or an emulator

### Installation

1. Clone the project from github.
2. Open the project in IntelliJ IDEA.
3. Navigate to the `pom.xml` file, right-click it, select `Maven`, and then `Download dependencies`.
4. Reload the project to ensure all dependencies are properly set up.

## Technologies Used

This project uses Java and incorporates several frameworks and libraries:
- Page Object Model
- Behaviour Data-driven approach
- Data Provider
- Reporting tools

## Review Guidelines

This document outlines the review criteria for test automation code submissions.
structure and coding style.
**General:**

1. **Branching:**
    * **Preferred Approach:** Create a branch directly from the remote repository using github interface.
    * **Alternative Approach:**
        * Create a branch locally using `git checkout -b <branch-name>`.
        * Push the branch to the remote repository using `git push origin <branch-name>`.
2. **Code Structure:**
    * Ensure code follows the defined Page Object Model (POM) structure.

**Code Quality:**

3. **Naming Conventions:**
    * Use camelCase for variables and methods. ex: camelCase
4. **Variable Naming:**
    * Variable names should be clear and descriptive.
5. **Avoid Hardcoding:**
    * Use constants or configuration files for static values.
6. **Commented Code:**
    * Remove unnecessary commented code.
7. **Meaningful Comments:**
    * Add comments to clarify complex logic and improve code readability.

**Test Execution:**

8. **Automation Account:**
    * Use a designated automation account with proper data setup.

**Test Design:**
9. **Test Data:**
    * Use externalized test data for test cases.
12. **Descriptive Function Names:**
    * Use clear and descriptive names for functions that explain their purpose.
13. **No Duplicate Code:**
    * Avoid code duplication. Utilize existing base page and helper functions.

**Java & Appium Specific:**

14. **Locators:**
    * **Do not** store locators inside page object functions.

### Git Workflow
This section outlines the steps involved in cloning a remote repository, creating a branch, making changes, and pushing those changes to the remote branch.
1. Clone the Repository:

Open your terminal or command prompt.
Use the git clone command followed by the URL of the remote repository you want to clone.
Example: `git clone` https://github.com/Projects-HodaSayed/QA_Automation-Demo.git
2. Create a Branch:

There are two approaches to create a branch:

A. Create a branch directly from the remote repository (recommended):

Use the GitHub  interface to create a new branch from the desired location (e.g., main branch).
B. Create a branch locally and push it to remote:

Use `git fetch` command  if you did not find your branch.  
Use the command `git checkout -b <branch-name>` to create a new local branch named <branch-name>.
Make sure this branch name doesn't already exist on the remote repository.
3. Make Changes:

Edit the files in your local repository as needed (start scripting).
4. Commit Your Changes:

Use git add <filename> to stage individual files for commit, or git add . to stage all modified files.
Use the command `git commit -m "<commit message>"` to create a commit with a descriptive message explaining your changes.
5. Push Your Changes to the Remote Branch:

Use the command `git push origin <branch-name> `to push your local branch (<branch-name>) to the remote repository (origin is the default name for the remote repository you cloned from).

## FAQs/ Common Issues
Coming soon.
>>>>>>> f16f33f2a0a0ed8a4ac44202ef39651c8b8e73b8
