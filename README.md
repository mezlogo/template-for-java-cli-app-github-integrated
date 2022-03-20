# template-for-java-cli-app-github-integrated

![CI](https://github.com/mezlogo/template-for-java-cli-app-github-integrated/actions/workflows/build.yml/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=mezlogo_template-for-java-cli-app-github-integrated&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=mezlogo_template-for-java-cli-app-github-integrated)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=mezlogo_template-for-java-cli-app-github-integrated&metric=coverage)](https://sonarcloud.io/summary/new_code?id=mezlogo_template-for-java-cli-app-github-integrated)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=mezlogo_template-for-java-cli-app-github-integrated&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=mezlogo_template-for-java-cli-app-github-integrated)

TOC:
- what is included
- how to get started
- development notes
- project workflow
- #TODO how to distribute 

## what is included
- CI/CD based on github actions. See `.github/workflows/` dir and `Actions` tab
  - on push: build, test and report project
  - on tag: release
- Continuous inspection with sonarcloud
- Project managment with github: issue tracker, milestone aggregation, pull requests, code reviews and releases
- Distribution CLI app with picocli and gradle's application plugin

## how to get started
1. Sign up `https://sonarcloud.io` with your github account
2. Create new project `from github actions`
3. Copy `SONAR_TOKEN` env variable to github's repository: `project>settings>security>new env var`
4. Assert repo contains `/gradlew` and `/gradle/wrapper` files

## development notes
- While writing code use sonarlint IDE plugin for instant code quality reports
- While testing code use jacoco reports for instant coverage reports
- When troubleshoot sonarcloud try to directly upload reports without github actions: `SONAR_TOKEN=XXX ./gradlew clean test build sonarqube`
- When troubleshoot sonarqube try to deploy sonar server locally: `docker run --rm -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest`

## project workflow
1. Create an issue
2. Create or connect the issue with a milestone
3. Create a branch for issue
4. Make changes to a feature branch
5. Push changes
6. Create PR from a branch
7. Make a code review
8. Check a github ci/cd build status
9. Check a sonarcloud report
10. Rebase feature and delete branch
11. Pull new main branch
