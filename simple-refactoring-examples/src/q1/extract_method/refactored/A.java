package src.q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
	  printer(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
	  printer(edgeList, p);
      return null;
   }

   // TODO: Your answer
   public  <T extends Leaf> void printer(List<T> t, String p) {
		for (Leaf obj : t) {
			if (obj.contains(p))
				System.out.println(obj);
		}
   }
}

class Node extends Leaf {

   @Override
   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Leaf{
	
   @Override
   public boolean contains(String p) {
       return name.contains(p);
   }
}

abstract class Leaf{
	String name;
	
	abstract boolean contains(String p);
}