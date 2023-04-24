import java.io.*;

public class Main {
    static final String path = "";

    public static void main(String[] args) throws FileNotFoundException {


        try(FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            ObjectPlus.saveExtent(oos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis)) {
            ObjectPlus.loadExtent(ois);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
