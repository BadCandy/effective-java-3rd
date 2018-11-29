package chapter04.item19;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableImpl implements Serializable {

    public static void main(String[] args) throws IOException {

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(new SerializableImpl());
                byte[] serializeMember = baos.toByteArray();
            }
        }


    }
}
