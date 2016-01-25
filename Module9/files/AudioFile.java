package files;

/**
 * Created by User on 21.12.2015.
 */
public class AudioFile extends MyFile {
    public AudioFile(String name, int byteSize) {
        super(name, byteSize);
    }

    public AudioFile() {
        super("Audio");
    }

    @Override
    public String toString() {
        return "This is AudioFile " + super.toString();
    }
}
