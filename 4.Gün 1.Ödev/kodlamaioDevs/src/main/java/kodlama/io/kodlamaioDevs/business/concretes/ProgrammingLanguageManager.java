package kodlama.io.kodlamaioDevs.business.concretes;

import kodlama.io.kodlamaioDevs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaioDevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;
    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (isIdExist(programmingLanguage.getId())) throw new Exception("Programlama dilinin ID'si tekrar edemez.");
        if (isNameExist(programmingLanguage)) throw new Exception("Aynı programlama dili tekrar edemez.");
        return programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception{
        if (!isIdExist(programmingLanguage.getId())) throw new Exception("Böyle bir ID Bulunmamaktadır.");
        if(isNameExist(programmingLanguage)) throw new Exception("Aynı programlama dili tekrar edemez.");
        programmingLanguageRepository.update(programmingLanguage, id);
    }

    @Override
    public void delete(int id) throws Exception{
        if (!isIdExist(id)) throw new Exception("Böyle bir ID Bulunmamaktadır.");
        programmingLanguageRepository.delete(id);
    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {
        if (!isIdExist(id)) throw new Exception("Böyle bir ID Bulunmamaktadır.");
        return programmingLanguageRepository.getById(id);
    }

    private boolean isNameExist(ProgrammingLanguage programmingLanguage) {

        for(ProgrammingLanguage programmingLanguage2: getAll()) {
            if(programmingLanguage.getName().equals(programmingLanguage2.getName())) {
                return true;
            }
        }
        return false;
    }


    private boolean isIdExist(int id) {

        for (ProgrammingLanguage language2 : getAll()) {
            if (language2.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
