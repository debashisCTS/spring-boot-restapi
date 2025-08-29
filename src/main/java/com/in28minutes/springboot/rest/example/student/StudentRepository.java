package com.in28minutes.springboot.rest.example.student;

import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<@NonNull Student, @NonNull Long> {
//first commit from feature branch
//second commit from feature branch - after hotfix commit
}
