package theory.lecture_13.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * for second ex_2_annotations
 *
 */
public class Rectangle extends Shape implements Serializable {
    private Date createdBy;
    private int radius = 5;

    private String string = "myPassword";

    public Rectangle() {
        System.out.println("конструктор потомка");
        createdBy = new Date();
    }

    //------------------------

    public Date getCreatedBy() {
        return createdBy;
    }

    public int getRadius() {
        return radius;
    }

    public Thread getThread() {
        return thread;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
