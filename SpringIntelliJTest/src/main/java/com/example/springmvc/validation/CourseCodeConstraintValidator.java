package com.example.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {


    private String coursePrefix;
    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if(s != null)
            result = s.startsWith(coursePrefix);
        else
            return true;

        return result;
    }
}
