import java.io.*;
import java.util.*;

public class ObjectPlus implements Serializable {
    //Better way of saving objects
    private static Map<Class, List> extents = new HashMap<>();

    public ObjectPlus() {
        List ex = extents.get(this.getClass());
        if(ex == null){
            ex = new ArrayList();
            extents.put(this.getClass(),ex);
        }

    }
    protected void removeThisFromClassExtent(){
        extents.remove(this.getClass());
    }

    public static <E> List<E> getExtent(Class<E> clazz) {
        List list = extents.get(clazz);
        if(list == null) {
            return new ArrayList<>();
        }
        return Collections.unmodifiableList(list);
    }

    public static void saveExtent(ObjectOutputStream oos) throws IOException {
        oos.writeObject(extents);
    }

    public static void loadExtent(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        extents = (Map<Class, List>) ois.readObject(); //:)
    }
}
