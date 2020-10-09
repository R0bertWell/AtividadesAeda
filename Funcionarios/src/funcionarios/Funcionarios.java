package funcionarios;
//Wellington Roberto Almeida da Silva Júnior
//RA : 20109111998

import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x=1;
        int indexes=0;
        int cont=0;
        Funcionario[] func = new Funcionario[100];
        while(x!=0){
            System.out.println("#################MENU##################\n"
                             + "1- Cadastrar Funcionário\n"
                             + "2- Mostrar os dados sobre o(s) Funcionário(s)\n"
                             + "3- Sair\n"
                             + "#######################################\n");
            int escolha=scan.nextInt();
            func[indexes]= new Funcionario();
            switch(escolha){
                case 1:
                    func[indexes]= new Funcionario();
                    System.out.println("CADASTRO DE FUNCIONÁRIO, POR FAVOR INFORME : \n");
                    System.out.print("Nome : ");
                    func[indexes].setNome(scan.next());
                    System.out.print("Sobrenome : ");
                    func[indexes].setSobrenome(scan.next());
                    System.out.print("Salário Mensal em R$ ");
                    func[indexes].setSalMensal(scan.nextDouble());
                    System.out.print("Gratificação(Aumento) em R$ ");
                    func[indexes].setGratificacao(scan.nextDouble());
                    System.out.println("--------------CADASTRADO COM SUCESSO-----------------");
                    indexes++;
                    cont++;
                    break;
                case 2:
                    System.out.println("---------------DADOS DO(S) FUNCIONÁRIO(S)------------------");
                    if(indexes<1){
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    for(int index=0; index<cont; index++){
                        if(func[index]!=null){
                            System.out.println(func[index].toString());
                            System.out.println("----------------------------");
                    }}
                    break;
                case 3:
                    x=0;
                    break;
            }
        }
    }
}
