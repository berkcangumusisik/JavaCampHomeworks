package kodlama.io.kodlamaioDevs.dataAccess.concretes;

import kodlama.io.kodlamaioDevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();
    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(4, "C++"));
        programmingLanguages.add(new ProgrammingLanguage(5, "JavaScript"));
        programmingLanguages.add(new ProgrammingLanguage(6, "PHP"));
        programmingLanguages.add(new ProgrammingLanguage(7, "Flutter"));
    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
        return getById(programmingLanguage.getId());
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) {
        ProgrammingLanguage programmingLanguageToUpdate = getById(id);
        programmingLanguageToUpdate.setName(programmingLanguage.getName());

    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguages.stream().filter(p -> p.getId() == id).findFirst().get();
    }
}
