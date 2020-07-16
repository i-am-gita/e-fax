# e-fax
<h3>Komunikacija između servisa "survey-service" i "fax-service" se ne uspostavlja zato što Spring ne prepoznaje kontrolere uopšte(error404). 
Glavni razlog ovoga je to što sam slučajno napravio ReviewMapper klasu u glavnom paketu pa sam morao da ga posebno skreniram @ComponentScan-om. Premeštanjem ReviewMapper klase dolazi do konflikta bean-ova zbog
ReviewMapperImp klase koja se ne briše brisanjem ReviewMapper-a. 

Ovo se prevazilazi ubacivanjem sledećeg koga u zaglavlje SurveyServiceApplication

@ComponentScan(basePackages = {"pmf.it.mis.project.survey.service"},excludeFilters={
		@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value= ReviewMapper.class)})
@EnableJpaRepositories("pmf.it.mis.project.survey.service.repository")
</h3>


