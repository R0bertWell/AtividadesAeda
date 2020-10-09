package emitirnotafiscal;

import java.util.Scanner;

public class EmitirNotaFiscal {
    public static void main(String[] args) {
        int decisao=1;
        Scanner scan = new Scanner(System.in);
        NotaFiscal nF = new NotaFiscal();
        
        while(decisao!=0){
               int cadastroDecision;
                System.out.println(" ");
                System.out.println("########################################################");
                System.out.println("Olá, seja bem-vindo(a) a área de cadastro da Nota Fiscal!");
                System.out.println("###########MENU############");
                System.out.println("1-Para cadastrar a Nota Fiscal");
                System.out.println("2-Para ver os dados da Nota Fiscal");
                System.out.println("0-Sair");
                int cont=0;
                Scanner newScan = new Scanner(System.in);
                int escolha=scan.nextInt();
                switch(escolha){
                    case 0:
                        decisao=0;
                        break;
                    case 1:
                        
                        System.out.println("Preencha os seguintes campos : ");
                        System.out.println(" ");
                            System.out.print("Número da peça : ");
                            nF.setNumPeca(scan.next()); scan.nextLine();
                            System.out.print("Quantidade comprada : ");
                             nF.setQtdComprada(scan.nextInt());
                            System.out.print("Preço da peça : ");
                             nF.setPreco(scan.nextDouble()); scan.nextLine();
                             System.out.print("Descrição da peça : ");
                            nF.setDescPeca(scan.nextLine());
                        System.out.println("CADASTRO FINALIZADO!");
                        break;
                    case 2:
                        System.out.println("#########################");
                        nF.mostrarDados();
                        System.out.println("#########################");
                    default:
                        break;
                }
               
        }
    }
}
