package com.isurus.commission.produce.profile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
public class ProduceProfileVO {

    private String pdId;
    private String pdName;
    private String pdAbc;

}
