package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.repository.TaskFinancialDetailsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsRepositoryTestSuite {

    @Autowired
    TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    @Test
    public void testFindByPaid() {
        //given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsRepository.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //when
        List<TaskFinancialDetails> resultList = taskFinancialDetailsRepository.findByPaid(false);

        //then
        Assert.assertEquals(1, resultList.size());

        //cleanUp
        taskFinancialDetailsRepository.deleteById(id);
    }
}
