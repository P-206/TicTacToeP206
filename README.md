[![Build Status](https://travis-ci.org/P-206/TicTacToeP206.svg?branch=master)](https://travis-ci.org/P-206/TicTacToeP206)
[![codecov.io](https://codecov.io/github/P-206/TicTacToeP206/coverage.svg?branch=master)](https://codecov.io/github/P-206/TicTacToeP206?branch=master)
<a href="https://scan.coverity.com/projects/p-206-tictactoep206">
  <img alt="Coverity Scan Build Status"
       src="https://scan.coverity.com/projects/6879/badge.svg"/></a>


<a href="https://codecov.io/github/P-206/TicTacToeP206">Code Coverage</a>


# TicTacToeP206
*The game tick tack toe from P206*

## Project content
- **Build.java** (Builds the world and contains variables that game.java has access to)
- **Game.java** (Contains the main logic for the game)
- **TicTacToeTest.java** (Contains the tests we've built to make sure the programs runs accordingly)
- **build.gradle** (The gradle build file that we used)

##Programming rules
Java

- **1. Classes**
Classes are written in upper camel casing, where the first letter in the word is capitalized.
<br Example: UpperCamelCasing/>

- **2. Functions**
Functions are written in lower camel casing, where the first letter in the word is lower case.
<br Example: camelCasing/>

- **3. General**
We used K&R indent style where a curly bracket is inserted after a statement and below the contents on the statement. Everything within a statement is indented for each curly bracket used.

<br Example:/>
```
public static void play(){
	do{	
		play(Build.turn);		
	}while(!Build.gameOver);	
}
```

