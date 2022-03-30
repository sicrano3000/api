package br.com.jp.api.services;

import br.com.jp.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
