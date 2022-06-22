package com.skillMatrix.skillMatrix.Controller;

import com.skillMatrix.skillMatrix.Model.SkillMatrixEntity;
import com.skillMatrix.skillMatrix.Repository.SkillMatrixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillMatrixController {

    @Autowired
    SkillMatrixRepo skillMatrixRepo;

    @PostMapping("skillMatrixSave")
    public SkillMatrixEntity skillMatrixSave(SkillMatrixEntity skillMatrix)
    {
       return skillMatrixRepo.save(skillMatrix);
    }
}
