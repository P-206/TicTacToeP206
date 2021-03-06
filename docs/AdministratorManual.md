# Administration Manual
This TicTacToe game is developed by P-206. Main object for this manual is to help system administrators. It is better for those who read this manual to have basic understanding in Java, Gradle and Travis.

## Introduction
The software required to manage this project are as follows:
* [git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Travis - CI](https://github.com/travis-ci/travis.rb)
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Gradle](https://docs.gradle.org/current/userguide/installation.html)

## Requirements
Our application is hosted as an open repository on github.com on the following url: ***https://github.com/P-206/TicTacToeP206.***
To clone the git repository to your machine use:
```sh
$ git clone [https://github.com/P-206/TicTacToeP206.git] 
```

## Getting Started
After you clone the project you do the following.
```sh
$ gradle build
```
```sh
$ cd build/libs/
```
```sh
$ java -jar TicTacToeP206-0.0.1.jar
```
Then the game TicTacToe is one. You should then input your name and your opponent name.

