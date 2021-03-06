package tn.esprit.spring.services;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;

import java.util.List;


@Service
public class ContratServiceImpl implements IContratService {
	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);

	@Autowired
	ContratRepository contratRepository;


	public List<Contrat> getAllContrats() {
		return (List<Contrat>) contratRepository.findAll();
	}

}
