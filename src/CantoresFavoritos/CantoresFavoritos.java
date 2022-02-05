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
            int resposta = sc.nextInt();
        switch(resposta){
            case 1:
                System.out.println("digite o nome do cantor(a)");
                nomeCantor = sc.next();
                listCantores.add(nomeCantor);
                break;
            case 2:
                System.out.println("Digite o nome co cantor(a) a ser removido");
                nomeCantor = sc.next();
                //i = sc.nextInt();
                try{
                    //remover opção escolhida
                    listCantores.remove("nomeCantor");
                }catch (IndexOutOfBoundsException e){
                            // exceção lançada para indicar que um índice (i)
                            // está fora do intervalo válido (de 0 até agenda.size()-1)
                        System.out.printf("\n Erro: nome digitado não existente (%s).",
                        e.getMessage());
                }
            case 3:
                System.out.println("percorrendo Lista");
                int n = listCantores.size();
                for (i=0;i<n;i++){
                System.out.printf("código %d- %s\n", i, listCantores.get(i));
                }
                /*System.out.printf("Lista de contatos com for-each \n");
                i = 0;
                for (String contato: agContatos){
                    System.out.printf("Código %d- %s\n", i, contato);
                    i++;
                }*/
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
