package com.softeco.examples.services.common.components;

import com.softeco.examples.services.common.cqrs.model.CommandRes;
import com.softeco.examples.services.common.cqrs.model.PayloadError;
import com.softeco.examples.services.common.utils.ValidationResponseEntityUtils;
import com.softeco.examples.services.common.validator.ReactiveBindException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;

@ControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class ControllerExceptionAdvice  {

    @ExceptionHandler(WebExchangeBindException.class)
    public ResponseEntity<CommandRes<PayloadError>> validationError(WebExchangeBindException ex) {
        return ValidationResponseEntityUtils.validationError(ex);
    }

    @ExceptionHandler(ReactiveBindException.class)
    public ResponseEntity<CommandRes<PayloadError>> validationError(ReactiveBindException ex) {
        return ValidationResponseEntityUtils.validationError(ex);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<CommandRes<PayloadError>> serverError(Throwable exm) {
        return ValidationResponseEntityUtils.serverError(exm);
    }

}
