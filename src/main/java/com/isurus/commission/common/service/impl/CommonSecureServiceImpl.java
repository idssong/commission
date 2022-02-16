package com.isurus.commission.common.service.impl;

import com.isurus.commission.common.domain.Member;
import com.isurus.commission.common.repository.CommonSecureMapper;
import com.isurus.commission.common.service.CommonSecureService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommonSecureServiceImpl implements CommonSecureService {
    private final CommonSecureMapper secureMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

}
