void main(){

    var alunos = new String[3];
    var medias = new int[3];

    boolean continuar = true;

    while(continuar){

        IO.println("===MENU PRINCIPAL: GESTÃO DE TURMA===");
    IO.println("1 - Cadastrar alunos e médias");
    IO.println("2 - Exibir lista de alunos e notas");
    IO.println("3 - Buscar aluno");
    IO.println("4 - Sair");
    
    int opcao = Integer.parseInt(IO.readln("Escolha uma opcao: "));

        switch(opcao){
        case 1:
        for(int cont=0;cont<3;cont++){
            alunos[cont] = IO.readln("Digite o nome " + (cont+1) + " do aluno: ");
            medias[cont] = Integer.parseInt(IO.readln("Digite a média " + (cont+1) + " do aluno: "));

            if(medias[cont] <0 || medias[cont] > 10 ){
                IO.println("A média digitada é inválida!");
            }
        }

        break;
        case 2:
            IO.println("Esta é a lista de alunos: ");

            for(int cont=0;cont<3;cont++){
                IO.println("Aluno: " + alunos[cont]);
                IO.println("Média: " + medias[cont]);

                if(medias[cont]>= 7.0){
                    IO.println("Aprovado!");
                }else{
                    IO.println("Reprovado!");
                }
            }

            break;
        case 3:
        case 4:
            continuar = false;
    }
    }
}