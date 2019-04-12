package netflix.feign.models;

import java.util.ArrayList;

public class Paging<entity extends Entity> {

    private ArrayList<entity> entities;

    private page page;

    public Paging(ArrayList<entity> entities, page page) {
        this.entities = entities;
        this.page = page;
    }

    public ArrayList<entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<entity> entities) {
        this.entities = entities;
    }

    public page getPage() {
        return page;
    }

    public void setPage(page page) {
        this.page = page;
    }
}
