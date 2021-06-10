package com.devsuperior.hrworker.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;
import com.devsuperior.hrworker.services.exceptions.ResourceNotFoundException;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository workerRepository;

	public Collection<Worker> findAll() {
		return workerRepository.findAll();
	}

	public Worker findById(Long id) {
		Optional<Worker> worker = workerRepository.findById(id);
		if(worker.isEmpty()) {
			throw new ResourceNotFoundException();
		}
		return worker.get();
	}
}