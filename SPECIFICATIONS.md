GAME SPECIFICS (basically a vague todo and completion list):

The game will have the ability to create "saves". These will, in essence be "runs" of the game. 

In terms of data, they will be stored as JSON code which can be read from to reveal all the details needed to 
create the "save" in game form.
In terms of the game, each save will comprise 5-6 sections (more is possible), which will, in turn, comprise about 10-20 
levels (again, more is possible). The layout and details of these will be randomly generatedfor each save.

The point of the game is to complete a circuit around a cube inside a room. The rooms contain an entry door, which will be 
open, a cube, an exit door and possibly, later on, obstacles which alter how you can complete the circuit. The circuit
will begin in the first room and the line will continue through each room in the level. Each section is a new circuit. 

Every n number of seconds/minutes, a pulse will go through the circuit. If, when the pulse comes, the circuit does not reach the
door at the end, the circuit will be randomly scrambled and must be re-completed. If the circuit is complete, the door will open.
n will probably be decreased each section.

The "circuit" will be made of a set of points, connected by connections. A connection has a point it goes to, and a point it
comes from. When the pulse comes, each the game will check the list of connections to see whether the pointfrom of the first
connection is the pointto of the next connection, and so on. If all the connection join like this, and eventually reach the end 
point (at the door), the pulse succeeds.

Each connection is basically a tile on the cube. There can be multiple tiles per face of the cube. Each tile has a set of 
(probably four) points considered "available", all of which can occupy the positions of pointto and pointfrom.
Level will have access to set of connections that represents all the connections on the cube.

There will probably be a score, which is specific per "save". I don't think we should have a "load level" screen, as in each 
section the levels are connected (in the 3d world, via the door. We'll need a way of connecting the doors - onvoling loading a new 
"room"). We will, however, probably need a "select section" screen. And, obviously, a "select save".

So, TODO - 
    integration between engine and core (begun)
    the connection and level code, in terms of points, needs to be re-written (by me(tom))
    selection of tiles (selectedTile buffer in Main)
    CONNECTIONS (how to do?)
    point-to-position code 