package spacecup.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import spacecup.Conexao.Conexao;
import spacecup.Model.Lancamento;

public class LancamentoDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public Lancamento getLancamento(int id) {
        Lancamento l = null;

        con = new Conexao().getConnection();
        sql = "select * from lancamento where lancamento_id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {

                l = new Lancamento();

                l.setId(rs.getInt("lancamento_id"));

                l.setAceleracaoMedia(rs.getFloat("aceleracaoMedia"));
                l.setAltitudeEjecao(rs.getFloat("altitudeEjecao"));
                l.setAltitudeMaxima(rs.getFloat("altitudeMaxima"));
                l.setAnguloLancamento(rs.getFloat("anguloLancamento"));
                l.setDistanciaDoAlvo(rs.getFloat("distanciaDoAlvo"));
                l.setDistanciaEntreQuedaAlvo(rs.getFloat("distanciaEntreQuedaAlvo"));
                l.setDuracaoVoo(rs.getFloat("duracaoVoo"));
                l.setPicoAceleracao(rs.getFloat("picoAceleracao"));
                l.setTaxaDescida(rs.getFloat("taxaDescida"));
                l.setTempoApogeuDescida(rs.getFloat("tempoApogeuDescida"));
                l.setTempoPropulsao(rs.getFloat("tempoPropulsao"));
                l.setVelocidadeVento(rs.getFloat("velocidadeVento"));
                l.setEquipe(new EquipeDAO().getById(rs.getInt("equipe_id")));
                l.setFoguete(new FogueteDAO().getById(rs.getInt("foguete_id")));

            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return l;
    }

    public List<Lancamento> getLancamentos() {
        List<Lancamento> lista = null;

        con = new Conexao().getConnection();
        sql = "select * from lancamento";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            lista = resposta(rs);

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public List<Lancamento> getLancamentosByYear(String nome, String ano) {
        List<Lancamento> lista = null;

        con = new Conexao().getConnection();
        sql = "select * from lancamento where equipe_id in (select equipe_id from equipe where turma_id in (select turma_id from turma where competicao_id in (SELECT competicao_id from competicao WHERE year(competicao.data) = ? and tipo_competicao_id in (SELECT tipo_competicao_id from tipo_competicao where nome = ?))))";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ano);
            ps.setString(2, nome);
            rs = ps.executeQuery();

            lista = resposta(rs);

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    private List<Lancamento> resposta(ResultSet rs) {
        List<Lancamento> lista = new ArrayList<>();
        Lancamento l = null;

        try {
            while (rs.next()) {
                l = new Lancamento();

                l.setId(rs.getInt("lancamento_id"));
                l.setAceleracaoMedia(rs.getFloat("aceleracaoMedia"));
                l.setAltitudeEjecao(rs.getFloat("altitudeEjecao"));
                l.setAltitudeMaxima(rs.getFloat("altitudeMaxima"));
                l.setAnguloLancamento(rs.getFloat("anguloLancamento"));
                l.setDistanciaDoAlvo(rs.getFloat("distanciaDoAlvo"));
                l.setDistanciaEntreQuedaAlvo(rs.getFloat("distanciaEntreQuedaAlvo"));
                l.setDuracaoVoo(rs.getFloat("duracaoVoo"));
                l.setPicoAceleracao(rs.getFloat("picoAceleracao"));
                l.setTaxaDescida(rs.getFloat("taxaDescida"));
                
                l.setTempoApogeuDescida(rs.getFloat("tempoApogeuDescida"));
                
                l.setTempoPropulsao(rs.getFloat("tempoPropulsao"));
                l.setVelocidadeVento(rs.getFloat("velocidadeVento"));
                l.setEquipe(new EquipeDAO().getById(rs.getInt("equipe_id")));
                l.setFoguete(new FogueteDAO().getById(rs.getInt("foguete_id")));
                lista.add(l);

            }
        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void insereLancamento(Lancamento lancamento) {

        con = new Conexao().getConnection();

        sql = "INSERT INTO lancamento VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setFloat(1, lancamento.getDistanciaDoAlvo());
            ps.setFloat(2, lancamento.getAnguloLancamento());
            ps.setFloat(3, lancamento.getVelocidadeVento());
            ps.setFloat(4, lancamento.getAltitudeMaxima());                        
            ps.setFloat(6, lancamento.getPicoAceleracao());
            ps.setFloat(7, lancamento.getAceleracaoMedia());
            
            ps.setFloat(5, lancamento.getTempoPropulsao());            
            ps.setFloat(8, lancamento.getTempoApogeuDescida());
            ps.setFloat(11, lancamento.getDuracaoVoo());

            
            ps.setFloat(9, lancamento.getAltitudeEjecao());
            ps.setFloat(10, lancamento.getTaxaDescida());
            ps.setFloat(12, lancamento.getDistanciaEntreQuedaAlvo());
            ps.setInt(13, lancamento.getEquipe().getId());
            ps.setInt(14, lancamento.getFoguete().getId());
            

            ps.execute();

            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alteraLancamento(Lancamento lancamento) {

        con = new Conexao().getConnection();

        sql = "UPDATE `lancamento` SET `distanciadoalvo`=?,`angulolancamento`=?,`velocidadevento`=?,`altitudemaxima`=?,`tempopropulsao`=?,`picoaceleracao`=?,`aceleracaomedia`=?,`tempoapogeudescida`=?,`altitudeejecao`=?,`taxadescida`=?,`duracaovoo`=?,`distanciaentrequedaalvo`=?,`equipe_id`=?,`foguete_id`=? WHERE `lancamento_id`=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setFloat(1, lancamento.getDistanciaDoAlvo());
            ps.setFloat(2, lancamento.getAnguloLancamento());
            ps.setFloat(3, lancamento.getVelocidadeVento());
            ps.setFloat(4, lancamento.getAltitudeMaxima());
            ps.setFloat(5, lancamento.getTempoPropulsao());
            ps.setFloat(6, lancamento.getPicoAceleracao());
            ps.setFloat(7, lancamento.getAceleracaoMedia());
            ps.setFloat(8, lancamento.getTempoApogeuDescida());
            ps.setFloat(9, lancamento.getAltitudeEjecao());
            ps.setFloat(10, lancamento.getTaxaDescida());
            ps.setFloat(11, lancamento.getDuracaoVoo());
            ps.setFloat(12, lancamento.getDistanciaEntreQuedaAlvo());
            ps.setInt(13, lancamento.getEquipe().getId());
            ps.setInt(14, lancamento.getFoguete().getId());
            ps.setInt(15, lancamento.getId());
            ps.execute();

            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
