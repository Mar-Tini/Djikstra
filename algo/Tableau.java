package algo; 
import java.util.*; 

public class Tableau {
    private static Noeud A0, A, B, C, D, E, F, G;
    private static HashMap<Noeud, ArrayList<Integer>> data_A0, data_A, data_B, data_C, data_D, data_E, data_F, data_G;  
    private static Association association; 

    public Tableau() {
        super(); 
    }

    static {

        A0 = new Noeud("A0");
        A = new Noeud("A");
        B = new Noeud("B");
        C = new Noeud("C");
        D = new Noeud("D");
        E = new Noeud("E");
        F = new Noeud("F");
        G = new Noeud("G");

        data_A0 = new HashMap<>();
        data_A0.put(A, new ArrayList<>(Arrays.asList(0)));

        data_A = new HashMap<>();
        data_A.put(D, new ArrayList<>(Arrays.asList(4)));
        data_A.put(C, new ArrayList<>(Arrays.asList(1)));
        data_A.put(B, new ArrayList<>(Arrays.asList(2)));
        
        data_B = new HashMap<>();
        data_B.put(E, new ArrayList<>(Arrays.asList(1)));
        data_B.put(D, new ArrayList<>(Arrays.asList(3)));
        data_B.put(C, new ArrayList<>(Arrays.asList(2)));
        data_B.put(A, new ArrayList<>(Arrays.asList(2)));
        
        data_C = new HashMap<>();
        data_C.put(F, new ArrayList<>(Arrays.asList(5)));
        data_C.put(E, new ArrayList<>(Arrays.asList(4)));
        data_C.put(D, new ArrayList<>(Arrays.asList(3)));
        data_C.put(B, new ArrayList<>(Arrays.asList(2)));
        data_C.put(A, new ArrayList<>(Arrays.asList(1)));
        
        data_D = new HashMap<>();
        data_D.put(F, new ArrayList<>(Arrays.asList(1)));
        data_D.put(E, new ArrayList<>(Arrays.asList(3)));
        data_D.put(C, new ArrayList<>(Arrays.asList(3)));
        data_D.put(B, new ArrayList<>(Arrays.asList(3)));
        data_D.put(A, new ArrayList<>(Arrays.asList(4)));
        
        data_E = new HashMap<>();
        data_E.put(G, new ArrayList<>(Arrays.asList(5)));
        data_E.put(F, new ArrayList<>(Arrays.asList(6)));
        data_E.put(D, new ArrayList<>(Arrays.asList(3)));
        data_E.put(C, new ArrayList<>(Arrays.asList(4)));
        data_E.put(B, new ArrayList<>(Arrays.asList(1)));
        
        data_F = new HashMap<>();
        data_F.put(G, new ArrayList<>(Arrays.asList(2)));
        data_F.put(E, new ArrayList<>(Arrays.asList(6)));
        data_F.put(D, new ArrayList<>(Arrays.asList(1)));
        data_F.put(C, new ArrayList<>(Arrays.asList(5)));
        
        data_G = new HashMap<>();
        data_G.put(F, new ArrayList<>(Arrays.asList(2)));
        data_G.put(E, new ArrayList<>(Arrays.asList(5)));
        

        System.out.println(""); 
        System.out.println("------ Algorithme de Djikstra ------");
        System.out.println(""); 
        
        association = new Association();
        association.trouve_chemin_noeud(A0, data_A0, 0);

    }

    public static Noeud getListNoeud(String name) {
        switch(name) {
            case "A0": return A0;
            case "A": return A;
            case "B": return B;
            case "C": return C;
            case "D": return D;
            case "E": return E;
            case "F": return F;
            case "G": return G;
            default: return null; 
        }
    }

    public static HashMap<Noeud, ArrayList<Integer>> getNoeudList(String name) {
        switch(name) {
            case "A0": return data_A0;
            case "A": return data_A;
            case "B": return data_B;
            case "C": return data_C;
            case "D": return data_D;
            case "E": return data_E;
            case "F": return data_F;
            case "G": return data_G;
            default: return null; 
        }
    }
}
