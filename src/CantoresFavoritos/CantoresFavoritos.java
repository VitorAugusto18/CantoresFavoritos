package CantoresFavoritos;

import java.util.ArrayList;
import java.util.Scanner;

public class CantoresFavoritos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nomeCantor;
        //String nomeRemovido;
        int i;
        
        ArrayList<String> listCantores = new ArrayList();
        boolean teste = true;
        do{
            
            System.out.println("1 - Adicionar cantor");
            System.out.println("2 - Remover cantor da lista");
            System.out.println("3 - Mostrar lista");
            System.out.println("Pressione qualquer outra tecla para sair");
            int resposta = sc.nextInt();
        switch(resposta){
            case 1:
                System.out.println("digite o nome do cantor(a)");
                nomeCantor = sc.next();
                String nomeF = nomeCantor.toUpperCase();
                listCantores.add(nomeF);
                break;
            case 2:
                System.out.println("Digite o código do cantor(a) a ser removido");
                //receber o código a ser removido que nada mais é que a posição em que se encontra o nome na lista
                i = sc.nextInt();
                try{
                    //remover opção atráves da posição
                    listCantores.remove(i);
                }catch (IndexOutOfBoundsException e){
                            // exceção lançada para indicar que um índice (i)
                            // está fora do intervalo válido (de 0 até agenda.size()-1)
                        System.out.printf("\n Erro: nome digitado não existente (%s).",
                        e.getMessage());
                }
            case 3:
                System.out.println("Lista");
                int n = listCantores.size();
                for (i=0;i<n;i++){
                System.out.printf("código %d- %s\n", i, listCantores.get(i));
                }

                break;
            default: 
                System.out.println("Deseja finalizar a aplicação?");
                String finaliza = sc.next();
                if("s".equals(finaliza)){
                    System.exit(0);
                }else if("n".equals(finaliza)){
                    
                }
        }
        }while(teste);


    }
    
}
