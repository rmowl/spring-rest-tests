package com.worldline.fpl.recruitment.json;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Abstract transaction json representation
 *
 * @author A525125
 */
@Data
public abstract class AbstractTransaction implements Serializable {

    private static final long serialVersionUID = 7866293071140304316L;

    @NotNull
    private String number;

    @NotNull
    private BigDecimal balance;

}
