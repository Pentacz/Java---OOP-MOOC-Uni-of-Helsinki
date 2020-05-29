# Dungeon

Small "game" on two dimensional table, using classes inheritance. Player (sign "@") moves by using keyboard ("wasd") and tries to catch vampires (letter "v") that are moving randomly.

Ease to read code text here:
https://tmc.mooc.fi/paste/c6ZrjkTP34cOFxRgw_bpQw



Extended description:

In the game, the player is in a dungeon full of vampires. The player has to destroy the vampires before his lamp runs out of battery (fixed amount of rounds) and the vampires can suck his blood in the darkness. The player can see the vampires with a blinking of their lamp, after which they have to move blind before the following blinking. With one move, the player ("@") can walk as many steps as they want (using "wasd" as an arrows, direction). Then the vampires ("v") move randomly one step, but cannot step on the player, neither out of dungeon.

The game situation, i.e. the dungeon, the player and the vampires are shown in text form. The first line in the print output tells how many moves the player has left (that is to say, how much battery the lamp has). After that, the print output shows player and vampire positions, which in turn are followed by the game map.
