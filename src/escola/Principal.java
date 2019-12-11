
package escola;


public class Principal {

    
    public static void main(String[] args) {
        
        System.out.println("(: Professores: \n");
        
        Professor p1 = new Professor();
        
        
        p1.setNome("Rodolfo");
        p1.setDisciplina("Logica de Programacao orientada a objeto");
        p1.getNome();
        p1.abrirSala();
        
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Disciplina: "+p1.getDisciplina()+"\n");
        
        
        Professor p2 = new Professor();
        
        p2.setNome("Claudio");
        p2.setDisciplina("Banco de dados");
        p2.abrirSala();
        
        System.out.println("Nome: "+p2.getNome());
        System.out.println("Disciplina: "+p2.getDisciplina()+"\n");
        
        
        Professor p3 = new Professor();
        
        p3.setNome("Paulo");
        p3.setDisciplina("Programacao Web");
        
        System.out.println("Nome: "+p3.getNome());
        System.out.println("Disciplina: "+p3.getDisciplina()+"\n");
        
        
        
        System.out.println(" (: Coordenadores: \n");
        Coordenador c1 = new Coordenador();
        
        c1.setNome("Veridiane");
        c1.setEscola("Sao Joao");
        c1.abrirSala();
        
        System.out.println("Nome: "+c1.getNome());
        System.out.println("Escola: "+c1.getEscola());
        
        Coordenador c2 = new Coordenador();
        
        c2.setNome("Carlos");
        c2.setEscola("Luiz Abel");
        c2.abrirSala();
        System.out.println("Nome: "+c2.getNome());
        System.out.println("Escola: "+c2.getEscola());
        
        Coordenador c3 = new Coordenador();
        
        c3.setNome("Jussimar");
        c3.setEscola("Etec Peruibe");
        c3.abrirSala();
        System.out.println("Nome: "+c3.getNome());
        System.out.println("Escola: "+c3.getEscola());
        
        
    }
    
}
