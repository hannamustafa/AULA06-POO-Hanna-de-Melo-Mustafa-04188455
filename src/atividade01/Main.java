package atividade01;

class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Rebeca", 21, "F", 5567, "Arquitetura");
        Professor p = new Professor("Sabrina", 47, "F", "Química", 8900.50);
        Funcionario f = new Funcionario("André", 33, "M", "Patrimônio", true);

        System.out.println("Aluno: " + a.getNome() + " Curso: " + a.getCurso());
        System.out.println("Professor: " + p.getNome() + " Área: " + p.getEspecialidade());
        System.out.println("Funcionário: " + f.getNome() + " Setor: " + f.getSetor());
    }
}
