package com.topsem.mcc.service;

import com.topsem.common.service.BaseService;
import com.topsem.mcc.domain.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for managing orders.
 */
@Service
@Transactional
@Slf4j
public class AddressService extends BaseService<Address, Long> {

}
