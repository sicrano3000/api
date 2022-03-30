package br.com.jp.api.services;

import br.com.jp.api.domain.User;
import br.com.jp.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO userDTO);

    User update(UserDTO userDTO);
}
