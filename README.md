██████╗ ███████╗ █████╗ ████████╗██████╗  ██████╗ ██╗  ██╗
██╔══██╗██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔═══██╗╚██╗██╔╝
██████╔╝█████╗  ███████║   ██║   ██████╔╝██║   ██║ ╚███╔╝ 
██╔══██╗██╔══╝  ██╔══██║   ██║   ██╔══██╗██║   ██║ ██╔██╗ 
██████╔╝███████╗██║  ██║   ██║   ██████╔╝╚██████╔╝██╔╝ ██╗
╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═════╝  ╚═════╝ ╚═╝  ╚═╝
                                                          


By Pavel Kondratyev, Rick Melucci, and Aden Lui

BeatBox is a program that generates a catchy formulaic song given a Root and Scale.
BeatBox is made possible using the JFugue API and various research papers on procedural generation.

How To Run it: 
    Windows:
        $ javac -cp .;jfugue.jar BeatBox.java
        $ java -cp .;jfugue.jar BeatBox
    Unix:
        $ javac -cp .:jfugue.jar BeatBox.java
        $ java -cp .:jfugue.jar BeatBox
        
        
JFugue Documentation : http://www.cs.ucsb.edu/~pconrad/cs56/examples/jfugue/doc/TheCompleteGuideToJFugue-v1.pdf


Done stuff: 
    Implemented Bjorklund algorithm (can be used for all sorts of grooves) 
    Drums are done
    
To Do: 

BeatBox.java
    - Gui
        - Takes parameters: Key, Scale, Tempo
    - Generates 4 things in a single Midi file.
        - Drums, Bass, Pad( Chords ), and melody
    - Needs to generate 
        - Intro, Verse, Prechorus(buildup), Chorus(Drop) , Bridge(Breakdown)
        
ProgressionFrog.java
    - Generates a chord progression using the number 
    - Returns an array where the 0 index is an array of the notes of the key, and the second index is an Array of the chords
    
GrooveAgent.java
    - Abstract( so that it has genre specifics )
    - This takes care of the drums
    - It uses JFugue to create several layers
        - Bass Drum, Snare, Hi Hats (open/closed) ride, crash, rack and floor tom
    - Uses several algorithms to generate the grooves for each drum piece
    - Page 81 on Documentation will help
    
PadMaster.java
    - Makes a layer of the song a pad playing the chord progression
BassMachine.java
    - 
    
    
References:
    Bjorklund algorithm was implemented using https://github.com/brianhouse/bjorklund 's javascript implementation.