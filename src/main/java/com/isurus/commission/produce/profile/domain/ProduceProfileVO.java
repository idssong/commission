package com.isurus.commission.produce.profile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ProduceProfileVO {
    @NonNull
    private String userId;
    @NonNull
    private Integer pdId;
    @NonNull
    private String pdName;


}
