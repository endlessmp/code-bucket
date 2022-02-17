# Clone a Github Repo with Token
1. Click on your profile pic -> Settings -> Developer Settings (On the left) -> Personal Access Token
2. Generate a new token, name it somehow and set the Expiration for your needs. Assign at least the repo Rights to the token.
3. Insert the username, the token and the project name (with .git at the end) in the following git command:

```
git clone https://username:mygithubtoken@github.com/username/project.git
```
4. Now execute this command inside the terminal in any folder you want and you will be authenticated and you can commit, push, pull, anything you need!