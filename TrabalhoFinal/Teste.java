import java.util.Scanner;
import java.util.List;

public class Teste {
    private static Scanner scanner = new Scanner(System.in);//cria um Scanner para ler entrada do teclado (System.in).
    private static Consultorio consultorio = new Consultorio();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar médico");
            System.out.println("2. Cadastrar paciente");
            System.out.println("3. Agendar consulta");
            System.out.println("4. Listar médicos");
            System.out.println("5. Listar pacientes");
            System.out.println("6. Buscar médico por especialidade");
            System.out.println("7. Cadastrar tratamento");
            System.out.println("8. Listar tratamentos do paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();// leitura da entrada do usuário
            scanner.nextLine(); //limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarMedico();
                    break;
                case 2:
                    cadastrarPaciente();
                    break;
                case 3:
                    agendarConsulta();
                    break;
                case 4:
                    listarMedicos();
                    break;
                case 5:
                    listarPacientes();
                    break;
                case 6:
                    buscarPorEspecialidade();
                    break;
                case 7:
                    cadastrarTratamento();
                    break;
                case 8:
                    listarTratamentosPaciente();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();
    }

    private static void cadastrarMedico() {
        System.out.println("\n=== CADASTRO DE MÉDICO ===");
        System.out.print("Nome do médico: ");
        String nome = scanner.nextLine();
        
        System.out.println("Tipo de médico:");
        System.out.println("1. Clínico Geral");
        System.out.println("2. Especialista");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Medico medico;
        if (tipo == 1) {
            medico = new MedicoClinicoGeral(nome);
        } else {
            System.out.print("Especialidade: ");
            String especialidade = scanner.nextLine();
            medico = new MedicoEspecialista(nome, especialidade);
        }
        
        consultorio.adicionarMedico(medico);
        System.out.println("Médico cadastrado com sucesso!");
    }

    private static void cadastrarPaciente() {
        System.out.println("\n=== CADASTRO DE PACIENTE ===");
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        
        Paciente paciente = new Paciente(nome);
        consultorio.adicionarPaciente(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void agendarConsulta() {
        System.out.println("\n=== AGENDAMENTO DE CONSULTA ===");
        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();
        
        System.out.print("Nome do médico: ");
        String nomeMedico = scanner.nextLine();
        
        System.out.print("Data (YYYY-MM-DD HH:MM): ");
        String data = scanner.nextLine();

        try {
            Consulta consulta = consultorio.agendarConsulta(data, nomeMedico, nomePaciente);
            System.out.println("Consulta agendada com sucesso!");
            System.out.println("Detalhes: " + consulta.getMedico().getNome() + 
                             " atenderá " + consulta.getPaciente().getNome() + 
                             " em " + consulta.getData());
        } catch (MedicoIndisponivelException e) {
            System.out.println("Erro ao agendar: " + e.getMessage());
        }
    }

    private static void listarMedicos() {
        System.out.println("\n=== LISTA DE MÉDICOS ===");
        for (Medico m : consultorio.getMedicos()) {
            if (m instanceof MedicoEspecialista) {
                System.out.println("- " + m.getNome() + 
                    " (Especialista em " + ((MedicoEspecialista)m).getEspecialidade() + ")");
            } else {
                System.out.println("- " + m.getNome() + " (Clínico Geral)");
            }
        }
    }

    private static void listarPacientes() {
        System.out.println("\n=== LISTA DE PACIENTES ===");
        for (Paciente p : consultorio.getPacientes()) {
            System.out.println("- " + p.getNome());
        }
    }

    private static void buscarPorEspecialidade() {
        System.out.println("\n=== BUSCA POR ESPECIALIDADE ===");
        System.out.print("Digite a especialidade: ");
        String especialidade = scanner.nextLine();
        
        List<Medico> especialistas = consultorio.buscarMedicosPorEspecialidade(especialidade);
        if (especialistas.isEmpty()) {
            System.out.println("Nenhum médico encontrado com esta especialidade.");
        } else {
            System.out.println("Médicos encontrados:");
            for (Medico m : especialistas) {
                System.out.println("- " + m.getNome());
            }
        }
    }

     private static void cadastrarTratamento() {
        System.out.println("\n=== CADASTRO DE TRATAMENTO ===");
        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();
        
        Paciente paciente = consultorio.buscarPacientePorNome(nomePaciente);
        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }

        System.out.print("Descrição do tratamento: ");
        String descricao = scanner.nextLine();
        
        System.out.print("Data de início (YYYY-MM-DD): ");
        String inicio = scanner.nextLine();
        
        System.out.print("Data de fim previsto (YYYY-MM-DD): ");
        String fim = scanner.nextLine();

        Tratamento tratamento = new Tratamento(descricao, inicio, fim);
        paciente.adicionarTratamento(tratamento);
        System.out.println("Tratamento cadastrado com sucesso!");
    }

    private static void listarTratamentosPaciente() {
        System.out.println("\n=== TRATAMENTOS DO PACIENTE ===");
        System.out.print("Nome do paciente: ");
        String nomePaciente = scanner.nextLine();
        
        Paciente paciente = consultorio.buscarPacientePorNome(nomePaciente);
        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }

        List<Tratamento> tratamentos = paciente.getTratamento();
        if (tratamentos.isEmpty()) {
            System.out.println("Nenhum tratamento encontrado.");
            return;
        }

        System.out.println("Tratamentos de " + paciente.getNome() + ":");
        for (Tratamento t : tratamentos) {
            System.out.println("- Descrição: " + t.getDescricao());
            System.out.println("  Início: " + t.getInicio());
            System.out.println("  Fim previsto: " + t.getFim());
            System.out.println();
        }
    }
}