# Hello World Java Web Application

This repository now contains a simple Java Spring Boot web application that serves a `Hello World` page.

## What is included

- `pom.xml` — Maven build file for a Spring Boot web app
- `src/main/java/com/example/helloworld/HelloWorldApplication.java` — Spring Boot app with a `GET /` endpoint
- `.github/workflows/azure-webapp-deploy.yml` — GitHub Actions workflow to build and deploy to Azure

## Run locally

1. Install Java 17 and Maven.
2. From the repo root:
   ```powershell
   mvn clean package
   java -jar target/hello-world-webapp-0.0.1-SNAPSHOT.jar
   ```
3. Open `http://localhost:8080` in your browser.

## Deploy to Azure App Service

1. Create an Azure Web App (Linux) and download the publish profile.
2. Add a GitHub secret named `AZURE_WEBAPP_PUBLISH_PROFILE` with the publish profile contents.
3. Replace `<your-app-name>` in `.github/workflows/azure-webapp-deploy.yml`.
4. Commit and push to `main`.

The app will be available at:

`https://<your-app-name>.azurewebsites.net`

## Notes

- This is a Java web application, not a static HTML site.
- You can remove `index.html` and `message.txt` if you no longer need the old static site files.
