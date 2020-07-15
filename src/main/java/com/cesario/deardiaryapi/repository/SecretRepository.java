package com.cesario.deardiaryapi.repository;

import com.cesario.deardiaryapi.models.Secret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretRepository extends JpaRepository<Secret, Long> {
    Secret findById(long id);
}
