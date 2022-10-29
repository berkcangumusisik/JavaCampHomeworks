package kodlama.io.kodlamaioDevs.business.abstracts;

import kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception;
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception;
    public void delete(int id) throws Exception;
    public ProgrammingLanguage getById(int id) throws Exception;
}
