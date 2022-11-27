package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	
	public InMemoryLanguageRepository(){
		languages = new ArrayList<Language>();
        languages.add(new Language(1,"JAVA"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Python"));
        languages.add(new Language(4,"Go"));
    }
	
	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
            if (language.getId() == id) {
                return language;
            }
        }
		return null;
	}

	@Override
	public void delete(Language language) {
		 languages.remove(getById(language.getId()));
		
	}

	@Override
	public void update(Language language) {
		for(Language programmingLanguage : languages) {
			if(programmingLanguage.getId()==language.getId()) {
				programmingLanguage.setName(language.getName());
			}
		}
	}

}
