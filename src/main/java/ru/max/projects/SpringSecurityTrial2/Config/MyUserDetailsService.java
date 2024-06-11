package ru.max.projects.SpringSecurityTrial2.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.max.projects.SpringSecurityTrial2.dao.managers.UserManager;
import ru.max.projects.SpringSecurityTrial2.dao.models.User;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserManager userManager;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(userManager.getUser(login));
        return user.map(MyUserDetails::new).orElseThrow(() -> new UsernameNotFoundException(login + "There is not such user in REPO"));
    }
}
