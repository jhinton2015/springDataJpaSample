package com.lessons.jpa.springData.Courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    //the CRUD repository contains all the CRUD operations right of the box
    //make sure to include the type of the entity and the type of the id(primary key)

    public List<Course> findByTopicId(String topicId);
}
