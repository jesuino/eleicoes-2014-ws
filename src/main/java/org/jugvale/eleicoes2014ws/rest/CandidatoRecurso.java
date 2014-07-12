package org.jugvale.eleicoes2014ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jugvale.eleicoes2014ws.model.Candidato;
import org.jugvale.eleicoes2014ws.model.Resultados;
import static org.jugvale.eleicoes2014ws.util.DefinicoesServicos.*;

@Path("/{anoEleicao}/candidatos")
public interface CandidatoRecurso {

	@Path("/{id: [0-9]+}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Candidato obterCandidatoPorId(@PathParam("id") int id);

	@Path("/{estado: [A-Z]+}/")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados obterCandidatoPorEstado(@PathParam(ESTADO) String uf);

	@Path("/{estado: [A-Z]+}/eleitos")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados obterCandidatosEleitosPorEstado(
			@PathParam(ESTADO) String uf);

	@Path("/")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados obterTodosCandidato();

	@Path("/eleitos")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados obterTodosCandidatosEleitos();

	@Path("/{estado}/{cargo}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Resultados candidatosRegiaoCargo(@PathParam(ESTADO) String strUf,
			@PathParam(CARGO) String strCargo);

	@Path("/{estado}/{cargo}/{partido}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados candidatosRegiaoCargoPartido(
			@PathParam(ESTADO) String strUf,
			@PathParam(CARGO) String strCargo,
			@PathParam(PARTIDO) String strPartido);

	@Path("/{estado}/{cargo}/{partido}/eleitos")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados candidatosEleitosRegiaoCargoPartido(
			@PathParam(ESTADO) String strUf,
			@PathParam(CARGO) String strCargo,
			@PathParam(PARTIDO) String strPartido);

	@Path("{estado}/{cargo}/eleitos")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados candidatosEleitosRegiaoCargo(
			@PathParam(ESTADO) String strUf, @PathParam(CARGO) String strCargo);

	@Path("/busca")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@GET
	public Resultados busca(@QueryParam("nome") String nome,
			@QueryParam(PARTIDO) String strPartido,
			@QueryParam(CARGO) String strCargo,
			@QueryParam("uf") String strUf,
			@QueryParam("resultadoEleicao") String strResultado);
}
