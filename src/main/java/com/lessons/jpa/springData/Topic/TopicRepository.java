package com.lessons.jpa.springData.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

    //the CRUD repository contains all the CRUD operations right of the box
    //make sure to include the type of the entity and the type of the id(primary key)
}
