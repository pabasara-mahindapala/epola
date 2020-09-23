package org.fyp.marketplace.service;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Account;
import org.fyp.marketplace.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public List<Account> getAllAccount() {
		return this.accountRepository.findAll();
	}

	public Account getAccountById(ObjectId _id) {
		return this.accountRepository.findBy_id(_id);
	}

	public Account createAccount(Account account) throws Exception {
		account.set_id(new ObjectId());
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		account.setIsActive(true);
		account.setInsertDate(new Date());
		account.setLastUpdateDate(null);
		Account newAccount = this.accountRepository.save(account);
		return newAccount;
	}

	public void deleteAccount(Account account) {
		this.accountRepository.delete(account);
	}

	public Account updateAccount(Account account) {
		account.setLastUpdateDate(new Date());
		return this.accountRepository.save(account);
	}
}
