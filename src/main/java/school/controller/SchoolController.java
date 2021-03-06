package school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.domain.School;
import school.service.SchoolService;
import school.service.Service;

@RestController
@RequestMapping(value = "/api/schools")
public class SchoolController extends Controller<School> {

    @Autowired
    private SchoolService schoolService;

    @Override
    public Service<School> getService() {
        return schoolService;
    }

}