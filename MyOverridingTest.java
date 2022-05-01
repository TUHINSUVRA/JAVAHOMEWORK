
public class MyOverridingTest  {
	    public static void main(String args[])
	    {
	        GrandParent grandParentObject = new GrandParent(); 
	        grandParentObject.rest(); 
	  
	        GrandParent parentObject = new Parent(); 
	        parentObject.rest();
	        
	        GrandParent childObject= new Child();
	        childObject.rest();
	        
	        Parent parentObject1=new Parent();
	         parentObject1.rest();
	         
	         
	         
	    }
	}
class GrandParent {
    //Access modifier of parent's display() method is protected
    protected void rest() {
        System.out.println("Grandpatentparent rest()method is executed");
    }
}

class Parent extends GrandParent {
    
    //Below method overrides the Parent display() method 
    //Access modifier public is less restrictive than protected 
    @Override
    public void rest() {
        System.out.println("Parent rest() method is executed");
    }
    public void work() {
    	System.out.println("Parent work() method is executed");
    }
    
}

class Child extends Parent{

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		
		System.out.println("child rest() method is executed");
	}
	
	public void play() {
		System.out.println("child play() method is executed");
	}
	
		
}

