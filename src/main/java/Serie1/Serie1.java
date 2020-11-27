package Serie1;

public class Serie1 {
    /**
     * exercices 1 calcule de la sommes des carrés de cs entiers
     *
     */
    /**
     * je veux un tableau d'entier int[]
     * <p>
     * je déclare le depart de la boucle int sommeBoucle
     * <p>
     * pour chaque itération de la valeurBoucle qui est initiée à 0
     * tant que valeurBoucle est plus petit ou égal que la longeur de tableauEntier.length
     * augmente valeurBoucle de +1 (valeurBoucle++)
     */
    public static int somme_carres(int[] tableauEntier) {

        if (tableauEntier.length == 0) {
            return -1;
        }
        int sommeBoucle = 0;
        for (int valeurBoucle = 0; valeurBoucle < tableauEntier.length; valeurBoucle++) {
            sommeBoucle = sommeBoucle + tableauEntier[valeurBoucle] * tableauEntier[valeurBoucle];
        }

        return sommeBoucle;

    }

    // excercice 2 calculer la moyenne d'un tableau de décimaux
    public static int exercice2(int[] tableauDecimaux) throws IllegalArgumentException {
        if (tableauDecimaux.length == 0) {
            throw new IllegalArgumentException(" pas de tableau vide");
        }
        float sommeBoucle = 0;
        for (int valeurBoucle = 0; valeurBoucle < tableauDecimaux.length; valeurBoucle++) {
            sommeBoucle = sommeBoucle + tableauDecimaux[valeurBoucle];
        }
//calculer la moyenne
        float moyenne = sommeBoucle / tableauDecimaux.length;
        return (int) moyenne;
    }

    //exercice 3 trouver l'index le plus eloigné de zéro+ si égalit entre 1 positif et 1 negatif prendre le positif
    // + si 2 nombres positif prendre le 1er index
    public static int exercice3(long[] tableauEntier) {
        long valeurMax = 0;
        boolean valeurMaxEstPossitive = true;
        //int valeurCouranteAbsolue;
        int indexMaxValeur = 0;
        for (int valeurBoucle = 0; valeurBoucle < tableauEntier.length; valeurBoucle++) {
            long valeurCouranteAbsolue = Math.abs(tableauEntier[valeurBoucle]);

            if (valeurCouranteAbsolue > valeurMax || (valeurCouranteAbsolue == valeurMax && !valeurMaxEstPossitive) ){
                valeurMax = valeurCouranteAbsolue;
                valeurMaxEstPossitive =(tableauEntier[valeurBoucle] >=0);
                indexMaxValeur = valeurBoucle;
            }
        }
        return indexMaxValeur;
    }

    //exercice 4 calculer le n-ième élément de la suite de Fibonacci
    public static int exercice4(int nombre)
    {
        int f0 = 0;
        int f1 = 1;
        int fn = f0+f1;
        for (int i = 2; i <= nombre; i++)
        {
            f1 = f0;
            f0 = fn;
            fn = f1+f0;
        }
        return fn;

    }
    //exercice 5 Jessica-Marie-Sue-Hellen est une femme...difficile. Elle n'accepte de sortir qu'avec des
    // hommes selon les critères suivants :
    //•	Âge : Il doit avoir entre 18 et 35 ans
    //•	Physique : Au minimum 8/10
    //•	Revenus annuels : Au minimum 50 000€/an, mais si c'est au delà de 1 000 000€/an, on oublie le reste des critères ! Ecrire une méthode permettant de modéliser la chance d'un homme à sortir avec Jessica-Marie-Sue-Helen
    public static boolean exercice5(int age, int physique, int revenus){
//        int age = age >= 18 && age <= 35;
//        int physique = physique >= 8 && physique <= 10;
//        int revenus = revenus >= 50000 && revenus <=1000000;

        return (revenus >=1000000) || (age >= 18 && age <= 35 && physique >= 8 && revenus >= 50000);

    }

    // exercice 6 masquer les caractères et remplacer par ### les caractères d'un String sauf les 4 derniers
    public static String exercice6(String nombreAffiche) {
        int nombreDeCaractereClaire = 4;

        if (nombreAffiche.length() == nombreDeCaractereClaire){
            return nombreAffiche;
        }


    }










}

