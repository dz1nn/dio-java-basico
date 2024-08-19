import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica","Lucas", "Tadeu", "Jennifer","Rayanne"};
        
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    
    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", " Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos infromando o indice do elemento");

        for ( int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + indice + " é o " + candidatos[indice]);
        }
    }
    
static void entrandoEmContato  ( String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
        atendeu = atender();
        continuarTentando = !atendeu;

        if(continuarTentando){
            tentativasRealizadas++;
        }else{
            System.out.println("Contato realizado com Sucesso");
        }

    }while(continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
        System.out.println("Conseguimos contato com  " + candidato + " Na " + tentativasRealizadas +"tentativa.");
    }else {
        System.out.println("Nao conseguimos contato com " + candidato + ", número maximo de ligações realizadas");
    }
}

    //método auxiliar

    static boolean atender() {
        return  new Random().nextInt(3)==1;
    }
    
    
    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica","Lucas", "Tadeu", "Jennifer","Rayanne"};
        
        int candidatosSelecionados =  0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
        
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligara para o Candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }

}
