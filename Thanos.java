package list;

import java.util.ArrayList;
import java.util.Collections;


public class Thanos {

    public static void main(String[] args) {
    	
    	
    	Hero  hero1 = new Hero ("Black Widow ", 35);
    	Hero  hero2 = new Hero ("Captain America", 120);
    	Hero  hero3 = new Hero ("Vision", 100);
    	Hero  hero4 = new Hero ("Iron Man", 45);
    	Hero  hero5 = new Hero ("Scarlet Witch", 30);
    	Hero  hero6 = new Hero ("Thor", 100);
    	Hero  hero7 = new Hero ("Hulk", 56);
    	Hero  hero8 = new Hero ("Doctor Strange", 52);   	
    	
    	ArrayList<Hero> heroes = new ArrayList<Hero>();
    	
    	heroes.add(hero1);
    	heroes.add(hero2);
    	heroes.add(hero3);
    	heroes.add(hero4);
    	heroes.add(hero5);
    	heroes.add(hero6);
    	heroes.add(hero7);
    	heroes.add(hero8);
    	hero6.setAge(1501);
    	
    	Collections.shuffle(heroes);
        System.out.println("Thanos clack des doigs :");
        System.out.println("-----------------");
      
    	for (int i = 4; i < heroes.size(); i++) {
    	Hero survivant = heroes.get(i);
    		 
        System.out.println("le Hero : ");
        System.out.println(survivant.getName());
        System.out.println("agée de : ");
        System.out.println(survivant.getAge());
        System.out.println("ans");
        System.out.println("survie");
        System.out.println("-----------------");
    	}
    	
         
    	
    	}
        
        
  
    }

