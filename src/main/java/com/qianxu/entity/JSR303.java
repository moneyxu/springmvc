package com.qianxu.entity;

import lombok.Data;

import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class JSR303 {

    @Null
    private String mNull;

    private String mNotNull;

    private Boolean mAssertTrue;

    private Boolean mAssertFalse;

    private Number mMin;

    private BigDecimal mDecimalMin;

    private Integer mSize;

    private Date mPast;

    private String mEmail;

    private String mLength;

    private String mNotEmpty;

    private Long mRange;
}
