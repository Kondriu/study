package dima.book.clases.abstract1;

import javax.swing.text.View;

/**
 * Created by dmitriy on 6/11/16.
 */
public abstract class SphericalHorse {
    // абстрактный метод ржать()
    abstract void neigh();

    // абстрактный класс может содержать и обычный метод
    void gallop() {
        System.out.println("Куда прёшь?");
    }
}

class SphericalHorseInVacuum extends SphericalHorse {


    @Override
    void neigh() { //нефиг было имплементить абстрактные методы в абстрактном класее. тогда не будет мусора при наследовании
        System.out.println("Чего ржешь?");
    }

    public void onClick(View view){
        SphericalHorseInVacuum horseInVacuum = new SphericalHorseInVacuum();
        horseInVacuum.neigh(); //на основе абстрактного, кторый уже имплеменчен в этом классе
        horseInVacuum.gallop(); //обычный метод (обявлен и заимплеменчен в абстарктном)
    }
}
