package com.learnspringboot.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.learnspringboot.courses.beans.Course;

@RestController
public class CoursesController {

    @GetMapping("/courses")
    public List<Course> getListCourses() {
        return Arrays.asList(new Course(1, "learn springboot", "in28minutes"));
    }
}
