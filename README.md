# Project Name

A clone of app with the database of IMDb. The project is built with React, SpringBoot, and PostgreSQL.

## Installation

Instructions for how to install, configure, and get the project running on your local machine.

### BACKEND

```
cd backend-clone-imdb
java --version # should be 17
jenv local 17.0.5
mvn clean 
mvn compile
mvn clean package
docker build -t backend-imdb . 
```

### FRONTEND


```
cd frontend-clone-imdb
node --version # should be 20
npm install --global  yarn
yarn install 
yarn build
docker build -t frontend-imdb . 


```

## Usage
```bash
docker-compose up
```

## Dependencies

JAVA 17, Node Version 20, PostgreSQL, React, SpringBoot

## Contributing

Guidelines for contributing to your project, including how to submit pull requests or bug reports.

## License

OpenSource.
