package org.jugvale.eleicoes2014ws.service.impl;

import javax.ejb.Stateless;
import org.jugvale.eleicoes2014ws.service.ServiceAbstrato;
import org.jugvale.eleicoes2014ws.model.Candidato;

@Stateless
public class CandidatoService extends ServiceAbstrato{ 
	
	@Override
	protected Class<Candidato> retornaTipo() {
		return Candidato.class;
	}
}
