# Hello World Static Web Application

This repository now contains a simple static HTML and JavaScript site that displays `Hello World`.

## What is included

- `index.html` — static HTML page with JavaScript
- `.github/workflows/azure-webapp-deploy.yml` — GitHub Actions workflow to deploy to Azure App Service

## Run locally

1. Open `index.html` in a browser, or use a static server.
2. The page displays `Hello World test` using JavaScript.

## Deploy to Azure App Service

1. Create an Azure Web App (Linux).
2. Download the publish profile from the Web App.
3. Add a GitHub secret named `AZURE_WEBAPP_PUBLISH_PROFILE` with the publish profile contents.
4. Replace `<your-app-name>` in `.github/workflows/azure-webapp-deploy.yml`.
5. Commit and push to `main`.

The app will be available at:

`https://<your-app-name>.azurewebsites.net`

## Notes

- This is a static web app, not a Java backend app.
- You can remove Spring Boot files if they still exist from previous work.
