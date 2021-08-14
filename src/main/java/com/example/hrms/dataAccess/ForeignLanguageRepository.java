package com.example.hrms.dataAccess;

import com.example.hrms.entities.concretes.ForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignLanguageRepository extends JpaRepository<ForeignLanguage, Integer> {
}
