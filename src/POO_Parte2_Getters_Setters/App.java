package POO_Parte2_Getters_Setters;

public class App {

    public static void main(String[] args) {

        // 'final' => é semelhante ao 'const' do JavaScript, torna a variável imutável

        final User usuario1 = new User();
        usuario1.setFullName("  Alfredo  ", " Neto  ");
        System.out.println(usuario1.getFullName());

        final User usuario2 = new User();
        usuario2.setFullName("   teste   ", " teste  ");
        System.out.println(usuario2.getFullName());

    }
}
