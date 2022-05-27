# TP4_LE_PROBL-ME_D-ARBITRAGE

-------------------------
# Trinome:

- Herrouel Nour El Yacine
- Madani Mohamed El-Habib
- Benkahla Mohamed

# définition du probléme:

le probléme est représenter sous format d'un graph orionté pondéré qui signifer un graph avec des arces et des sommets
avec un poid associer a chaque arc. on a choisir donc l'algorithme bellmanFord  l'algorithme de Bellman-Ford autorise
la présence de certains arcs de poids négatif et permet de détecter l'existence d'un circuit absorbant, c'est-à-dire
de poids total strictement négatif, accessible depuis le sommet source.

# les étapes suivie l'ors du cération de programme Arbitrage_problem sont :

1- lecture de graph.
2- calcul de pois sous formule -log(poid).
3- construction de la matrice d'adjacence avec la diagpnale 1 .
4- application du bellmanford est calcul de cycle négative avec prise de désicion des sommets opportunités.

# Qeustion: 
# Pourquoi notre programme crée un fichier (Matrixe.txt) aprés éxecution meme si n'est demandé ?

# Réponse:
 généralement dans le domaine du data Science les informations collectés ou bien fournis sont trés couteuse, d'ou
l'importance de ce dernier qui veut dire que ca perte est vraiment couteuse.On a décider alors de crée un simple fichier
qui joue un role d'interpot ( DATA WIREHOUSE) afin d'aider l'itulisateur de bien comprendre et interprété le programme
nommé Arbitrage_problem.


# pour plus de compréhensivité RDV au commentaire du programme.
