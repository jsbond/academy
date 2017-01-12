package practice.english.model;

import java.io.Serializable;

/**
 * Created by StudentTC on 12.01.2017.
 */
public abstract class Entity implements Serializable {
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
