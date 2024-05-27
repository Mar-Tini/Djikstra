package algo; 
import java.util.*; 

public class Association extends Tableau{

    private static  Noeud noeud ;
    private Noeud deleteListNoeud = new Noeud() ;
    private HashMap<Noeud, ArrayList<Integer>> noeuds = new HashMap<>() ; 

    private static List<Noeud> listnoeudsuprimer = new ArrayList<>(); 
    private static List<Noeud> listnoeudsuprimer_1 = new ArrayList<>(); 
    private static HashMap<Noeud , ArrayList<Integer>> oldnoeud = new HashMap<>();
    private static HashMap<Noeud, ArrayList<Integer>> newNoeud = new HashMap<>();

    public Association(){
        super(); 
    }

    public Association(Noeud noeud , HashMap<Noeud, ArrayList<Integer>> noeuds){
        this.noeud = noeud; 
        this.noeuds = noeuds; 
    }     

    public static void trouve_chemin_noeud(Noeud noeudslist, HashMap<Noeud, ArrayList<Integer>> datas, Integer attribut) {
                
                Noeud noeudMin = null;
                int minValue = Integer.MAX_VALUE; 

                for (Map.Entry<Noeud, ArrayList<Integer>> entry : datas.entrySet()) {
                    Noeud key = entry.getKey();
                    ArrayList<Integer> values = entry.getValue();
                    for (Integer value : values) {
                        if (value < minValue) {
                            minValue = value;
                            noeudMin = key; 
                        }
                    }
                }

                listnoeudsuprimer.add(noeudMin); 


                System.out.println("# Noeud : " + noeudMin + "\n> Valeur minimale: " + minValue);
                System.out.println(""); 


                for (Map.Entry<Noeud, ArrayList<Integer>> entry : datas.entrySet()) {
                    Noeud nextNoeud1 = entry.getKey();
                    ArrayList<Integer> newAttributeValues1 = entry.getValue(); 
                        if (oldnoeud.containsKey(nextNoeud1)) { 
                            oldnoeud.get(nextNoeud1).addAll(newAttributeValues1);
                        } else {
                            oldnoeud.put(nextNoeud1, new ArrayList<>(newAttributeValues1));
                        }
                }    
             
                oldnoeud.entrySet().removeIf(entry -> listnoeudsuprimer.contains(entry.getKey()));


                HashMap<Noeud, ArrayList<Integer>> nextNoeudList = getNoeudList(noeudMin.getName());
              
                for (Map.Entry<Noeud, ArrayList<Integer>> entry : nextNoeudList.entrySet()) {
                    Noeud nextNoeud = entry.getKey();
                    ArrayList<Integer> values = entry.getValue();
                    ArrayList<Integer> updatedValues = new ArrayList<>();
                        for (Integer value : values) {
                            updatedValues.add(value + minValue); 
                       }
                    newNoeud.put(nextNoeud, updatedValues);  
                }
                    

                   
                for (Map.Entry<Noeud, ArrayList<Integer>> entry : oldnoeud.entrySet()) {
                            Noeud nextNoeud = entry.getKey();
                            ArrayList<Integer> newAttributeValues = entry.getValue(); 
                            if (newNoeud.containsKey(nextNoeud)) { 
                                newNoeud.get(nextNoeud).addAll(newAttributeValues);
                            } else {
                                newNoeud.put(nextNoeud, new ArrayList<>(newAttributeValues));
                            }
                }    

       
                newNoeud.entrySet().removeIf(entry -> listnoeudsuprimer.contains(entry.getKey()));
             
    
                if (!"G".equals(noeudMin.getName())) {
                    trouve_chemin_noeud(noeudMin, newNoeud , minValue);
                }else{
                    System.out.println("Finiched programme ! "); 
                    System.out.println(""); 

                    newNoeud.clear(); 
                    oldnoeud.clear(); 
                    nextNoeudList.clear(); 
                } 
           
        }
        
    

        public static void showListNoeud(HashMap<Noeud, ArrayList<Integer>> datas){
            for (Map.Entry<Noeud, ArrayList<Integer>> entry : datas.entrySet()) {
                    Noeud key = entry.getKey();
                    ArrayList<Integer> values = entry.getValue();
                    System.out.print(">>> " + key  + "--> "  );
                    for (Integer value : values) {
                        System.out.println(value);
                    }
                    System.out.println();
            }

        }

}