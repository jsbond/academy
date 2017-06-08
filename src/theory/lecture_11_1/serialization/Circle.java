package theory.lecture_11_1.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * for first ex_2_annotations
 */
public class Circle implements Serializable {
    private Date createdBy;
    private int radius = 5;

    public Circle() {
        createdBy = new Date();
    }

    //------------------------

    public Date getCreatedBy() {
        return createdBy;
    }

    public int getRadius() {
        return radius;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
