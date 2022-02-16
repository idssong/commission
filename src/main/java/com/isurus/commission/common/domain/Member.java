package com.isurus.commission.common.domain;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Member {
    @NonNull
    private String userId;
    @NonNull
    private String userName;
    @NonNull
    private String userNickname;
    @NonNull
    private String userPassword;

    private Date userRegDt;
    private Date userUpdDt;

}
