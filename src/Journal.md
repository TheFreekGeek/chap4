Phase 1
Created project. Removed sample code. Created Guardian class with the 2 variables. In main, instantiate 4 guardians, added values, added code to display values.
If the defense rating was able to be modified by outside code someone else could modify defense ratings and impact playability.
Direct field access could all any developer with access to any part of the code to directly change this data.

Phase 2
Set instance variables to private. Broke all links from main to the object's variables. Created a getter and a setter for each variable. Updated code in main. Repaired the links to the objects by setting connections to the getters and setters instead of the variables. I think this is the better way to go because it is no longer looking at the originating variables, it looks at the data that we want viewed. I also feel this is a likely step to need and understanding of when we start accessing outside data. Created the isLegendary method and incorporated it into main.
