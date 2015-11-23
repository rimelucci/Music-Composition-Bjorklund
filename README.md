#BeatBox: A Video Game Music Composer!

###By Pavel Kondratyev, Rick Melucci, and Aden Lui

BeatBox is a program that generates formulaic vintage video-game type songs given a Root and Scale.
- BeatBox is made possible using the JFugue API and various research papers on procedural generation.

###How to use it:

    - Windows:
        $ javac -cp .;jfugue.jar Driver.java
        $ java -cp .;jfugue.jar Driver
    - Unix:
        $ javac -cp .:jfugue.jar Driver.java
        $ java -cp .:jfugue.jar Driver
        
Once it is run, a GUI will pop up prompting users to select a scale and a tempo.
- Once a scale and tempo is selected, press play and hear your unique song being played through your headphones or speakers!
  - To save a special song that you relly liked, just press save after hearing it play and you'll be able to use it for whatever purposes you'd like!

__JFugue Documentation__ : http://www.cs.ucsb.edu/~pconrad/cs56/examples/jfugue/doc/TheCompleteGuideToJFugue-v1.pdf
    
    
__References__:
    - Bjorklund algorithm was implemented using https://github.com/brianhouse/bjorklund 's javascript implementation.