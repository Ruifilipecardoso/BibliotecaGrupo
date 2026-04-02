public class SistemaLogin {

    public boolean autenticar(String utilizador, String senha) {
        if (utilizador == null || senha == null) {
            return false;
        }
        return utilizador.equals("Bibliotecario") && senha.equals("1234");
    }
}
