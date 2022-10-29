package kodlama.io.kodlamaioDevs.dataAccess.abstracts;

import kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage);
    public void update(ProgrammingLanguage programmingLanguage, int id);
    public void delete(int id);
    public ProgrammingLanguage getById(int id);


}
