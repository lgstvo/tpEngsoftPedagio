package com.ufmg.pedagio.utils;

import org.springframework.stereotype.Service;

import com.ufmg.pedagio.model.entity.PedagioEntity;

@Service
public class PedagioUtils {

	public PedagioEntity recuperatePedagioInfo() {
		PedagioEntity pedagioEntity = new PedagioEntity();
		
		pedagioEntity.setNumeroPedagio(10);
		pedagioEntity.setRodovia("BR-040");
		
		return pedagioEntity;
	}
}
