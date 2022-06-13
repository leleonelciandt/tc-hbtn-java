import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try (ObjectOutputStream objectOuput = new ObjectOutputStream(new FileOutputStream(this.nomeArquivo))){
            objectOuput.writeObject(estudantes);
        } catch(Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(this.nomeArquivo))){
            @SuppressWarnings("unchecked")
            List<Estudante> listaEstudantes = (List<Estudante>) objectInput.readObject();
            return listaEstudantes;
        } catch(Exception e) {
            System.out.println("Nao foi possivel desserializar");
            return null;
        }
    }

}
