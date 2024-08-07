package br.com.gsc.banco_api.service;

import br.com.gsc.banco_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
