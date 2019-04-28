package com.bits.bitsDemo.controller;

import com.bits.bitsDemo.common.BaseController;
import com.bits.bitsDemo.services.action.studentinfo.CreateStudentInfoActionService;
import com.bits.bitsDemo.services.action.studentinfo.ListStudentInfoActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by aman.ullah on 3/12/2019.
 */
@RestController
public class StudentRestController extends BaseController {

    private ListStudentInfoActionService listStudentInfoActionService;

    @Autowired
    public StudentRestController( ListStudentInfoActionService listStudentInfoActionService) {
        this.listStudentInfoActionService = listStudentInfoActionService;
    }

//    @GetMapping(value ="/api/listStudentRest",produces = "application/json")
    @ResponseBody
    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(value = "/api/listStudentRest", method = RequestMethod.GET, produces={"application/json"})

    public String restStudentList(@RequestParam Map<String, Object> parameters)throws Exception {

        return renderOutput(listStudentInfoActionService, parameters);
    }

}
