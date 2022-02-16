package com.isurus.commission.produce.archive.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
/**
 * @apiNote
 */
public class ProducerArchiveTO {
    @NonNull
    private Integer pdId;
    /**
     * @apiNote 구매한 Consumer Id. consume.profile.domain.ConsumerProfileTO 참조 중.
     * @사족. 구매상태가 되기 전에는 null 상태로 대기. 따라서 Nullable 한 개체임.
     */
    private String csId;

    private String paTitle;
    private String paText;
    private String paDate;
    //책정된 가격을 의미함.
    private Integer paValue;
    //계약 여부.
    private Boolean paContracted;


}
