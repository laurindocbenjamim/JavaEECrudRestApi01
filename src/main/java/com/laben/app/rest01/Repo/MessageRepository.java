package com.laben.app.rest01.Repo;

import com.laben.app.rest01.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {

}
