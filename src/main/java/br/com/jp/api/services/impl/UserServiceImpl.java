package br.com.jp.api.services.impl;

import br.com.jp.api.domain.User;
import br.com.jp.api.domain.dto.UserDTO;
import br.com.jp.api.exceptions.ObjectNotFoundExcpetion;
import br.com.jp.api.repository.UserRepository;
import br.com.jp.api.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundExcpetion("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserDTO userDTO) {
        return userRepository.save(mapper.map(userDTO, User.class));
    }

}
