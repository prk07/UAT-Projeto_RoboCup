package spacecup.Model;

import java.util.Date;

public class Lancamento {

    private int id;
    private float distanciaDoAlvo;
    private float anguloLancamento;
    private float velocidadeVento;
    private float altitudeMaxima;
    private float altitudeEjecao;
    private float picoAceleracao;
    private float aceleracaoMedia;
    private float taxaDescida;
    private float distanciaEntreQuedaAlvo;
    private float tempoApogeuDescida;
    private float duracaoVoo;
    private float tempoPropulsao;
    private Equipe equipe;
    private Foguete foguete;

    public Lancamento() {

    }

    public Lancamento(int id, float distanciaDoAlvo, float anguloLancamento, float velocidadeVento, float altitudeMaxima, float altitudeEjecao, float picoAceleracao, float aceleracaoMedia, float taxaDescida, float distanciaEntreQuedaAlvo, float tempoApogeuDescida, float duracaoVoo, float tempoPropulsao, Equipe equipe, Foguete foguete) {
        this.id = id;
        this.distanciaDoAlvo = distanciaDoAlvo;
        this.anguloLancamento = anguloLancamento;
        this.velocidadeVento = velocidadeVento;
        this.altitudeMaxima = altitudeMaxima;
        this.altitudeEjecao = altitudeEjecao;
        this.picoAceleracao = picoAceleracao;
        this.aceleracaoMedia = aceleracaoMedia;
        this.taxaDescida = taxaDescida;
        this.distanciaEntreQuedaAlvo = distanciaEntreQuedaAlvo;
        this.tempoApogeuDescida = tempoApogeuDescida;
        this.duracaoVoo = duracaoVoo;
        this.tempoPropulsao = tempoPropulsao;
        this.equipe = equipe;
        this.foguete = foguete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDistanciaDoAlvo() {
        return distanciaDoAlvo;
    }

    public void setDistanciaDoAlvo(float distanciaDoAlvo) {
        this.distanciaDoAlvo = distanciaDoAlvo;
    }

    public float getAnguloLancamento() {
        return anguloLancamento;
    }

    public void setAnguloLancamento(float anguloLancamento) {
        this.anguloLancamento = anguloLancamento;
    }

    public float getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setVelocidadeVento(float velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    public float getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(float altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public float getAltitudeEjecao() {
        return altitudeEjecao;
    }

    public void setAltitudeEjecao(float altitudeEjecao) {
        this.altitudeEjecao = altitudeEjecao;
    }

    public float getPicoAceleracao() {
        return picoAceleracao;
    }

    public void setPicoAceleracao(float picoAceleracao) {
        this.picoAceleracao = picoAceleracao;
    }

    public float getAceleracaoMedia() {
        return aceleracaoMedia;
    }

    public void setAceleracaoMedia(float aceleracaoMedia) {
        this.aceleracaoMedia = aceleracaoMedia;
    }

    public float getTaxaDescida() {
        return taxaDescida;
    }

    public void setTaxaDescida(float taxaDescida) {
        this.taxaDescida = taxaDescida;
    }

    public float getDistanciaEntreQuedaAlvo() {
        return distanciaEntreQuedaAlvo;
    }

    public void setDistanciaEntreQuedaAlvo(float distanciaEntreQuedaAlvo) {
        this.distanciaEntreQuedaAlvo = distanciaEntreQuedaAlvo;
    }

    public float getTempoApogeuDescida() {
        return tempoApogeuDescida;
    }

    public void setTempoApogeuDescida(float tempoApogeuDescida) {
        this.tempoApogeuDescida = tempoApogeuDescida;
    }

    public float getDuracaoVoo() {
        return duracaoVoo;
    }

    public void setDuracaoVoo(float duracaoVoo) {
        this.duracaoVoo = duracaoVoo;
    }

    public float getTempoPropulsao() {
        return tempoPropulsao;
    }

    public void setTempoPropulsao(float tempoPropulsao) {
        this.tempoPropulsao = tempoPropulsao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Foguete getFoguete() {
        return foguete;
    }

    public void setFoguete(Foguete foguete) {
        this.foguete = foguete;
    }

   

}
