package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyRepositoryTestSuite {

    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void testSaveManyToMany() {
        //given
        // tworzymy 3 pracownikó i 3 firmy
        // każdej firmie przyporządkowujemy pracowników
        // każdemu pracownikowi przyporządkowujemy firmy
        Employee ulmKowalsky = new Employee("Ulm", "Kovalsky");
        Employee peterSmith = new Employee("Peter", "Smith");
        Employee elizaNowak = new Employee("Eliza", "Nowak");

        Company obc = new Company("OBC");
        Company joll = new Company("Joll");
        Company enterYou = new Company("EnterYou");

        obc.getEmployees().add(ulmKowalsky);
        joll.getEmployees().add(peterSmith);
        joll.getEmployees().add(elizaNowak);
        enterYou.getEmployees().add(ulmKowalsky);
        enterYou.getEmployees().add(elizaNowak);

        ulmKowalsky.getCompanies().add(obc);
        ulmKowalsky.getCompanies().add(enterYou);
        peterSmith.getCompanies().add(joll);
        elizaNowak.getCompanies().add(joll);
        elizaNowak.getCompanies().add(enterYou);

        //when
        // zapisujemy trzy obiekty firm przy pomocy kontrolera repo
        // po zapisaniu każddego obiektu klasy Company zapamiętujemy w zmiennej wartośc id, ktra mu została nadna przez Hibernata
        companyRepository.save(obc);
        int softwareMachineId = obc.getId();
        companyRepository.save(joll);
        int dataMaesterId = joll.getId();
        companyRepository.save(enterYou);
        int greyMatterId = enterYou.getId();

        //then
        // zestaw asercji sprawdzających czy dane zostaly zapisane w bazie danych
        // weryfikacja czy danemu obiektowi nadano wartość id
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaesterId);
        Assert.assertNotEquals(0, greyMatterId);

        //cleanUp
        // instrukcje do posprzątania po danych testowych
        // usuwanie w bloku try catch na wypadek gdyby test nie wykonał się poprawnie i bazie danych zostsalyby fragmentaryczne dane
        try {
            companyRepository.deleteById(softwareMachineId);
            companyRepository.deleteById(dataMaesterId);
            companyRepository.deleteById(greyMatterId);
        } catch (Exception e) {
            // do nothing
        }
    }
}
