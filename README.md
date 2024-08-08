Caspar's submission for code cleaning exercise.

I managed to refactor three of the six TennisGame Java classes: 3, 6 and 1.

For ease of seeing my solutions I did not make any new classes to import - also doing
so may have quickly made my solutions very similar, a pitfall I anyway fell into.

Before talking about particular solutions I wanted to talk about principles in each.

I renamed variables to hopefully make it clear what information they stored.

I initialised both player scores in the games constructor. I imagine ints default to
zero for the tests to work, but thought this was the logical choice.  Game1 had the
Class initialise the scores rather than the constructor, and would be interested to
learn whether there is a best practice here.

rather than have a string name declared, and then initialised through a switch statement
or an if else chain, I had each switch statement, or if-else block, return a string.
I only added a variable if naming it added readability.  With well named variables else
where this was not usually necessary.  Using a return in switch statements meant there
did not need to be a break between cases which made the code more concise and readable.

When comparing strings, I used .equals String method, as I believe == compares the reference
and could fail when we would expect it not to.

In all the solutions I ended up using an array of Strings with the points name,
and then using the players score as index to get the appropriate point name.  I found
other solutions very clumsy.

It is bad practice to have these functions large if-else blocks. If I
had my time again I would make a single switch statement -
(tie, both player scores above 3, default) each case executing a separate function to
handle the score in each scenario.

I didn't take a view of whether playerScore += 1 or playerScore++ is clearer/more readable.

I was most happy with my work on Tennis Game 3.  By refactoring three utility functions
to control the logic, preDeuce(), scoresLevel(), scoreDifference(), really
added readability, and given how it handled ties, scoresLevel() was even reusable.

Tennis Game six used switch statements, and I wanted to preserve that logic to show I
could make it better, rather than redesign the program.  As noted above, I ditched the
repetitive switch statements tt turn each player score in to a point name.

I failed to preserve the logic of Tennis 1, partially because my choice to have return
in each if else block rather than storing a variable to return to the end blocked me
from using an early variable in the final else, but the use of a loop there was so horrible
anyway I wouldn't have wanted to preserve the logic.  I can't imagine it could have been
made readable.