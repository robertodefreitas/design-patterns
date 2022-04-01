package dp.observer.restaurant;

import dp.observer.interfaces.Hauptgericht;

public class Kartoffelgratin implements Hauptgericht {
    // ein konkretes Hauptgericht
    private Integer id;

    public Kartoffelgratin(Integer id){
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void warmLiefern(){
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName + " ID: " + id + " kann bald serviert werden!");
    };
}
