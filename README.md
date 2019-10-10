# food-delivery - Documentation
##1. Ranks
1. Admin - The owner of the platform
2. Shop manager
3. Shop moderator
4. Client
#
1.1.
-
- Administratorul poate adauga/sterge/edita un magazin.
- Daca un magazin este sters, comenzile raman pana sunt procesate si livrate.

1.2.
-
- Managerul poate adauga/edita/sterge produsele unui magazin.
- Un produs nu se poate sterge cat timp magazinul este deschis.
- Managerul poate procesa comenzi.

1.3.
- 
- Poate procesa comenzi. Un produs initial se afla in starea de WAIT_FOR_PROCESING. Cand acesta este acceptat de catre moderator,
el trece in starea de APPROVED -> { in curs de livrare } -> DELIVERED

1.4
-
- Clientul poate sa plaseze o comanda
- Poate sa urmareasca starea comenzii
#
