import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{

public static void main(String[] args) {
    System.out.println("Processo Seletivo");
    String [] candidatos = {"Miguel","Sophia","Davi","Alice","Arthur"};
    for(String candidato : candidatos){
        entrandoEmContato(candidato);
    }
}

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true ;
        boolean atendeu = false ;

        do{
            atendeu = atender();
            continuarTentando =! atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO! ");
            }
            

        }while (continuarTentando && tentativasRealizadas <3);

        if (atendeu) {
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+" tentativa");
        }else {
            System.out.println("Não conseguimos contato com "+candidato+" número máximo de tentativas  "+tentativasRealizadas+ "");
        }
    }
    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3) ==1;

    }
    static void imprimirSelecionados(){
       
        String [] candidatos = {"Miguel","Sophia","Davi","Alice","Arthur"};
        System.out.println("Imprimindo a lista de candidatos informanco o indice do elemento ");
        for(int indice = 0 ;indice < candidatos.length;indice++){
            System.out.println("O candidato de indice "+(indice +1)+" foi "+candidatos[indice]);

        }
    }
    static void selecaoCandidatos(){

        String [] candidatos = {"Miguel","Sophia","Davi","Alice","Arthur","Julia","Pedro","Isabella","Gabriel","Manuela","Bernardo"};
        int candidatosSelecionados = 0 ;
        int candidatoAtual = 0 ;
        double salarioBase = 2000.0;

        while(candidatosSelecionados<5 && candidatoAtual <candidatos.length){

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidato+" solicitou este valor de salário "+salarioPretendido);

            if(salarioBase >= salarioPretendido){ 
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga ");
                candidatosSelecionados++;
            }else {
                System.out.println("O candidato "+candidato+"não foi selecionado para a vaga ");
            }candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato ");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("ligar para o candidato com contra proprosta ");
        }else {
            System.out.println("Aguardando demais candidatos ");
        }
    }


}