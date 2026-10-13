# Cidadania em Rede

App web educativo de letramento político e eleitoral, desenvolvido na disciplina de
Programação Orientada a Objetos (UNIJORGE, 2026.2) como projeto de extensão.

Todos os partidos e candidatos usados no app são **fictícios**.

## Como começar

1. No GitHub, crie o repositório do seu grupo a partir deste modelo (**Use this template**).
2. No repositório do grupo: **Code → Codespaces → Create codespace on main**.
   Na primeira vez o ambiente baixa as dependências e pode levar vários minutos.
3. No terminal do Codespace:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Quando aparecer `Started LetramentoApplication`, abra a porta **8080** (aviso *Open in Browser*
   ou aba **Portas** → ícone de globo).

Se aparecer `./mvnw: Permission denied`, rode `chmod +x mvnw` e tente de novo.

## Estrutura

```
src/main/java/br/unijorge/letramento/
├── LetramentoApplication.java   ← classe principal: não mova de lugar
├── modelo/                      ← classes do domínio (Partido, Candidato, Cargo...)
├── servico/                     ← regras de negócio
├── repositorio/                 ← interfaces de acesso aos dados
│   └── json/                    ← implementações que leem os arquivos JSON
└── ui/vaadin/                   ← telas
src/main/resources/
├── application.properties       ← configurações do Spring
└── dados/                       ← arquivos JSON de conteúdo
src/test/java/br/unijorge/letramento/   ← testes
```

## Entregas

Cada encontro termina com um commit e uma tag (`e1`, `e2`, ...):

```bash
git add .
git commit -m "Encontro 1: Partido, Candidato e página inicial"
git tag e1
git push
git push origin e1
```

## Tecnologias

Java 21 · Spring Boot · Vaadin · Maven · GitHub Codespaces
(Trilha B: front-end em Angular rodando na porta 4200).

## Gabarito (branch `gabarito`)

Esta branch guarda a versão de referência da professora. A tag `e1` marca o fim do Encontro 1:
`Partido`, `Candidato` (com a regra RN01), `MainLayout`, `InicioView`, `partidos.json` e `candidatos.json`.
O arquivo temporário `Experimento.java` fica em `src/test/java/br/unijorge/letramento/` para demonstração (os alunos o apagam antes da entrega).
