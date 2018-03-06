package programs.collections;

public class ArraySearching {

	public static void main(String[] args) {
    int a[]=new int[500000];
    for(int i=0;i<a.length;i++){
    	a[i]=i+1;
    }
    for(int i=0;i<a.length;i++){
     if(a[i]==499999){
    	System.out.println("Element is  found @ :"+i); 
    	break;
     }else{
    	System.out.println("Element is not found @:"+i); 
     }
    }
    
	}

}
