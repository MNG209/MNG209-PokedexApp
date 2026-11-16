Section 10: Code Explanations

1. What are the key and value types? Why is the name useful as a key?

The key type is a String, which stores the Pokemon's name, and the value type is a Pokemon object. Using the name as the key is useful because it allows users to search for a specific Pokemon without having to go through every Pokemon in the table. The names are also converted to lowercase to make searching easier.

2. Using the provided hash() method and % 11, show the bucket calculation for two names that collided. Must their full hash codes match?

Two Pokemon that collided in my program were Meowth and Lucario. Both ended up in bucket 6.

Meowth:
- Original hash code: -1077689356
- Adjusted hash: 1069794292
- 1069794292 % 11 = 6

Lucario:
- Original hash code: 510191633
- Adjusted hash: 510191633
- 510191633 % 11 = 6

Their full hash codes do not have to match because different hash codes can produce the same bucket index after using % 11.

3. Trace how get() finds the second name in that chain. What causes it to stop?

When searching for Lucario, the get() method calculates its bucket index, which is 6. It starts at Meowth, which is the first Pokemon in that bucket. Since Meowth does not match Lucario, it moves to the next node in the linked list. It then finds Lucario and returns its value. The search stops when it finds the matching key or reaches null if the Pokemon is not there.

4. Why does insert() update an existing key instead of adding a duplicate? What changes when remove() deletes the first node?

The insert() method checks whether the key already exists before adding a new Pokemon. If it finds the same key, it updates the value instead of creating a duplicate. This keeps the hash table from storing multiple entries with the same name. When remove() deletes the first node, the bucket is updated to point to the next node in the linked list.

5. What happens to lookup work when many names land in one bucket?

When multiple Pokemon end up in the same bucket, the linked list becomes longer. This means the get() method might have to check more nodes before finding the Pokemon. As more Pokemon are added to the same bucket, searching can become slower because it has to go through more entries.

6. How does Pokemon.equals() differ from ==? Why does Pokemon need a matching hashCode(), and which class's hashCode() does this table use for its keys?

The == operator checks whether two object references point to the same object, while equals() compares the actual information stored in the Pokemon objects. My equals() method compares all five fields to determine whether two Pokemon are equal. The hashCode() method needs to use the same fields so that equal Pokemon objects have matching hash codes. Since my hash table uses Pokemon names as String keys, it uses the String class's hashCode() method to determine which bucket each Pokemon belongs in.