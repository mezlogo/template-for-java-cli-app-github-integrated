# template-for-java-cli-app-github-integrated

![CI](https://github.com/mezlogo/template-for-java-cli-app-github-integrated/actions/workflows/build.yml/badge.svg)

Zones:
1. local development with gradle, junit5, picocli and jacoco
2. ci/cd with github actions: build, test, report, release
3. continuous inspection with sonarcloud

Setting up:
- sonarcloud:
  - sigh in with github account
  - create a new project
  - copy generated toke into github's project settings: `project>settings>security>new repository's environment` add env `SONAR_TOKEN`
- github:
  - on every push CI runs build with tests and reports to sonar
  - on every tag CI releases new artifact
- installation:
  - gradle builds application
  - github releases an artifact
  - aur composes new aur package for archlinux with bash and zsh completion
