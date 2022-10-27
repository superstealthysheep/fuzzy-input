# fuzzy-input
Simple project to fuzzily handle user text input. Like autocorrect but worse! Also it's in Java.

Ideas:
- Given list of options, match user input to closest option

Distance types to minimize
- Vanilla Hamming distance
- Consider keyboard distance of different characters (closer characters contribute less to distance) (tedious to set up unless I can think of something clever)
- You know how humans can generally figure out words if you scramble the letters as long as the first and last letters are unchanged? Maybe a distance that more highly weights the correctness of the first and last characters.
- Anagrams or smth, idk
