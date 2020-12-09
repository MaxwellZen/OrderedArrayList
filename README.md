# OrderedArrayList
We discussed:
- how we had to import java.util.ArrayList (or java.util.* in my case) in order to access the ArrayList methods in the NoNullArrayList class.
- how to implement the instance variables and constructor: there shouldn't be an instance variable since any important instance variables are part of the ArrayList class being extended, and the constructor should just call super() or super(size) and the ArrayList methods will do the rest of the work.
- how to structure the altered methods: it would test if the element parameter is null, throw an exception if so, and if not then just return super.add or super.set.
