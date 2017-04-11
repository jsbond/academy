package theory.lecture_13.serialization;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * for third ex_2_annotations
 */
public class Square implements Serializable {
    private Date createdBy;
    private int radius = 5;


//    private void writeObject(ObjectOutputStream out) throws IOException {
//        System.out.println("111");
//    }
//    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//        System.out.println("222");
//    }

    public Square() {
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
