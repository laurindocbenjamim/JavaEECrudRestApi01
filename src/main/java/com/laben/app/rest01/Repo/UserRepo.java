package com.laben.app.rest01.Repo;

import com.laben.app.rest01.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepo extends JpaRepository<User, Long> {


}
