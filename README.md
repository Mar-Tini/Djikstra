# Algorithme de Dijkstra en Java

Ce projet implémente l’algorithme de Dijkstra en Java pour trouver le plus court chemin dans un graphe pondéré.

L’objectif est de calculer et afficher le chemin minimal entre un nœud de départ  et le nœud d’arrivée , tout en affichant les valeurs intermédiaires des distances parcourues.

Le projet a été conçu à des fins pédagogiques pour illustrer :

- La structure d’un graphe en Java

- L’utilisation de HashMap et ArrayList pour stocker les arêtes et poids

- Le fonctionnement de l’algorithme de Dijkstra étape par étape


# Structure du projet

Le projet est composé des classes suivantes :

Noeud : représente un sommet du graphe (nommé par une lettre comme A, B, … G)

Tableau : initialise le graphe en définissant les nœuds et leurs connexions avec des poids

Association : implémente la logique de Dijkstra (sélection du nœud avec la distance minimale, mise à jour des distances, suppression des nœuds visités)

App : classe principale qui lance le programme et exécute l’algorithme



# Compilation
javac algo/*.java App.java -d bin

# Exécution
java -cp bin App
