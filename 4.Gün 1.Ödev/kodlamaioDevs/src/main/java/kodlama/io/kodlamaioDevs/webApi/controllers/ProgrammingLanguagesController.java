package kodlama.io.kodlamaioDevs.webApi.controllers;

import kodlama.io.kodlamaioDevs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
            return this.programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getById(@PathVariable(name = "id") int id) throws Exception {
        return this.programmingLanguageService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        this.programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(name = "id") int id) throws Exception {
        programmingLanguageService.delete(id);
        return "Programlama Dili Başarıyla Silindi";
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable int id, @RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.update(programmingLanguage,id);
    }
}
