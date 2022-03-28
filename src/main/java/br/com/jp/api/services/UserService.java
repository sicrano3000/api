package br.com.jp.api.services;

import br.com.jp.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
