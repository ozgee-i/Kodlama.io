package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    
	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	
	@Override
	public void add(Language language) throws Exception {
		if(isIdExist(language.getId())){
			   throw new Exception("Bu kurs kayıtlı");
		   }
		   if(isNameExist(language)) {
			   throw new Exception("Geçersiz değer");
		   } 
		   languageRepository.add(language);
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public void delete(Language language) throws Exception {
		if (!isIdExist(language.getId())) {
			throw new Exception("Geçersiz id");
		}
		languageRepository.delete(language);
		
	}

	@Override
	public void update(Language language) throws Exception {
		if(isIdExist(language.getId())){
			   throw new Exception("Girilen id kayıtlı");
		   }
		   if(isNameExist(language)) {
			   throw new Exception("Geçersiz değer girildi.");
		   }
		   languageRepository.update(language);
		
      
	}
	private boolean isNameExist(Language language) {
		for(Language programmingLanguage2:getAll()) {
			if(programmingLanguage2.getName().equalsIgnoreCase(language.getName()) || language.getName().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	private boolean isIdExist(int id) {
		for(Language programmingLanguage2: getAll()) {
			if(programmingLanguage2.getId()==id)
			{
				return true;
			}
		}
		return false;
	}

}
