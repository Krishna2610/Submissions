import java.util.*;


public class InfinityGauntlet{
    
    public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int m=0;
    
    if(n>0)
        scan.nextLine();
    HashMap<String,String> map= new HashMap<>();
	map.put("purple","Power");
	map.put("green","Time");
	map.put("blue","Space");
	map.put("orange","Soul");
	map.put("red","Reality");
	map.put("yellow","Mind");
	
	for(int i= 0;i<n;++i){
	    String color = scan.nextLine();
	    if(map.containsKey(color)){
	        map.remove(color);
	        m++;
	    }
	}
	System.out.println(6-m);
	for(String gem:map.values()){
	    System.out.println(gem);
	}
	scan.close();
    }
}

