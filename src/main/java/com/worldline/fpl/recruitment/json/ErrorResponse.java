package com.worldline.fpl.recruitment.json;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Error response
 *
 * @author A525125
 */
@Data
@AllArgsConstructor
public class ErrorResponse implements Serializable {

    private static final long serialVersionUID = 4372672070020226566L;

    @NotNull
    private ErrorCode errorCode;

    private String errorMessage;
}
