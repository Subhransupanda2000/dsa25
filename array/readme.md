# Array questions and solution:
# How to copy an array?
* System.arraycopy(sourceArray, sourcePos, destinationArray, destPos, length);
* int[] destination = source.clone();
* int[] copy = Arrays.copyOf(originalArray, newLength);
* int[] copy = Arrays.copyOfRange(originalArray, from, to);
* List<String> destinationList = Arrays.asList(source);
* int[] destination = Arrays.stream(source).toArray();
* String[] destination = source.clone();


