package org.fyp.marketplace.controller;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.fyp.marketplace.model.Account;
import org.fyp.marketplace.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/account")
public class AccountController {

	final AccountService accountService;

	/**
	 * 
	 * @param accountService
	 */
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("all")
	public List<Account> listAllAccounts() {
		try {
			return this.accountService.getAllAccount();
		} catch (Exception e) {
			// Log error
			return new ArrayList<Account>();
		}
	}

	@GetMapping("/{accountId}")
	public Account getAccount(@PathVariable ObjectId accountId) {

		Account account = accountService.getAccountById(accountId);

		// throw exception if null

		if (account == null) {
			throw new RuntimeException("Account not found");
		}

		return account;
	}

	@PostMapping("/add")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) throws Exception {
		ResponseEntity<Account> result;
		try {

			this.accountService.createAccount(account);
			result = new ResponseEntity<>(account, HttpStatus.OK);
		} catch (Exception e) {
			result = new ResponseEntity<>(account, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}

	@PutMapping("/update")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account) throws Exception {
		ResponseEntity<Account> result;
		try {
			this.accountService.updateAccount(account);
			result = new ResponseEntity<>(account, HttpStatus.OK);
		} catch (Exception e) {
			result = new ResponseEntity<>(account, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}

	@DeleteMapping("/delete/{accountId}")
	public String deleteAccount(@PathVariable ObjectId accountId) {

		Account account = accountService.getAccountById(accountId);

		// throw exception if null

		if (account == null) {
			throw new RuntimeException("Account not found");
		}

		accountService.deleteAccount(account);

		return "Deleted Account : " + account.getName();
	}

}
