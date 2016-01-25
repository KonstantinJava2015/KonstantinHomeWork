package files;

/**
 * Created by User on 21.12.2015.
 */
public abstract class MyFile {
    String name;
    int byteSize;

    public MyFile(){
      name = "New MyFile";
    }

    public MyFile(String type) {
        name = "New" + type + "MyFile";
    }

    public MyFile(String name, int byteSize) {
        this.name = name;
        this.byteSize = byteSize;
    }

    @Override
    public String toString() {
        return ", it's name is " + name + "; " +
                " and it's byteSize equals to " + byteSize;
    }
}
