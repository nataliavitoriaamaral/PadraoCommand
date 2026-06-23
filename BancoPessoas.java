import java.util.HashMap;

public class BancoPessoas {
    // banco em memoria
    private static HashMap<Integer, Pessoa> banco = new HashMap<>();
    
    // mapa que vai associar a string do comando com a ação dele
    private static HashMap<String, Comando> comandos = new HashMap<>();

    // preenchendo as acoes
    static {
        comandos.put("new", args -> {
            if (args.length < 3) {
                System.out.println("Faltou parametro. Tente: new <id> <nome>");
                return;
            }
            int id = Integer.parseInt(args[1]);
            String nome = args[2];
            
            // se o nome tiver espacos (sobrenome), junta o resto
            for (int i = 3; i < args.length; i++) {
                nome += " " + args[i];
            }
            
            banco.put(id, new Pessoa(id, nome));
            System.out.println("Pessoa adicionada");
        });
        
        comandos.put("get", args -> {
            if (args.length < 2) {
                System.out.println("Faltou o ID. Tente: get <id>");
                return;
            }
            int id = Integer.parseInt(args[1]);
            Pessoa p = banco.get(id);
            
            if (p != null) {
                System.out.println(p.getNome());
            } else {
                System.out.println("Ninguem com esse ID no banco.");
            }
        });
    }
    public static void main(String[] args) {
    
    }
}