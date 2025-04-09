// ================================
// RewardService.java (Interface)
// ================================

package com.example.rewards.service;

import com.example.rewards.dto.RewardResponse;

/**
 * Interface for reward point calculation service.
 */
public interface RewardService {
	
	RewardResponse calculateRewards(Long customerId);
	RewardResponse fallbackReward(Long CustomerId, Throwable t);

}
