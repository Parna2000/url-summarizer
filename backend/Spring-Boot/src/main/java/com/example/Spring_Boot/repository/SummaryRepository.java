package com.example.Spring_Boot.repository;

import com.example.Spring_Boot.model.SummaryRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SummaryRepository extends JpaRepository<SummaryRequest, Long> {
}
