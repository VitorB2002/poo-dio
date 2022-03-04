package dominio;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		
		curso1.setTitulo("Introdução ao Git e Github");
		curso1.setDescricao("Curso voltado para ensinar o basico de git");
		curso1.setCargaHoraria(2);
		
		curso2.setTitulo("Introdução as IDE's java");
		curso2.setDescricao("Curso voltado para ensinar o basico de algumas IDE's java");
		curso2.setCargaHoraria(4);
		
		mentoria1.setTitulo("Mentoria de futuras profissoes");
		mentoria1.setDescricao("Abordando o mercado atual e o que ele pode vim a se tornar no futuo");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp GFT START");
		bootcamp.setDescricao("Bootcamp focado na especialização em linguagem java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devVector = new Dev();
		devVector.setNome("Vector");
		devVector.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos" + devVector.getConteudosInscritos());
		devVector.progedir();
		devVector.progedir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos" + devVector.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devVector.getConteudosConcluidos());
		System.out.println("XP:" + devVector.calcularTotalXp());
		System.out.println("======");
		
		Dev devYuri = new Dev();
		devYuri.setNome("Yuri");
		devYuri.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos" + devYuri.getConteudosInscritos());
		devYuri.progedir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos" + devYuri.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devYuri.getConteudosConcluidos());
		System.out.println("XP:" + devYuri.calcularTotalXp());
		System.out.println("======");
		
	}

}
