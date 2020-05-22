package com.softeco.examples.services.account.repository;

import com.softeco.examples.services.account.model.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveCrudRepository<Account, String> {

	Mono<Boolean> existsAccountByName(String name);

}
