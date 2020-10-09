package alunonota;
public class AlunoNota {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[2];
        aluno[0] = new Aluno("20109111998","Wellintin",10f,10f,10f);
        aluno[0].calcMedia();
        aluno[0].notaFinal();
        aluno[1] = new Aluno("20109222435","Aedinha",5.6f,6f,6.1f);
        aluno[1].calcMedia();
        aluno[1].notaFinal();
        //EITA AEDINHA FALTOU POUCO!!
    }
}