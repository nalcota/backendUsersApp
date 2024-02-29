package com.alcota.backend.usersapp.backendusersapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alcota.backend.usersapp.backendusersapp.models.entities.User;
import com.alcota.backend.usersapp.backendusersapp.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService{

    private UserRepository repository;
    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        repository.deleteById(id);;
    }



}
