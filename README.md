# TP4_LE_PROBL-ME_D-ARBITRAGE


-Herrouel Nour El Yacine
-Madani Mohamed El Habib
-Benkahla Mohamed




le probléme est représenter sous format d'un graph orionté pondéré qui signifer un graph avec des arces et des sommets
avec un poid associer a chaque arc. on a choisir donc l'algorithme bellmanFord  l'algorithme de Bellman-Ford autorise
la présence de certains arcs de poids négatif et permet de détecter l'existence d'un circuit absorbant, c'est-à-dire
de poids total strictement négatif, accessible depuis le sommet source.

les étapes sont :
1- lecture de graph
2- calcul de pois sous formule -log(poid)
3- construction de la matrice d'adjacence avec la diagpnale 1 
4- application du bellmanford est calcul de cycle négative avec prise de désicion des sommets opportunités
