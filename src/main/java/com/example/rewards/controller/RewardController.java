// ================================
// RewardController.java
// ================================
package com.example.rewards.controller;

import com.example.rewards.dto.RewardResponse;
import com.example.rewards.model.Transaction;
import com.example.rewards.repository.TransactionRepository;
import com.example.rewards.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling reward-related endpoints.
 */
@RestController
@RequestMapping("/api")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/transactions")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @GetMapping("/rewards/{customerId}")
    public RewardResponse getRewards(@PathVariable Long customerId) {
        return rewardService.calculateRewards(customerId);
    }

    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}

