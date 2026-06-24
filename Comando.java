/**
 * Interface funcional que representa um comando a ser executado no banco de pessoas.
 * Permite a utilizacao de expressoes lambda no mapeamento dos comandos.
 */
@FunctionalInterface
public interface Comando {
    // todo comando vai receber os argumentos digitados no terminal
    void executar(String[] args);
}