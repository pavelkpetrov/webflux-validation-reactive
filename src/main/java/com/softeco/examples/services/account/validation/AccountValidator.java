package com.softeco.examples.services.account.validation;

import com.softeco.examples.services.account.model.AccountCreateCommand;
import com.softeco.examples.services.common.utils.ValidUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class AccountValidator implements ConstraintValidator<ValidAccountRq, AccountCreateCommand> {

    @Override
    public boolean isValid(AccountCreateCommand accountC, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(accountC.getPayload().getPassword())) {
            ValidUtils.addConstraintViolation(context, "must not be blank", "payload.password", String.class);
            return false;
        }
        return true;
    }

}

