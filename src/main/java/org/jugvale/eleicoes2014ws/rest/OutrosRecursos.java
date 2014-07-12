package org.jugvale.eleicoes2014ws.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jugvale.eleicoes2014ws.model.Cargo;
import org.jugvale.eleicoes2014ws.model.Coligacao;
import org.jugvale.eleicoes2014ws.model.Ocupacao;
import org.jugvale.eleicoes2014ws.model.Partido;
import org.jugvale.eleicoes2014ws.model.ResultadoEleicao;
import org.jugvale.eleicoes2014ws.model.Situacao;

@Path("{anoEleicao}")
public interface OutrosRecursos {

	@Path("/cargo")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public List<Cargo> cargos();

	@Path("/partido")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public List<Partido> partidos();

	@Path("/coligacao")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public List<Coligacao> coligacoes();

	@Path("/situacao")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public List<Situacao> situacoes();

	@Path("/resultadoEleicao")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public List<ResultadoEleicao> resultadosEleicao();

	@Path("/ocupacao")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public List<Ocupacao> ocupacoes();
}
