package dp.observer.pizzeria;

import dp.observer.interfaces.Hauptgericht;

public class Pizza implements Hauptgericht {
    // ein konkretes Hauptgericht
    private Integer id;

    public Pizza(Integer id){
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
