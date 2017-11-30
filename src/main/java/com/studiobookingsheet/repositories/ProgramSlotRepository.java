package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.ProgramSlot;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thabomoopa on 2017/11/19.
 */
public interface ProgramSlotRepository extends CrudRepository<ProgramSlot, Long>{
    Iterable<ProgramSlot> findByNameContainingIgnoreCase(String search);
    ProgramSlot findByName(String name);
   // Iterable<ProgramSlot> findByNameContainingIgnoreCase(String name);


}
