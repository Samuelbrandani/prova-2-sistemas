package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.Student;
import br.edu.univas.vo.User;

public class UserRepository {

	private DatabaseConfiguration databaseConfiguration;

	public UserRepository() {
		databaseConfiguration = DatabaseConfiguration.getInstanceOfDatadase();
	}

	public void insert(User user) {
		//proceed with insert object in database
	}
}
