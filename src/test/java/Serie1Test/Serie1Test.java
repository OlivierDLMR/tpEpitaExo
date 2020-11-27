package Serie1Test;

import Serie1.Serie1;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.Assertions.*;

public class Serie1Test {

// exercice 1
    @Test
    public void retour_sommes_des_carres_des_entiers(){

        int[] tableauEntier1 = {1,2,3};
        int[] tableauEntier2 = {14,9,-9,4,3,1};
        int resultatAttendu1 = 1*1+2*2+3*3;
        int resultatAttendu2 = 14*14+9*9+-9*-9+4*4+3*3+1*1;
        int[] tableauVide = {};
        int resultatAttendu = -1;

        int resultatReel1 = Serie1.somme_carres(tableauEntier1);
        int resultatReel2 = Serie1.somme_carres(tableauEntier2);
        int resultatReel = Serie1.somme_carres(tableauVide);

        Assertions.assertThat(resultatReel1).isEqualTo(resultatAttendu1);
        Assertions.assertThat(resultatReel2).isEqualTo(resultatAttendu2);
        Assertions.assertThat(resultatReel).isEqualTo(resultatAttendu);
    }

    //exercice 2
    @Test
    public void calculer_moyenne_tableau(){
        int[] tableauDecimaux1 = {10, 20};
        int[] tableauDecimaux2 = {11, 12, 13, 14, 15, 16};
        int[] tableauVide = {}; //execption

        int resultatReel1 = Serie1.exercice2(tableauDecimaux1);
        int resultatReel2 = Serie1.exercice2(tableauDecimaux2);
        //int resultatReel = Serie1.exercice2(tableauVide);

        Assertions.assertThat(resultatReel1).isEqualTo(15);
        Assertions.assertThat(resultatReel2).isEqualTo(13);

        Throwable throwable = catchThrowable(() -> Serie1.exercice2(tableauVide));
        assertThat(throwable)
                .isNotNull()
                .isExactlyInstanceOf(IllegalArgumentException.class);

    }

    private Assert assertThat(Throwable thrown) {
        return null;
    }

    // exercice 3
    @Test
    public void index_plus_loin_de_zero(){
        long[] tableau1 = {1,-2,10,-15,3};
        long[] tableau2 = {-10, 10,3,10};
        long[] tableau3 = {-10,10,3,10};

        long indexAttendu1 = Serie1.exercice3(tableau1);
        long indexAttendu2 = Serie1.exercice3(tableau2);
        long indexAttendu3 = Serie1.exercice3(tableau3);
        Assertions.assertThat(indexAttendu1).isEqualTo(3);
        Assertions.assertThat(indexAttendu2).isEqualTo(1);
        Assertions.assertThat(indexAttendu3).isEqualTo(1);
    }


    //exercice 4
    @Test
    public  void nieme_element_fibonacci(){
        int nombreFibo = 16;
        int nombre = Serie1.exercice4(nombreFibo);
        Assertions.assertThat(nombre).isEqualTo(Serie1.exercice4(nombreFibo));
        System.out.println("le nombre suivant est : " +nombre);

    }
    //exercice 5
    @Test
    public void homme_ideal(){
        boolean homme1 = Serie1.exercice5(21, 9, 60000);
        boolean homme2 = Serie1.exercice5(21, 7, 90000);
        boolean homme3 =  Serie1.exercice5(90, 2, 2000000);

        Assertions.assertThat(homme1).isTrue();
        Assertions.assertThat(homme2).isFalse();
        Assertions.assertThat(homme3).isTrue();
    }
    //exercice 6



}
