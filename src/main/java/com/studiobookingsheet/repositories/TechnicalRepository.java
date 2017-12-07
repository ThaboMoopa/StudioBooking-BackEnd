package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.Technical;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

/**
 * Created by thabomoopa on 2017/11/20.
 */
public interface TechnicalRepository extends CrudRepository<Technical, Long> {
}
