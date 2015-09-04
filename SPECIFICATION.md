**lex-game Specification**
==========================

**_This game specification basically acts a vague todo and completion list, while 
also serving to example our desired end product._**

The game will have the ability to create "saves". These will, in essence, be 
"runs" of the game.

In terms of data, the saves will be stored as JSON which can be read from to 
reveal all the details needed to create the "save" in game form. 

In terms of the game, each save, or run of the game, will contain 5-6 sections (more is 
possible), which will, in turn, contain about 10-20 levels (again, more is 
possible). The layout and details of these will be randomly generated for each 
save.

The point of the game is to complete a circuit around a cube inside a room, the 
course of the circuit being a line/wire. Each room contains an entry door (which 
will be open), a cube, with multiple panels on each sides, an exit door and 
possibly, later on, obstacles which alter how you can complete the circuit. 
The circuit will begin in the first room and the line will continue through 
each room in the level. Each section is a new circuit.

Every *n* number of seconds/minutes, a pulse will go through the circuit. 
If, when the pulse comes, the circuit does not reach the door at the end, 
the circuit will be randomly scrambled and must be re-completed. If the circuit 
is complete, the door will open. n will probably be decreased each section.

The circuit/line/thingy will have a set of points, connected by "connections" - 
parts of the line between points. A connection has a point it goes to, and a 
point it comes from. When the pulse comes, the game will check the list of 
connections to see whether all the collections are actually connected - this
will be done by checking connections that share common points. If all the 
connection join like this, and eventually reach the end point (at the door), 
the pulse succeeds.

Each connection is basically a tile on the cube. There can be multiple tiles per 
face of the cube. Each tile has a set of (probably four - maybe this differs per 
tile?) points considered "available", all of which can occupy the positions of the 
start point and tge end points. 

Any code representing a level, or room, will have access to set of connections 
that represents all the connections on the cube.

There will probably be a score, which is specific per "save". 

I don't think we should have a "load level" screen, as in each section the levels 
are connected (in the 3d world, via the door. We'll need a way of connecting the 
doors - involing loading a new "room"). We will, however, probably need a "select 
section" screen. And, obviously, a "select save".

There will also be the concept of "tools". These perform functions on the 
connections (tiles), allowing for the manipulation of the circuit by which 
the game is won.
We will need an overlay in-game for the use and selection of these, and 
obviously graphics for them as well.

So, TODO:
    --integration between engine and core (begun)
    --upgrade connection and point code
    --upgrade level and section code
    --make it all JSON-compatible
    --point-to-position code (part of engine/core intergration)
    --tile selection
    --UIs (design + code)
    --continue tools, make engine code for this, graphics
    
Everyone, make sure you have read this updated specification and that you agree with it, and update it as you see fit. --Tom