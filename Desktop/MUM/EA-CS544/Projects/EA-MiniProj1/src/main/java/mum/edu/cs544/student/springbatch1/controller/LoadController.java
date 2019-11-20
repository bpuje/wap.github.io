package mum.edu.cs544.student.springbatch1.controller;

import mum.edu.cs544.student.springbatch1.model.Student;
import mum.edu.cs544.student.springbatch1.service.StudentService;
import org.springframework.batch.core.*;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;



    @Autowired
    private StudentService studentService;

    @GetMapping
    public String load() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        JobParameters parameters = new JobParameters(maps);
        JobExecution jobExecution = jobLauncher.run(job, parameters);

        System.out.println("JobExecution: " + jobExecution.getStatus());

        System.out.println("Batch is Running...");
        while(jobExecution.isRunning()){
            System.out.println("...");
        }
        //return jobExecution.getStatus();
        System.out.println(jobExecution.getStatus());
        return jobExecution.getStatus().toString() + "<br>" + studentService.findAll();
    }


    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin</h2>");
    }

    @GetMapping("/error")
    public String forbidden(){
        return "<h1>This user permission does not enough to reach it.</h2>";
    }
}
