package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskFinancialDetailsRepository extends CrudRepository<TaskFinancialDetails, Integer> {

    // dodajemy metodę która zwróci liste obiektów TaskFinancialDetails dla których pole paid jest takie samo jak argumrnt przekazany w metodzie

    List<TaskFinancialDetails> findByPaid(boolean paid);
}
