public interface ConectorMidiaSocial {
    /**
     * Define o contrato unificado para publicar em qualquer plataforma.
     * @param postagem O objeto de dados contendo o texto e a mídia.
     */
    void publicar(Postagem postagem);
}