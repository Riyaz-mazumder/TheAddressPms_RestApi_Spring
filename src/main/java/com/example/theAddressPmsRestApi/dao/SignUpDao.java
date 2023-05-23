package com.example.theAddressPmsRestApi.dao;

import com.example.theAddressPmsRestApi.entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpDao extends JpaRepository<SignUp,Long> {
}
