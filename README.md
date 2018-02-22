# Genetic-Algorithm-Robocode
# Genetic neural network algorithm - Robocode
Using the Robocode API/Game I want to create a system by which my robots can "learn" to play better.
###### I want to create the best killers, campers or evasion specialists possible.
Who knows what is truly the best tactic for playing this game. I hope to find out. Or have fun trying.

## Step 1: Learn about genetic algorithms.
Following the tutorials from this slightly mental youtuber, (meant in jest, I thank hm for the vids)
https://www.youtube.com/watch?v=RxTfc4JLYKs, I had began learning.
The first three points he posed that I had to think about with regards to this project were three principles
of natural selection.

### Hereditary - A way to inherit properties from parents.
In Robocode I thought this was nice. I could think of my robots as living things slowly evolving into this
God of war's play things. I had no idea how this would work at this point I was still learning a lot.

### Variation - There needs to be a way to introduce variation to each generation.
#### Or already be a lot of variation.
Again, not many thought on this. Except maybe play styles being a type of
variation that may be introduced naturally or in code.

### Selection - Some parents need to be chosen to pass on their "genetics" and some disallowed.
This one seemes easy. My first thoughts are that there is already competition in the game, much like the worlds
natural selection. Based on the rules of the game, Robots that live aren't always the best robots. So living and
high scoring robots should have the oportunity to live on.
The best robots would be:
Pole position finishers, overall best finishers and those that actually live.
The worst robots would be:
Non pole finishers, low scorers and dead robots. Dead robots however can score high so I need to be careful here.

### Genetic algorithm
#### Setup
Create an initial population with random "DNA"
#### Draw
##### Evaluate
Somehow evaluate the fitness of each robot. I have a feeling it will just be the highscores.
##### Reproduce
Choose which robots reproduce and how. How meaning what data/DNA is passed on. Also add mutations to each generation.
##### Repopulate
Take the new population and start the process again.

### Some more thoughts
Based on the video found here: https://www.youtube.com/watch?v=nrKjSeoc7fc
I now think that my initial worries I had about having a small population or a large one I have to split up and cross compete are somewhat saved by the fact that a well tuned mutation rate could be enough to offset having a low population if I choose to just evolve based on a 12 robot battle where the population is 12.
To be honest though i'm sure I will need more robos than that. Maybe generate a population and randomly distribute them into matchups. I'm thinking about having leagues and some evoltionary benefits for coming top of the table. Or having regions like in the real world where occasionally robos may find their way into other regions and could either disastrously fail and die out or repopulate the region. I realy want to call the regions METAs just so I can say one species invaded and changed the meta during this generation.

## Step 2:
I set up an eclipse project that could handle the Robocode engine in order to facilitate the projects goals.
All I had to do was add the jars in the libs folder of the default installation to my project and then run the code from this link:
http://robocode.sourceforge.net/docs/robocode/robocode/control/package-summary.html

Steps 3 and 4 will be to learn about neural networks and to create the base robot class. Maybe add name, species or some other cool features to make it fun.

