package np.com.pradeeppant.pradeepbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository obj;

    @GetMapping
    public List<Student> getData(){
       return obj.findAll();
    }
    @PostMapping
    public Student setData(@RequestBody Student obj1){
        return obj.save(obj1);
    }

}
