# Git Hands-on Labs

This repository contains the implementation of five Git hands-on labs. These labs cover the fundamentals of Git version control, including repository initialization, configuration, file tracking, branching, merging, conflict resolution, and remote repository synchronization.

---

# Objectives

- Learn and practice essential Git commands.
- Configure Git on a local machine.
- Manage files using Git.
- Ignore unnecessary files using `.gitignore`.
- Work with branches and merge changes.
- Resolve merge conflicts.
- Synchronize local and remote repositories using GitHub.

---

# Prerequisites

Before performing the labs, ensure the following software is installed:

- Git
- GitHub Account
- Notepad++ (configured as Git default editor)
- Windows Command Prompt / Git Bash

---

# Lab 1: Git Configuration, Environment Setup, and Initial Repository

## Objective

- Install and verify Git.
- Configure Git username and email.
- Configure Notepad++ as the default Git editor.
- Initialize a local Git repository.
- Add, commit, push, and pull files.

## Steps Performed

### 1. Verify Git Installation

- Checked Git installation.
- Verified Git version.

### 2. Configure Git

Configured:

- Global username
- Global email address

### 3. Configure Default Editor

Configured Notepad++ as the global Git editor.

### 4. Initialize Repository

- Created project folder `GitDemo`
- Initialized Git repository using:

```bash
git init
```

### 5. Create and Track File

Created:

```
welcome.txt
```

Added sample content.

Checked repository status:

```bash
git status
```

Staged the file:

```bash
git add welcome.txt
```

Committed changes:

```bash
git commit -m "Initial Commit"
```

### 6. Connect with Remote Repository

Connected local repository to GitHub.

Pushed commits:

```bash
git push origin main
```

Pulled latest updates:

```bash
git pull origin main
```

---

# Lab 2: Using .gitignore

## Objective

Ignore unnecessary files and folders from version control.

## Steps Performed

### 1. Created Test Files

Created:

```
test.log
```

Created folder:

```
log/
```

### 2. Configure .gitignore

Created or updated:

```
.gitignore
```

Added:

```text
*.log
log/
```

### 3. Verify

Verified ignored files using:

```bash
git status
```

Only `.gitignore` appeared for tracking.

### 4. Commit

```bash
git add .gitignore
git commit -m "Added .gitignore"
```

---

# Lab 3: Branching and Merging

## Objective

Create a new branch, perform changes, and merge them back into the main branch.

## Steps Performed

### 1. Create Branch

```bash
git branch GitNewBranch
```

List branches:

```bash
git branch
```

### 2. Switch Branch

```bash
git checkout GitNewBranch
```

### 3. Add New File

Created a new file.

Added custom content.

Committed changes.

```bash
git add .
git commit -m "Added new file in GitNewBranch"
```

### 4. Merge with Main Branch

Switched to master/main branch.

Compared differences.

Merged:

```bash
git merge GitNewBranch
```

### 5. Cleanup

Viewed commit history:

```bash
git log --oneline --graph
```

Deleted merged branch:

```bash
git branch -d GitNewBranch
```

---

# Lab 4: Merge Conflict Resolution

## Objective

Understand and resolve merge conflicts.

## Steps Performed

### 1. Create Branch

Created:

```
GitWork
```

Modified:

```
hello.xml
```

Committed changes.

### 2. Modify Master Branch

Switched to master.

Created another version of:

```
hello.xml
```

Committed changes.

### 3. Trigger Merge Conflict

Merged branch into master:

```bash
git merge GitWork
```

Git reported a merge conflict.

### 4. Resolve Conflict

Opened conflicting file.

Resolved conflicting sections manually.

Saved changes.

Staged resolved file:

```bash
git add hello.xml
```

Committed merge:

```bash
git commit
```

### 5. Ignore Backup Files

Updated:

```
.gitignore
```

Added:

```text
*.orig
```

Committed updated `.gitignore`.

---

# Lab 5: Cleanup and Remote Push

## Objective

Clean the repository and synchronize all changes with GitHub.

## Steps Performed

### 1. Verify Repository Status

Checked:

```bash
git status
```

Ensured working tree was clean.

### 2. View Branches

Listed local and remote branches.

```bash
git branch
git branch -a
```

### 3. Synchronize Repository

Pulled latest updates.

```bash
git pull origin main
```

### 4. Push Final Changes

Uploaded all commits.

```bash
git push origin main
```

Verified successful synchronization on GitHub.

---

# Git Commands Used

| Command | Description |
|----------|-------------|
| `git init` | Initialize a new repository |
| `git config` | Configure Git settings |
| `git status` | Check repository status |
| `git add` | Stage files |
| `git commit` | Save staged changes |
| `git push` | Upload commits to GitHub |
| `git pull` | Download latest changes |
| `git branch` | Manage branches |
| `git checkout` | Switch branches |
| `git merge` | Merge branches |
| `git diff` | View differences |
| `git log --graph` | Display commit history graphically |

---

# Learning Outcomes

After completing these labs, I was able to:

- Configure Git successfully.
- Initialize and manage Git repositories.
- Track and commit project files.
- Ignore unnecessary files using `.gitignore`.
- Create, switch, and merge Git branches.
- Resolve merge conflicts effectively.
- Synchronize local and remote repositories.
- Understand the complete Git workflow used in collaborative software development.

---

# Repository Structure

```
GitHandsOn/
│
├── README.md
├── .gitignore
├── welcome.txt
├── hello.xml
├── log/
└── Other lab files
```

---

# Conclusion

These five Git hands-on labs provided practical experience with Git's core features, including repository setup, version tracking, branching, merging, conflict resolution, and GitHub integration. Completing these exercises established a strong foundation in Git workflows commonly used in collaborative software development and real-world DevOps environments.