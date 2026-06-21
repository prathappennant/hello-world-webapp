# Hello World Web Application

This repository contains a simple static web application and a GitHub Actions workflow to deploy it to GitHub Pages.

## What is included

- `index.html` — displays a Hello World page and loads content from `message.txt`
- `message.txt` — editable text that is shown in the page
- `.github/workflows/pages.yml` — GitHub Actions workflow that deploys the site to GitHub Pages on push to `main`

## How to use

1. Open a terminal in `hello-world-webapp`
2. Initialize the repo if not already:
   ```sh
   git init
   git add .
   git commit -m "Initial commit"
   ```
3. Create a GitHub repository and add it as a remote, for example:
   ```sh
   git remote add origin https://github.com/<your-username>/hello-world-webapp.git
   git branch -M main
   git push -u origin main
   ```
4. When the push completes, the workflow will deploy the site to GitHub Pages.

## Update the page

- Edit `message.txt`
- Commit and push the change
- Browse the site URL again to see the updated message

## GitHub Pages URL

The deployed URL will typically be:

`https://<your-username>.github.io/hello-world-webapp/`

If you want the site to deploy immediately after push, make sure GitHub Pages is enabled for the repository and the workflow has run successfully.
