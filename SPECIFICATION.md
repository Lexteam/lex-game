**lex-game Specification**
==========================

**_This game specification basically acts a vague todo and completion list, while 
also serving to example our desired end product._**

The game will have the ability to create "saves". These will, in essence, be 
"runs" of the game.

In terms of data, the saves will be stored as JSON which can be read from to 
reveal all the details needed to create the "save" in game form. 

In terms of the game, each save, or run of the game, will contain 6+ sections (possiblY infinte?), 
which will, in turn, contain about 10-20 levels (this number is in no way definite).
The layout and details of these will be randomly generated for each save.
In between each level is a corridor, and in between each section a downwards stairwell.
These will hopefully be used for story exposition, once a story is decided upon.

The point of the game is to complete a circuit around a cube inside a room, the 
course of the circuit being a line/wire. Each room contains an entry door (which 
will be open), a cube, with multiple panels on each face, an exit door and 
possibly, later on, obstacles which alter how you can complete the circuit. 
The circuit will begin in the first room and the line will continue through 
each room in the level. Each section is a new circuit.

Every *n* number of seconds/minutes, a pulse will go through the circuit. 
If, when the pulse comes, the circuit does not reach the door at the end, 
the circuit will be randomly scrambled and must be re-completed. If the circuit 
is complete, the door will open. *n* will probably be decreased each section.

Each panel on the cube will have the ability to hold a connection (most panels - 
later on, blank, uneditable panels or otherwise special panels will appear).

There will probably be a score, which is specific per "save". 
The game will auto-save each level. The player cannot save themselves(...pun...intended?...).

There will also be the concept of "tools". These perform functions on the 
connections (tiles), allowing for the manipulation of the circuit by which 
the game is won.
Current tools we have:
-Reverse connection
-Add connection
-Remove connection
-Repair panel
-Change duration

We will need an overlay in-game for the use and selection of these, and 
obviously graphics for them as well.

### So, TODO:
    - integration between engine and core (begun)
    - upgrade connection and point code
    - upgrade level and section code
    - make it all JSON-compatible
    - point-to-position code (part of engine/core integration)
    - tile selection
    - UIs (design + code)
    - continue tools, make engine code for this, graphics
    
Everyone, make sure you have read this updated specification and that you agree with it, and update it as you see fit. --Tom