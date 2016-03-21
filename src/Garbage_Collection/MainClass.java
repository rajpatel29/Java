package Garbage_Collection;

//		The process of destroying unreferenced objects is called Garbage Collection.
//		Once object is unreferenced it is considered as unused object, hence JVM automatically destroys that object.
//		In java developers responsibility is only to creating objects and un referencing those objects after usage.

//		JVM internally uses a daemon thread called "garbage collector" to destroy all unreferenced objects.
//		This thread is low priority thread. Since it is a low priority thread we can not guarantee this execution.

//		we can not guarantee objects destruction even though it is unreferenced, 
//		because we can not guarantee garbage collector execution.
//		So, we can confirm whether object is eligible for garbage collection or not.

//		we can not force garbage collector to destroy objects , but we can request it.

//		We have a method called gc() in system class as static method and also in Runtime class as non static method 
//		to request JVM to start garbage collector execution.

//		What are the different ways to call garbage collector?
//		System.gc();
//		Runtime.getRuntime().gc();

//		Which part of the memory is involved in Garbage Collection?
//		Heap.

//		Garbage Collector frees the memory occupied by the unreachable objects during the java program 
//		by deleting these unreachable objects.

//		What are the different ways to make an object eligible for garbage collection when it is no longer needed?
//		Set all available object references to "null" once the purpose of creating object is served.

//		The finalize() method should be overridden for an object to include the clean up code or to dispose of the system 
//		resources that should to be done before the object is garbage collected.

//		What happens if an uncaught exception is thrown from during the execution of finalize() method of  an object?
//		The exception will be ignored and the garbage collection (finalization) of that object terminates

public class MainClass 
{
	public static void main(String args[])
	{
		Test test1 = new Test("Test1");
		Test test2 = new Test("Test2");
		
		test1 = null;
		test2 = null;
		
		System.gc();
		
		System.out.println("Hey there");
		
		for (int i = 0; i < 11; i++)
		{
			System.out.println("" + i);
		}
	}
}
