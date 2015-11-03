
# TicTacToeP206
*The game tick tack toe from P206*

#Design
In this report we will present to you a documentation of our project in Software Engineering. The assingment stated that using Markdown would deliver us a extra point, we also found that the plain document texting made project goals, vision and all around devolopement clear.

##Extra points
The assingment features a few extra points teams can get aside from using markdown for our work documentation. We sought-after few of those including using automated continuous integration server, the Teacher recommended using Travis and so we did.
Travis automates triggering a build and test upon each integration and makes detection of a potential integration bug easier.


## Project content
- **Build.java** (Builds the world and contains variables that game.java has access to)
- **Game.java** (Contains the main logic for the game)
- **TicTacToeTest.java** (Contains the tests we've built to make sure the programs runs accordingly)
- **build.gradle** (The gradle build file that we used)
- **docs** (Markdown files containing project report)

##Programming rules
Java

- **1. Classes**
Classes are written in upper camel casing, where the first letter in the word is capitalized.
<br />
Example: UpperCamelCasing

- **2. Functions**
Functions are written in lower camel casing, where the first letter in the word is lower case.
<br />
Example: camelCasing

- **3. General**
We used K&R indent style where a curly bracket is inserted after a statement and below the contents on the statement. Everything within a statement is indented for each curly bracket used.

<br />
Example:
```
public static void play(){
	do{	
		play(Build.turn);		
	}while(!Build.gameOver);	
}
```
