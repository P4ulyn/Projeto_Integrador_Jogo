import java.util.Scanner;
import java.util.Random;

public class projeto {
  
  // Funcao que representa o menu
  public static void menuInicial(){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Loading...");
    
		System.out.println("***** BEM VINDO AO NOSSO JOGO *****");
		System.out.println("***** 1 - Começar a jogar     *****");
		System.out.println("***** 2 - Creditos            *****");
		System.out.println("***** 3 - Sair                *****");
    System.out.println("***** Digite sua opção:       *****");
		
    int escolhaMenu = 0;
    escolhaMenu = sc.nextInt();

    if (escolhaMenu < 1 || escolhaMenu > 3) {
     System.out.println("Digite um numero válido");
      menuInicial();
    }
    
    if(escolhaMenu == 1) {
      jogoCompleto();
    } else if (escolhaMenu == 2) {
      creditos();
    } else if (escolhaMenu == 3) {
      sairGame();
    }
  }

  // Funcao que mostra os creditos

  public static void creditos() {
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Jogo criado e desenvolvido apenas em funcao de estudo \n");
    System.out.println("Roteiro: \n Pedro Arthur \n Paulo Henrique \n Gustavo Antonio \n");
    System.out.println("direcao:\n Pedro Arthur \n Paulo Henrique \n Gustavo Antonio \n");
    System.out.println("programacao:\n Pedro Arthur \n Paulo Henrique \n Gustavo Antonio \n");
    System.out.println("Personagens:\n Pedro Arthur \n Paulo Henrique \n Gustavo Antonio \n"); 
    System.out.println("Direcao de arte:\n Pedro Arthur \n Paulo Henrique \n Gustavo Antonio \n");

    
    System.out.println("Aperte qualquer tecla para voltar ao menu");
    char char1 = sc.nextLine().charAt(0);

    // Chamada de funcao menu.
    menuInicial(); 
  }

  // Funcao que sai do jogo

  public static void sairGame() {
    System.out.println("Obrigado por jogar \n");
    System.out.println("\n Volte a jogar com a gente a qualquer dia !!");
  }

  // Funcao para separar os diálogos.

  public static void cortaDialogo() {
    Scanner sc = new Scanner (System.in);
    sc.nextLine();
  }

  // Funcao que inicializa o jogo / possui todos os diálogos.

  public static void jogoCompleto(){
    Scanner sc = new Scanner (System.in);
    Random ra = new Random();
    // Capitulo 1
    System.out.println(" CAPITULO 1 - DESTINED TO SAVE ");
    cortaDialogo();
    
    System.out.println(" Você acorda em uma manhã ensolarada deitada em uma cama de flores \n que, por sua vez, se encontra localizada em um desconhecido bosque verde. \n Seu nome é Alya, você tem 19 anos e no mais importante… Não faz a menor ideia aonde está. \n A estrada de pedras a frente é suficientemente chamativa para te fazer seguir seu caminho por ela.\n Um pouco a frente, um velho de barba branca e um cajado em forma de estrela te recepciona,\n dizendo que agora É A SUA VEZ. Assim, ele te entrega o cajado-estrela.");
    cortaDialogo();
    
    System.out.println("    /Você recebe o cajado-estrela.");
    cortaDialogo();

    System.out.println("Alya: ??");
    cortaDialogo();

    System.out.println("Velho: fico feliz que você finalmente “acordou da realidade” e esteja pronta para atuar no seu novo cargo");

    int calculo = 0;
    while (calculo < 2) {
      
    
      System.out.println("1. - Realidade...?");
      System.out.println("2. - O que quer dizer com novo cargo?");
      int opcaoP = sc.nextInt(); 
      
      System.out.println(" ");
      switch (opcaoP) {
          
        case 1:
        System.out.println("Velho: Sim, você não está mais na sua querida casa com seus parentes,\n amigos e animais de estimação… não… na verdade, esse é o seu pós morte");
        cortaDialogo();
        int calculoCap1 = 0;
          // Aqui começa o laço de repetição que esta responsavel por fazer com que o jogador so passe para a proxima parte só depois de escolher as duas opções.
      while (calculoCap1 < 2) {
        System.out.println("A — Espera… eu morri? como? porque eu não me lembro de nada?");
        System.out.println("B — Então isso é o purgatório…? ou… céu…?");
        
        int opcaoCap1 = sc.next().charAt(0);
        System.out.println(" ");
          // aqui começa o switch que esta responsavel de ler o numero Scanneado e trazer a parte correspondente.
        switch (opcaoCap1) {
          case 'a':
          System.out.println("Velho: Sim, você morreu.");
          cortaDialogo();
          System.out.println("Alya: NÃO FALA COMO SE FOSSE A COISA MAIS NORMAL DO MUNDO, ME EXPLICA TUDO NÉ!!!");
          cortaDialogo();
          System.out.println("Velho: Ok, vamos por partes.");
          cortaDialogo();
          calculoCap1 += 1;
          break;
            
          case 'b':
          System.out.println("Velho: Esse lugar está um pouco além da sua compreensão");
          cortaDialogo();
          System.out.println("Alya: Como assim… um pouco além da minha compreensão?");
          cortaDialogo();
          System.out.println("Velho: Não se preocupe, nem mesmo eu sei direito. \n Apenas entenda que seu novo cargo lhe trará respostas o suficiente para qualquer pergunta que tenha sobre aqui");
          cortaDialogo();
          calculoCap1 += 1;
          break;
          default:
            System.out.println("Digite uma letra válida");
            break;
        }
      }  
        calculo += 1;
        break;
          
        case 2:
          

          System.out.println("Velho: Não sei o que você fez durante todo esse tempo, mas se veio parar aqui é porque você precisa resolver alguma coisa");
          cortaDialogo();         
          System.out.println("Alya: Alguma coisa? Tipo, eu tenho que salvar esse mundo com meus poderes e coisas do tipo?");
          cortaDialogo();            
          System.out.println("Velho: Bem, em tese voc-");
          cortaDialogo();
          System.out.println("Alya: ISSO É MUITOOO FOOODAA!! EU SOU TIPO UM DAQUELES HERÓIS AQUI ENTÃO??");
          cortaDialogo();            
          System.out.println("Velho: É que… herói é uma palavra muito for–");
          cortaDialogo();         
          System.out.println("Alya: CARACA, PENSAR QUE O PÓS MORTE SERIA TÃO INCRÍVEL ASSIM, EU TERIA MORRIDO BEM ANTES SE SOUBESSE");
          cortaDialogo();           
          System.out.println("Velho: SE ACALMA GAROTA DEIXA EU FALAR");
          cortaDialogo();           
          System.out.println("Velho: Algo no seu passado te perturba e… pra isso ser solucionado, te resta apenas salvá-los.");
          cortaDialogo();

          int calculoCap12 = 0;

      // inicio segundo while
      while (calculoCap12 < 2) {
        System.out.println("A - Salvar quem?");
        System.out.println("B - Não tem nada que me pertube ou que precise resolver");

        int opcaoCap12 = sc.next().charAt(0);
        // switch para as duas questões
        switch (opcaoCap12) {
          case 'a':
            System.out.println("Velho: Os bons habitantes desse mundo, que estãp apenas esperando você para desfrutarem da liberdade e do prazer da não existencia");
            cortaDialogo();
            
            System.out.println("Alya: NÃO EXISTENCIA?? Vou ter que matar eles?");
            cortaDialogo();
            
            System.out.println("Velho: NÃO!! Quando digo salvar quero dizer que, todos os habitantes aqui estão presos nessa realidade, por erros ou conflitos internos que tem ou tinham. \n Quando isso for solucionado e eles estiverem preparados, eles passam pela ponte de madeiras e estão livres para não existir em paz.");
            cortaDialogo();
  
            System.out.println("Alya: Eles estão de boa em não existir?");
            cortaDialogo();
  
            System.out.println("Velho: Quando se vive por muito tempo aqui, às vezes só queremos desaparecer, porque ainda vivendo aqui, carregamos um fardo conosco. Ajudamos eles a sumir da existência, mas isso é decisão deles no final, alguns estão aqui há mais de 5000 anos.");
            cortaDialogo();
  
            System.out.println("Alya: ah… entendi.");
            cortaDialogo();
            
            calculoCap12 += 1;
            break;
            
          case 'b':
            System.out.println("Velho: no fundo do seu coração, você sabe que tem algo ou tinha algo na sua realidade.");
            cortaDialogo();
            
            System.out.println("Alya: Nah, tô bem de boa com todo mundo sabe, comigo então… pffft, meu ego não me deixa ficar pra baixo.");
            cortaDialogo();
            
            System.out.println("Velho: Bem, se você quer ficar mentindo pra um Velho Sábio que nem eu tudo bem, não sou eu que vou te mudar, são eles.");
            cortaDialogo();
              
            System.out.println("Alya: Não tô afim de charadas, foi mal.");
            cortaDialogo();             
            calculoCap12 += 1;
            break;
          default:
            System.out.println("Digite uma letra válida");
            break;
        }
        cortaDialogo();
      }

        
        calculo += 1;
        break;
      }
    } // final do primeiro while.
    
    System.out.println("  /O senhor vai seguindo pela estrada a frente.");
    cortaDialogo(); 

    System.out.println("Senhor: Vamos, sua vez de libertar a primeira pessoa");
    cortaDialogo();
    
    System.out.println("Seguir o Senhor: S ou N?");
    char Simounao = sc.next().charAt(0);

    if (Simounao == 's'){
      System.out.println(" /Você segue o Velho que, dentre grama e flores, se dirige até uma pequena estrada de pedregulhos que levam até uma ponte");
    }
    else if (Simounao =='n') {
      System.out.println("Nem pensa nisso, esse é o tutorial ainda, não estamos afim de criar mil finais pra esse jogo lmao.");
      cortaDialogo();
      
      System.out.println("/Você segue o Velho que, dentre grama e flores, se dirige até uma pequena estrada de pedregulhos que levam até uma ponte.");
    }
    else {
      System.out.println("Voce é burro ou oq nao sabe digitar s ou n?");

    }
      cortaDialogo();

    System.out.println("Chegando até a ponte, é possível ver que... não há ninguém ali. (?)" );
    cortaDialogo();

    System.out.println("");
  

    System.out.println("Alya: Então nós chegamos adiantados ou... a pessoa que eu vou libertar e tal que tá atrasada?");
    cortaDialogo();

    System.out.println("Velho: Sou eu, Alya, você vai ME libertar.");
    cortaDialogo();

    System.out.println("Alya: Ah, então você vai… morrer?");
    cortaDialogo();

    System.out.println("Velho: Em tese já estamos mortos, eu apenas vou deixar de existir.");
    cortaDialogo();

    System.out.println("Alya: Você não vai explodir do nada na minha frente, né? Tipo, uma explosão de tripas, sangue e…");
    cortaDialogo();

    System.out.println("Velho: não… não é assim que funciona");
    cortaDialogo();

    System.out.println("Alya: Ok, fico mais aliviada. Então me diga, como eu te salvo?");
    cortaDialogo();
    
    System.out.println("Velho: Como você verá daqui pra frente, salvar pessoas é um processo cauteloso que envolve atenção e escuta. Você… bem, você não parece ter nenhum dos dois, mas isso se desenvolve (eu espero…).");
    cortaDialogo();

    System.out.println("Alya: Vou ignorar o que você disse.");
    cortaDialogo();

    System.out.println("Velho: Viu?");
    cortaDialogo();

    System.out.println("Alya: NÃO QUIS DIZER NESSE SENTIDO!!!");
    cortaDialogo();

    System.out.println("Velho: Para me libertar, você deve me ajudar a solucionar o problema que me perturba desde a vida, porém, eu já solucionei ele há alguns dias então… é… vamos ver se consigo um exemplo pra te ajudar.");
    cortaDialogo();

    
    System.out.println("1. Problema complexo e realmente muito triste :(");
    System.out.println("2. Pizza");
    System.out.println("                                  POR FAVOR DIGITE UM OU DOIS!!!");
    int resposta = sc.nextInt();

    switch (resposta){
      case 1:
        System.out.println("Desculpa não vai dar, esse problema é muito complexo e triste pro início do jogo, vai com calma. (Não viu a carinha triste ali?)");
        cortaDialogo();

      case 2:
         System.out.println("Velho: Eu… eu simplesmente não consigo escolher qual sabor de pizza eu gosto mais");
        cortaDialogo();

        System.out.println("Alya: …??");
        cortaDialogo();

        System.out.println("Velho: Esse problema, ele me perturba desde que eu me entendo por gente, você… poderia me ajudar?");
        cortaDialogo();

        System.out.println("Alya: Então… eu mando você se fuder agora ou…");
        cortaDialogo();

        System.out.println("Velho: ISSO É UM PROBLEMA COMPLEXO E REALMENTE TRISTE PRA MIM, TÁ LEGAL? CADÊ A GUARDIÃ QUE AJUDA OS OUTROS??");
        cortaDialogo();

        System.out.println("Alya: TÁ, TÁ, CALMA… vamos ver.");
        cortaDialogo();

        System.out.println("1. Calabresa.");
        System.out.println("2. Portuguesa.");
        System.out.println("3. Quatro queijos.");
        int resposta2 = sc.nextInt();

        if (resposta2 == 1 || resposta2 == 3){
          System.out.println("Velho: Não, você errou");
          cortaDialogo();
          System.out.println("Alya: COMO ASSIM EU ERREI, NEM TINHA COMO ERRAR!! VOCÊ NEM SABE QUAL É O SEU SABOR FAVORITO!!");
          cortaDialogo();
          System.out.println("Velho: É portuguesa.");
          cortaDialogo();
          System.out.println("Alya: E COMO EU ÍA SABER???");
          cortaDialogo();
          System.out.println("Velho: Isso já era problema seu.");
          cortaDialogo();
          System.out.println("Velho: Muitas vezes, você vai achar que está guiando a pessoa pro caminho correto ao seu ver, mas, sempre tente olhar do ponto de vista dela, pelas emoções dela. Se lembre Alya, nos problemas deles, você conseguirá as soluções dos seus.");
          cortaDialogo();
          System.out.println("Alya: SEU IDI-- olha, eu já disse, não tenho nenhum problema, tipo, nenhum mesmo. Se tivesse, tudo seria como antes, eu solucionando ele sozinho, sem precisar achar soluções em outras pessoas.");
          cortaDialogo();
          System.out.println("Velho: Ouvir isso é triste para um velho como eu. Você pode ser melhor, Alya…");
          cortaDialogo();
          System.out.println("Alya: Melhor? Melhor que o que?");
          cortaDialogo();
          System.out.println("Velho: Melhor que eu.");
          cortaDialogo();
          System.out.println("Alya: …");
          cortaDialogo();
        }

        else if(resposta2 == 2){
          System.out.println("Velho: Acertou");
          cortaDialogo();
          System.out.println("Alya: Ah… então já tinha uma resposta");
          cortaDialogo();
          System.out.println("Velho: Sempre tem, mas não é questão de chute que nem você acabou de fazer, na verdade, envolve muito mais que só um chute, envolve entender a ajuda que está sendo dada para ambos os lados.");
          cortaDialogo();
          System.out.println("Alya: Eu não preciso de ajuda em nada, já disse.");
          cortaDialogo();
          System.out.println("Velho: Você só não sabe ainda");
          cortaDialogo();
          System.out.println("Alya: E nem saberei.");
          cortaDialogo();
          System.out.println("Velho: As coisas serão mais difíceis do que parece, Alya. Pra isso, você tem que deixar esse seu Eu de lado e crescer.");
          cortaDialogo();
          System.out.println("Alya: Eu não pedi por nada disso, cara. Por que você só não procura outro guardião ou guardiã então?");
          cortaDialogo();
          System.out.println("Velho: Porque você é exatamente o tipo de pessoa que um guardião é.");
          cortaDialogo();
          System.out.println("Alya: …");
          cortaDialogo();
          
        }
    }
    System.out.println("   /O vento começa a balançar os vários lenços coloridos amarrados nas bordas da ponte, uivando levemente em sintonia com algumas folhas vindas do bosque");
    cortaDialogo();
     System.out.println("Velho: Antes de me despedir, sabe uma coisa que eu achei muito estranha em você?");
      cortaDialogo();
    System.out.println("Velho: O fato de você não estar desesperada para voltar pra casa, nem mesmo confusa, indagando tudo ao seu redor. Ao contrário, do início ao fim da nossa conversa, todo sentimento esboçado foi o mesmo.");
    cortaDialogo();

    System.out.println("                      A C E I T A Ç Ã O");
    cortaDialogo();

    System.out.println("Velho: Pra você, esse lugar não é o céu, inferno, purgatório ou sequer um loop temporal, você no fundo sabe que não é.");
    cortaDialogo();

    System.out.println("Velho: Pra você, esse lugar é uma segunda chance.");
    cortaDialogo();

    System.out.println("Alya: …");
    cortaDialogo();
    

    System.out.println("Velho: Não sei o que houve no seu passado, mas o recomeço que você espera ter aqui, não é o que ele vai te dar.");
    cortaDialogo();

    System.out.println("Alya: Você não entende…");
    cortaDialogo();

    System.out.println("Velho: É… eu não entendo.");
    cortaDialogo();

    System.out.println("    /Com um sorriso no rosto, ele aponta a mão para o cajado-estrela em suas mãos que começa a brilhar intensamente. Diversos feixes de luz saem do cajado, indo em direção ao Velho no meio da ponte.");
    cortaDialogo();
    
    System.out.println("Velho: O barqueiro ao fim da ponte te guiará para a sua primeira missão.");
    cortaDialogo();

    System.out.println("    /Ele começa a flutuar, tendo todo sua silhueta transformada em pura luz, mas de todo aquela claridade, ainda é possível ouvir ecoar nas profundezas do que antes era um ser chamado Mathias (Velho).");
    cortaDialogo();

    System.out.println("Mathias (Velho): Seja Melhor, Alya. Você é a sua única esperança.");
    cortaDialogo();

    System.out.println("A luz chega em seu ápice e… assim se vai.");
    cortaDialogo();

    System.out.println("[Mathias não existe mais.] \n [1/3 Libertos] \n [Últimas Palavras: Seja Melhor, Alya. Você é a sua única esperança]");
    cortaDialogo();

    System.out.println("Ali, onde antes estava o velho Mathias, nada mais resta além de uma foto polaroid dele em uma festa de criança, brincando com o seu filho fantasiado de cowboy.");
    cortaDialogo();

    System.out.println("Alya: Então… o problema dele era com o filho…?");
    cortaDialogo();

    System.out.println("    /Você ganhou “Foto - Pai e Filho”");
    cortaDialogo();

    System.out.println("Sendo assim, Alya olha para o Cajado-Estrela e o aperta firme, antes de dar os seus próximos passos.");
    cortaDialogo();

    System.out.println("Alya: Eu sou a minha única esperança…?");
    cortaDialogo();

    System.out.println("Com essa pergunta na cabeça, Alya prossegue seu trajeto, indo até o tal barqueiro no final da ponte.");
    cortaDialogo();
    
   System.out.println("                Capítulo 1: Learn to be Loved.");
    cortaDialogo();




    

    // capitulo 2

    System.out.println("  /Ao chegar no fim da ponte, é possível ver beira rio um barquinho, parecido com um bote,\n onde um rinoceronte enorme vestindo um grande sobretudo marrom e um chapéu de pirata está lhe esperando com um remo desproporcionalmente gigante em comparação à outros existentes.");
    cortaDialogo();

    System.out.println("Rino (Sim um rinoceronte chamado Rino, somos muito criativos): GUARDIÃ HOHOHOHOHOHOHOHO!!!");
    cortaDialogo();

    System.out.println("Alya: eeh, oi…?");
    cortaDialogo();

    System.out.println(" Rino: OI!!!");
    cortaDialogo();
    
    System.out.println("Alya: :|");
    cortaDialogo();
    
    System.out.println("Rino: :<D !!! ");
    cortaDialogo();

    System.out.println("Alya: Você é bizarro, eu vou a pé…");
    cortaDialogo();

    System.out.println("Rino: ESPERE GUARDIÃ, ME DESCULPE PELA ALEGRIA E FELICIDADE EXAGERADA, O OUTRO GUARDIÃO TINHA ME MANDADO TE RECEBER ASSIM!!! ");
    cortaDialogo();

    System.out.println("Alya: exageradamente?");
    cortaDialogo();

    System.out.println("Rino: NÃO, ISSO É MARCA REGISTRADA DO RINO!!!");
    cortaDialogo();

    System.out.println("Alya: Quem é Rino?");
    cortaDialogo();
    
    System.out.println("Rino: EU SOU RINO!!! HOHOHOHOHOHO!!! ");
    cortaDialogo();

    System.out.println("Alya: ah… legal… me chamo Alya. ");
    cortaDialogo();

    System.out.println("Rino: ALEEEEEA!!!");
    cortaDialogo();

    System.out.println("Alya: É com Y, aí o som fica de I sabe, é mais questão de pronúncia e tal.");
    cortaDialogo();
    
    System.out.println("Rino: :<D !!! ");
    cortaDialogo();

    System.out.println("Alya: :|");
    cortaDialogo();

    System.out.println("Alya: Ok, você é extremamente bizarro eu vou a pé. ");
    cortaDialogo();
    
    System.out.println("Rino: CALMA ALOA, VOCÊ É A NOVA GUARDIÃ E EU SOU SEU GUIA ATÉ SEUS OBJETIVOS!!! ");
    cortaDialogo();

    System.out.println("Alya: Tô sabendo…");
    cortaDialogo();

    System.out.println("Rino: VAMOS, VAMOS!!! ENTRE NA MINHA HUMILDE EMBARCAÇÃO E REMEMOS ATÉ YZAC!!! ");
    cortaDialogo();

    System.out.println("Alya: Yzac é o nome de alguma cidade daqui?");
    cortaDialogo();

    System.out.println("Rino: NÃO, AS CIDADES DESSE MUNDO NÃO TEM NOME!!! YZAC É O NOME DA PESSOA A SER SALVO POR… AAALUUUAAA!!! ");
    cortaDialogo();

    System.out.println("Alya: É Alya… ");
    cortaDialogo();

    System.out.println("Rino: AAALYYYAAA!!! ");
    cortaDialogo();

    System.out.println(" Alya: :|");
    cortaDialogo();
    

    System.out.println("Ir até Yzac com Rino ou ir sozinha?");
    System.out.println("1 - Entrar na embarcação.");
    System.out.println("2 - Ir sozinha.");
    
    int escolhaCap2pt1 = sc.nextInt();
    if (escolhaCap2pt1 == 2) {
    System.out.println("Você não sabe o caminho HOHOHOHO!!!, volte pro barco!\nbem... voltando");
    }

    System.out.println("Você entra no barco e então... VUUUUUUUUUUUUUUUUUUUUUUUUUUUUUSHHHHHHH.\nA força daquele remo em água potencializa a velocidade do barquinho que os leva quase em um piscar de olhos até a Cidade");
    cortaDialogo();

    System.out.println("Rino: CHEGAMOS NA CIDADE!!!");
    cortaDialogo();

    System.out.println("Alya: Qual o nome dela?");
    cortaDialogo();

    System.out.println("Rino: CIDADE!!!");
    cortaDialogo();

    System.out.println("Alya: Aé, as cidades desse lugar não tem nome, né?");
    cortaDialogo();

    System.out.println("Rino: COMO APRENDE RÁPIDO!!! :<O");
    cortaDialogo();

    System.out.println("Alya: por favor só… ok, aonde eu acho o Yzac?");
    cortaDialogo();

    System.out.println("Rino: CIDADE!!!");
    cortaDialogo();

    System.out.println("Alya: Porra, eu vou ter que percorrer a cidade inteira atrás dele?");
    cortaDialogo();

    System.out.println("Rino: EU NÃO SEI, A GUARDIÃ AQUI É VOCÊ!!! HOHOHOHOHOHO!!!");
    cortaDialogo();

    System.out.println("Alya: Tchau, Rino.");
    cortaDialogo();

    System.out.println("Rino: TCHAU ALEIA!!!");
    cortaDialogo();

    System.out.println("Você desce da embarcação em um cais humilde de uma praia costeira. Não é um lugar gigante, mas pra ser explorado por uma pessoa, bem, há limites para a determinação. \nPor sorte, o cajado-estrela começa a brilhar levemente, parecendo que quer... captar a sua energia?");
    cortaDialogo();

    System.out.println("Para o cajado conseguir captar sua energia, responda: \n QUAL A RAIZ QUADRADA DE 36? \nACHOU QUE SERIA SÓ DIÁLOGO E ESCOLHA FACINHA, NÉ? ");
    cortaDialogo();

    System.out.println("Insira a resposta:");

    int raizQuadrada36 = sc.nextInt();

    // Switch para definir raiz quadrada, já checado
    
    switch (raizQuadrada36) {
      case 6:
        System.out.println("O cajado sente a energia vital que o seu corpo transborda para ele, e assim, cria uma linha de luz que segue caminho a frente.");
        break;
      default:
        System.out.println("Você é burro? essa é a raiz mais óbvia, responde direito!!!");
        break;
    }

    System.out.println("Depois de segui-la, você se vê guiada à um casebre aconchegante onde apenas a luz da sala parece estar acesa.\n Provavelmente, é lá que está Yzac.");
    cortaDialogo();

    System.out.println("Ir até a casa e bater na porta? S ou N");
    

    char opcaoCasaYzac = sc.next().charAt(0);

    // possivel final do jogo, já checado
    
    if (opcaoCasaYzac == 'n') {
      System.out.println("Você acha melhor não fazer nada, talvez a pessoa não goste de visitas ou você apenas não está no seu período mais social.\n...\n..\n bem, é isso...");
      cortaDialogo();
      System.out.println("Você decide NEM SEQUER TENTAR ser a merda da guardiã. \nVocê Perdeu.");
      cortaDialogo();
      menuInicial();
    }

    System.out.println("  /Você bate na porta e um menino de seus 16 anos abre. Por algum motivo que você não sabe, você sabe exatamente que ele é o Yzac.");
    cortaDialogo();

    System.out.println("Yzac: Oi…");
    cortaDialogo();

    System.out.println("Alya: Eae…");
    cortaDialogo();

    System.out.println("Alya: Você é o Yzac, né?");
    cortaDialogo();

    System.out.println("Yzac: Sou, quem é você?");
    cortaDialogo();

    System.out.println("Alya: Me chamo Alya, sou a guardiã!");
    cortaDialogo();

    System.out.println("Yzac: ah");
    cortaDialogo();

    System.out.println("  /VOCÊ RECEBEU… \n uma portada na cara");
    cortaDialogo();

    System.out.println("Alya: SEU MERD-");
    cortaDialogo();

    System.out.println("Como vai agir? \n 1. Vou estourar a porta de Yzac xingando ele por ter fechado a porta na minha cara \n 2. Tentarei me controlar e falar de novo com Yzac");
    

    int opcaoAbrirPorta = sc.nextInt();

    // Possivel final do jogo, já checado
    
    if (opcaoAbrirPorta == 1 ) {
      System.out.println("Alya: SEU FILHO DA PUTA!!!");
      cortaDialogo();

      System.out.println("Yzac: AAAAAAAAAAAAAAAAAAAAAAAA");
      cortaDialogo();

      System.out.println("Alya: EU VIM TE AJUDAR, VOCÊ NÃO DEVERIA ME TRATAR ASSIM SEU MERDINHA");
      cortaDialogo();

      System.out.println("Yzac: SUA MALUCA SOCIOPATA SAI DA MINHA CASA");
      cortaDialogo();
      
      System.out.println("Alya: NÃO, VOCÊ VAI SER SALVO SIM");
      cortaDialogo();

      System.out.println("Alya descontroladamente tenta salvar Yzac com a luz do cajado, mas parece que ele também servia como um ataque forte…\n Agora, Yzac está em chamas, mas pelo menos ele não pode morrer, já que… já está morto.");
    cortaDialogo();

      System.out.println("Você queimou vivo (ou morto?) a pessoa que você precisava salvar, talvez paciência não seja uma das suas melhores qualidades… \nVocê Perdeu");
    menuInicial();
    }

    System.out.println("Eu sei que isso não deve ser legal, eu me sinto como um vendedor ambulante batendo na porta dos outros pra vender, sei lá, sabão caseiro.\n Mas, talvez não seja tão mal tentar… sabe… se livrar desse peso");
    cortaDialogo();

    System.out.println("/Yzac abre a porta");
    cortaDialogo();

    System.out.println("Yzac: Você… realmente acha que consegue me ajudar?");
    cortaDialogo();

    System.out.println("Alya: Bem, eu gostaria de tentar.");
    cortaDialogo();

    System.out.println("Ele abre espaço para você entrar \nVocê entrou");
    cortaDialogo();

    System.out.println("Alya: Uau, que casa bonita e… exageradamente grande.");
    cortaDialogo();

    System.out.println("Yzac: É… ela retrata como era a minha casa no mundo real, a minha família era grande");
    cortaDialogo();

    System.out.println("Alya: Olha, a mesa de jantar é enorme!! Mal consigo imaginar como eram as reuniões em família, devia ser divertido");
    cortaDialogo();

    System.out.println("Yzac: No início sim, depois que só eu e minha mãe passamos a morar aqui, nada passou a ser muito divertido ou sequer feliz.");
    cortaDialogo();

    System.out.println("Alya: Eu… te entendo…");
    cortaDialogo();

    System.out.println("O cajado começa a brilhar levemente, como uma lamparina com o fogo baixo.\n Ele está sentindo, sentindo as suas emoções e… conectando com as do garoto");
    cortaDialogo();

    System.out.println("Já alguma vez pensou que a sensação de sentir o abraço de alguém que já se foi pode não ser mera sensação? \n 1 - Sim \n2 - Não");
    cortaDialogo();
    int escolha4 = sc.nextInt();

    if (escolha4 == 1) {
    System.out.println("    /Você recebeu compaixão");
    cortaDialogo();
    } else {
    System.out.println("...");
    cortaDialogo();
    }

    int rodouTodoSwitch = 0;
    while (rodouTodoSwitch <3) {
    System.out.println("Escolha a fita: ");
    
    System.out.println("1. Moa");
    System.out.println("2. Céu");
    System.out.println("3. Frio");
    int escolha3 =sc.nextInt();


    // switch para definir 3 respostas de pergunta
    
    switch(escolha3) {
      
      case 1:
        System.out.println("A fita mostra a imagem de uma mulher catando latinhas pelas ruas é apresentada. A fita se mantém assim.");
        cortaDialogo();
        rodouTodoSwitch += 1;
      break;
      
      
      case 2:
        System.out.println("A fita apresenta um céu estrelado do ponto de vista de alguém deitado, aos poucos os olhos se fecham.");
        cortaDialogo();
        rodouTodoSwitch += 1;
      break;
      

      case 3:
        System.out.println("Do ponto de vista do céu, um garoto deitado na neve fecha os olhos aos poucos enquanto alguém vai correndo aos poucos em sua direção.");
        cortaDialogo();
        System.out.println("Alya: O que são essas fitas?");
        cortaDialogo();
        System.out.println("Yzac: Memórias");
        cortaDialogo();
        System.out.println("Alya: Ela é bem enigmática, eu diria");
        cortaDialogo();
        System.out.println("Yzac: É…");
        cortaDialogo();
        System.out.println("Alya: Bem, se senta aí no sofá");
        cortaDialogo();
        System.out.println("/Tanto Alya quanto Yzac se sentam");
        cortaDialogo();
        System.out.println("1 - Como era o relacionamento com a sua mãe? \n2 - Por que só ficou você e sua mãe?");

        int escolhaAlyaSentada = sc.nextInt();
        // switch dentro do switch
        switch (escolhaAlyaSentada) {
          case 1:
            System.out.println("Yzac: A Mary era uma pessoa complicada, nunca fomos muito amigos, mas depois de morarmos sozinhos ela começou a piorar.");
            cortaDialogo();
            System.out.println("Alya: Piorar como?");
            cortaDialogo();
            System.out.println("Yzac: Ela achava que a culpa de tudo o que estava acontecendo era minha");
            cortaDialogo();
            System.out.println("Alya: E o que estava acontecendo?");
            cortaDialogo();
            System.out.println("Yzac: Muita coisa…");
            cortaDialogo();
            System.out.println("/Assim que Yzac olha para o canto meio deprimido, você percebe que seja lá o que seja essa muita coisa, talvez não seja melhor forçar ele a falar (pelo menos não por agora).");
            cortaDialogo();
            break;

          case 2:
            System.out.println("Yzac: Meus pais eram bons pais, mas não um bom casal");
            cortaDialogo();
            System.out.println("Alya: Eles brigavam muito?");
            cortaDialogo();
            System.out.println("Yzac: Nunca feriram um ao outro, a não ser por palavras");
            cortaDialogo();
            System.out.println("Alya: Isso acontece muito entre casais na verdade, Yzac.");
            cortaDialogo();
            System.out.println("Yzac: Todo dia…?");
            cortaDialogo();
            System.out.println("Alya: Não é tao fácil manter uma chama acesa por tanto tempo, querido.");
            cortaDialogo();
            System.out.println("Yzac: Então porque continuar com a vela?");
            cortaDialogo();
            System.out.println("Alya: Por que ainda havia esperança… em vocês. Quer dizer, você tinha irmãos?");
            cortaDialogo();
            System.out.println("Yzac: Tinha 2, um mais velho e o outro ainda era bebê.");
            cortaDialogo();
            System.out.println("Alya: Normalmente o bebê fica com a mãe, deve ter sido difícil pra você administrar tudo isso tão novo.");
            cortaDialogo();
            System.out.println("Yzac: Ele morreu…");
            cortaDialogo();
            System.out.println("Yzac: Na primeira semana com minha mãe, ela mal lembrava de cuidar da gente e aí, com uma doença forte e o descaso dela… o Antony não aguentou");
            cortaDialogo();
            System.out.println("Alya: Antony era o seu irmão bebê?");
            cortaDialogo();
            System.out.println("Yzac: Sim… O bruce era o mais velho, mas nunca mais tive contato com ele depois da separação.");
            cortaDialogo();
            System.out.println("Alya: Não posso imaginar a situação");
            cortaDialogo();
            break;

          default:
          System.out.println("Digite um número válido");
          break;
        }
        // fim do switch dentro do switch, já checado
        rodouTodoSwitch += 1;
        break;
        
      default:
        System.out.println("Mana para de ser burra e digita certo");
        break;
    }

    // Fim do switch inicial
    }
    System.out.println("VOCÊ DESEJA ATIVAR PERCEPÇÃO?");
    System.out.println("POR FAVOR DIGITE S OU N");
    char escolha5= sc.next().charAt(0);

    // ifs para escolhas, já checado
    
    if (escolha5 == 's'){
      System.out.println("O luto é um processo pertencente a que acontecimento?");
      cortaDialogo();
      
      System.out.println("1. Festa");
      System.out.println("2. Morte");
      System.out.println("3. Nascimento");
      System.out.println("4. Descobrimento");
      int escolha6= sc.nextInt();
      if (escolha6 == 1 || escolha6 == 3 || escolha6 == 4){
        System.out.println("Fico feliz que não saiba.");
      }
      else if (escolha6 == 2){
        System.out.println("Você vê isso hein Yzac?");
        char digite= sc.next().charAt(0);

        if (digite == 's'){
         System.out.println("Você é um guardião, veja mais a fundo.");
        }
        else if (digite == 'n'){
          System.out.println("Interesante.");
        }
      }
      
      
    }
    else if (escolha5 == 'n'){
      System.out.println("  ");
    }
    System.out.println("Alya: Na fita, eu vi uma mulher catando latinhas, era sua mãe?");
    cortaDialogo();

    System.out.println("Yzac: are...");
    cortaDialogo();

    System.out.println("Alya: O fim do casamento parece ter feito muito  mal á ela.");
    cortaDialogo();

    System.out.println("Yzac: Não são a mesma pessoa. A mora era... uma mãe de verdade...");
    cortaDialogo();

    System.out.println("Alya: Sua familia parecia ter uma boa condição, como você achou uma figurinha materna numa catadora de latinhas?");
    cortaDialogo();

    System.out.println("ISSO É RUDE!! ELA NÃO ERA SÓ UMA CATADORA DE LATINHAS, ELA TINHA UM CORAÇÃO BONDOSO E O MAIS PURO QUE EU JA VI, MAIS PURO QUE QUALQUER UM DE NÓS PODERIA TER, NUNCA MAIS FALE ASSIM DELA. FOI ELA QUE ME AJUDOU QUANDO EU ESTAVA PERDIDO.");
    cortaDialogo();

    
    System.out.println("Alya: Yzac… você…");
    cortaDialogo();
    System.out.println("1 - Fugiu de casa? \n2 - Foi deixado na adoção pela sua mãe e aí adotado pela... Moa? \n3 - Matou sua mãe de verdade?");
    
    int escolhaFugirCasa = sc.nextInt();

    // switch para 3 escolhas, já checado
    
    switch(escolhaFugirCasa) {
      case 1:
        System.out.println("Yzac: Sim… eu não podia suportar toda aquela merda que aconteceu com o Antony.");
        cortaDialogo();
        break;
      case 2: 
        System.out.println("Yzac: Você… tem uma imaginação fértil. Mas, realmente parece algo que ela faria… mas não… eu fugi de casa quase um mês depois da morte do Antony.");
        cortaDialogo();
        break;
      case 3:
        System.out.println("MAS COMO CARALHOS VOCÊ CHEGOU NESSA CONCLUSÃO??? ");
        cortaDialogo();
        System.out.println("Você decepcionou fortemente o narrador e ele decidiu que não vai mais narrar pra alguém como você. \nVocê Perdeu.");
        cortaDialogo();
        menuInicial();
        break;
      default:
        System.out.println("Digite um número válido");
        cortaDialogo();
        break;
    }
    
    System.out.println("Alya: E sua mãe?");
    cortaDialogo();
    System.out.println("Yzac: Nem veio atrás…");
    cortaDialogo();
    System.out.println("Alya: Meu deus…");
    cortaDialogo();

    System.out.println("    / Voce recebeu um gosto amargo na boca");
    cortaDialogo();
    
    System.out.println("Alya: Sua mãe era um monstro…");
    cortaDialogo();
    System.out.println("Yzac: Não, acho que no fim eu era o desastre que abalava todo mundo.");
    cortaDialogo();
    System.out.println("Alya: CLARO QUE NÃO YZAC!!!");
    cortaDialogo();
    System.out.println("/Algumas memórias começam a surgir na sua cabeça, mas estão quebradas o suficiente para não serem entendiveis. Mas elas te dão algo:");
    cortaDialogo();
    System.out.println("  /Você recebeu “Empatia”");
    cortaDialogo();
    System.out.println("Alya: Você não tem culpa das coisas horríveis que acontecem ao seu redor. \nEssa sua bolha de medo e culpa, só cobre você mesmo, garoto… você não vai me ajudar se mantendo dentro dela com esses pensamentos. \nEntão… durante essa conversa, apenas tente… entender.");
    cortaDialogo();
    System.out.println("Yzac: …e-entender o que?");
    cortaDialogo();
    System.out.println("Alya: Que a culpa não é sua.");
    cortaDialogo();
    System.out.println("  / Uma lágrima escorre do rosto de Yzac");
    cortaDialogo();
    System.out.println("Yzac: M-mas… a Moa me ajudou desde o início e, ainda sim, eu não lembro nem sequer da última vez que vi ela. \nNão lembro de ter dito tchau, de ter agradecido, nem de ter mostrado que ela sim era minha mãe. Eu só lembro… só lembro da porra de um céu…");
    cortaDialogo();
    System.out.println("Alya: Céu… A FITA!!!");
    cortaDialogo();
    System.out.println("/Alya vai correndo até a fita “Céu” e a insere depressa no vídeo cassete, assistindo ela");
    cortaDialogo();
    System.out.println("Yzac: O QU–");
    cortaDialogo();
    System.out.println("Alya: SHHHHHH, EU TIVE UMA IDEIA PRA SABER O QUE HOUVE");
    cortaDialogo();
    System.out.println("  /A fita mostra um céu estrelado, com alguns pequenos pontos brancos caindo");
    cortaDialogo();
    System.out.println("Alya: Isso é…?");
    cortaDialogo();
    System.out.println("1 - Estática \n2 - Poros \n3 -Neve");
    cortaDialogo();

    int escolhaEstatica = sc.nextInt();

    // Switch para 3 escolhas, já checado
    
    switch (escolhaEstatica) {
      case 1:
        System.out.println("Yzac: Não me parece isso…");
        cortaDialogo();
        System.out.println("Alya: É… Acho que eu não levo jeito");
        cortaDialogo();
        break;
      case 2:
        System.out.println("Yzac: Não me parece isso…");
        cortaDialogo();
        System.out.println("Alya: É… Acho que eu não levo jeito");
        cortaDialogo();
        break;
      case 3:
        System.out.println("Alya: então… tava nevando… ESSA É SUA ÚLTIMA LEMBRANÇA YZAC, ME FALA, QUE DIA ERA???");
        cortaDialogo();
        System.out.println("Yzac: QUE? EU… EU…");
        cortaDialogo();
        System.out.println("Alya: EU CONFIO EM VOCÊ YZAC, ME DIZ, QUAL DIA ERA ESSE QUE VOCÊ TAVA DEITADO VENDO A NEVE CAIR DO CÉU?");
        cortaDialogo();
        System.out.println("Yzac: Fe-Fevereiro… acho que 2021.");
        cortaDialogo();
        System.out.println("  /Alya pensa, pensa e por um momento… as coisas começam a se encaixar");
        cortaDialogo();
        System.out.println("Alya: Você e a Moa eram moradores de rua?");
        cortaDialogo();
        System.out.println("Yzac: Sim, por mais que morássemos na rua, minha vida era muito melhor ao lado dela. \nEla me alimentava com o pouco que tinha, me mostrava carinho e sempre dizia: \n“Ainda no fundo da escuridão, eu achei um pontinho de luz pra me ensinar a ser humana de novo”.");
        cortaDialogo();
        System.out.println("Alya: Você… Puta merda… Puta merda…");
        cortaDialogo();
        System.out.println("  / Alya põe a mão no rosto e começa a chorar");
        cortaDialogo();
        break;
      default:
        System.out.println("Digite um número válido");
        cortaDialogo();
        break;
    }

    System.out.println("  /Um garoto americano olha o céu estrelado que neva em fevereiro de 2021. \nO PIOR INVERNO QUE O EUA JÁ PASSOU.");
    cortaDialogo();
    System.out.println("Yzac: O… o que houve?");
    cortaDialogo();
    System.out.println("Alya: Eu sinto muito, eu sinto muito Yzac");
    cortaDialogo();
    System.out.println("  /Alya abraça de maneira forte o menino Yzac");
    cortaDialogo();
    System.out.println("Yzac: EU TO FICANDO COM MEDO… O QUE HOUVE?");
    cortaDialogo();
    System.out.println("Alya: Você… você morreu congelado , Yzac… foi uma das vítimas do inverno de 2021.");
    cortaDialogo();
    System.out.println("  /Yzac para perplexo e olha fixamente para o chão");
    cortaDialogo();
    System.out.println("  /Yzac começa a derrubar algumas lágrimas");
    cortaDialogo();
    System.out.println("Yzac: Eu mereci…?");
    cortaDialogo();
    System.out.println("Alya: NÃO, NÃO, VOCÊ NÃO MERECEU, NINGUÉM MERECE ALGO ASSIM YZAC. VOCÊ SÓ… NÃO TINHA ESCAPATÓRIA.");
    cortaDialogo();
    System.out.println("Yzac: Mas… mas e a Moa?");
    cortaDialogo();
    System.out.println("    /O cajado começa a brilhar intensamente");
    cortaDialogo();


    System.out.println("    Uma névoa branca começa a sair do cajado, entornando os dois ali presentes.");
    cortaDialogo();
    System.out.println("Yzac: O QUE É ISSO?");
    cortaDialogo();
    System.out.println("Alya: Eu não...");
    cortaDialogo();
    System.out.println("Você sabe");
    cortaDialogo();
    System.out.println("Alya: Ela vai nos levar");
    cortaDialogo();
    System.out.println("Yzac: Nos levar… pra onde???");
    cortaDialogo();
    System.out.println("Alya: pra sua resposta.");
    cortaDialogo();
    System.out.println("    A névoa vai se desfazendo, mostrando aos arredores o que parece ser uma rua coberta por neve e sujeira. Ali, vocês dois observam a figura de Yzac, contemplando o céu.");
    cortaDialogo();
    System.out.println("Yzac: sou eu… eu não me lembro disso…");
    cortaDialogo();
    System.out.println("Alya: Então é a hora de lembrar");
    cortaDialogo();
    System.out.println("Yzac vai indo até sua figura do passado, parando em sua frente e tentando falar com ele… mas nada acontece.");
    cortaDialogo();
    System.out.println("    Yzac do passado: Então… é assim?");
    System.out.println("    /O garoto tenta se cobrir com suas próprias roupas mas está muito fraco pra tentar fazer qualquer coisa a mais");
    cortaDialogo();
    System.out.println("Yzac do passado: Moa… me ajuda…");
    cortaDialogo();
    System.out.println("A neve cai sobre a figura do passado e do presente, ambas se perguntando: Por que?");
    cortaDialogo();
    System.out.println("Alya: Eu sinto muito");
    cortaDialogo();
    System.out.println("Yzac: Não faz sentido… eu sempre estava com a Moa… ela nunca saía de perto de mim");
    cortaDialogo();
    System.out.println("Alya: O cajado não vai aguentar tanto tempo, Yzac. Você precisa se lembrar…");
    cortaDialogo();
    


    boolean acertouMoa = false;

    do {
      System.out.println("1. Em casa \n2. Na neve \n3. Na Fita");
      int escolhaOndeMoa = sc.nextInt();
      switch(escolhaOndeMoa) {
        case 1:
          System.out.println("Assista de novo.");
          cortaDialogo();
          break;
        case 2:
          System.out.println("Assista de novo.");
          cortaDialogo();
          break;
        case 3:
          acertouMoa = true;
          break;
        default:
          System.out.println("Digite um número certo");
          cortaDialogo();
      }
    } while (acertouMoa == true);

    System.out.println("Tudo se apaga...");
    cortaDialogo();
    System.out.println("A fita começa.");
    cortaDialogo();
    System.out.println("{Memórias do Yzac - Se sinta livre}");
    cortaDialogo();
    System.out.println("{{Yzac fecha seus olhos de maneira lenta");
    cortaDialogo();
    System.out.println("Yzac: ...Moa... Me ajuda...");
    cortaDialogo();
    System.out.println("  /Uma figura vem correndo pelas ruas, tentando se equilibrar em sua incessante corrida sobre o gelo");
    cortaDialogo();
    System.out.println("Moa: YZAAAAC");
    cortaDialogo();
    System.out.println("Yzac: m...moa?");
    cortaDialogo();
    System.out.println("  /A mulher chega até o menino com a mão em seus ombros");
    cortaDialogo();
    System.out.println("Moa: Fica acordado garoto, por favor fica acordado");
    cortaDialogo();
    System.out.println("  /Ela tenta aquecer o garoto com sua blusa de frio");
    cortaDialogo();
    System.out.println("Moa: Por que... por que você teve que fugir.. por que Yzac?");
    cortaDialogo();
    System.out.println("  /Mas era tarde demais");
    cortaDialogo();
    System.out.println("Yzac: Moa...");
    cortaDialogo();
    System.out.println("/Yzac, em suas últimas visões de vida, sorri para Moa");
    cortaDialogo();
    System.out.println("Yzac: Porque eu não queria ser um peso...");
    cortaDialogo();
    System.out.println("Moa: VOCÊ NÃO É UM PESO NEM UM FARDO GAROTO, VOCÊ É A MELHOR COISA QUE ME ACONTECEU");
    cortaDialogo();
    System.out.println("  /Yzac chora");
    cortaDialogo();
    System.out.println("Yzac: eu...");
    cortaDialogo();
    System.out.println("Moa: NÃO PRECISA SE ESFORÇAR PRA FALAR OU ALGO ASSIM, SÓ MANTÉM A RESPIRAÇÃO CONTROLADA E...");
    cortaDialogo();
    System.out.println("  /ele segura a mão de Moa");
    cortaDialogo();
    System.out.println("Yzac: Eu te amo, mãe.");
    cortaDialogo();
    System.out.println("....");
    cortaDialogo();
    System.out.println("  /Moa chora sobre o corpo de Yzac");
    cortaDialogo();
    System.out.println("Moa: Eu te amo, filho.}}");
    cortaDialogo();
    System.out.println("  /O cajado apaga. \n  /Vocês voltam a sala de Yzac.");
    cortaDialogo();
    System.out.println("Alya: ..e então?");
    cortaDialogo();
    System.out.println("  /Yzac com seu rosto molhado tenta sorrir");
    cortaDialogo();
    System.out.println("Yzac: Ela estava lá... a minha mãe.. ela");
    cortaDialogo();
    System.out.println("Abraça-lo? S/N?");
    char simounao2 = sc.next().charAt(0);

    // if para definir sim ou nao
    
    if (simounao2 == 's'){
      System.out.println(" /Você abraça Yzac.");
      cortaDialogo();
      System.out.println("Alya: Se perdoe, garoto.");
      cortaDialogo();
      System.out.println(" /Yzac retribui o abraço com sua cabeça repousada no ombro de Alya");
      cortaDialogo();
    }
    else if (Simounao =='n') {
      System.out.println("Você... acha que não está pronta pra isso.");
      cortaDialogo();
    }
    else {
      System.out.println("Voce é burro ou oq, nao sabe digitar s ou n?");
      cortaDialogo();
    }

    
    System.out.println("{um dia depois}");
    cortaDialogo();
    System.out.println("  /Você e Yzac se veem na ponte vermelha. Ele está pronto para ser liberto.");
    cortaDialogo();
    System.out.println("Alya: Então, está realmente pronto, garoto?");
    cortaDialogo();
    System.out.println("Yzac: Sim… eu… não morri sozinho. Acho que na verdade, depois de tantas dificuldades que eu passei, aprender a ser amado por ela e… \nter retribuído no final… foi o que me fez encerrar esse caminho de “solidão”.");
    cortaDialogo();
    System.out.println("Alya: E como você se sente agora?");
    cortaDialogo();
    System.out.println("Yzac: acho que... livre.");
    cortaDialogo();
    System.out.println("Alya: Eu posso te contar uma coisa?");
    cortaDialogo();
    System.out.println("Yzac: Você também tinha problemas com a sua mãe, né?");
    cortaDialogo();
    System.out.println("Alya: Como..?");
    cortaDialogo();
    System.out.println("Yzac: Eu não sei... em um momento da nossa conversa você pareceu um pouco a mim, mas diferente de mim, você carrega tanta culpa em odiar a sua mãe.");
    cortaDialogo();
    System.out.println("Alya: Impossível de você saber isso pela fala..");
    cortaDialogo();
    System.out.println("Yzac: Eu só... sei, entende? É como se eu fosse um pouco de você, e talvez isso tenha despertado pelo menos um resquício de empatia em nós dois \no suficiente pra eu te entender... e você me entender.");
    cortaDialogo();
    System.out.println("Alya: Eu só quero... entender o que é tudo isso.. o que tá acontecendo.. o por que eu só me lembrei do problema da minha mãe quando falei com você e o por que de eu me sentir tão... errada.");
    cortaDialogo();
    System.out.println("Yzac: Seu trabalho não é salvar as pessoas daqui, Alya. Você tem que se salvar daqui.");
    cortaDialogo();
    System.out.println("Alya: e o que isso quer dizer?");
    cortaDialogo();
    System.out.println("Yzac: você sabe bem o que quero dizer... assim como sabe bem quem deve salvar.");
    cortaDialogo();
    System.out.println("  /Ele vai andando até você, te abraçando em despedida");
    cortaDialogo();
    System.out.println("Yzac: espero que você aprenda a amar o perdão pelas falhas, Alya. Assim, suas falhas serão perdoadas pelo amor.");
    cortaDialogo();
    System.out.println("  /O Cajado brilha intensamente sobre o abraço confidente dos dois, aos poucos, o que antes chamávamos de Yzac \nagora se torna pequenos pedaços de papel que voam pelo vento até o meio da ponte.");
    cortaDialogo();
    System.out.println("Alya: tchau pirralho...");
    cortaDialogo();
    System.out.println("  /você sorri");
    cortaDialogo();
    System.out.println("[Yzac não existe mais.]");
    cortaDialogo();
    System.out.println("[2/4 salvos]");
    cortaDialogo();
    System.out.println("[Últimas Palavras: espero que você aprenda a amar o perdão pelas falhas, Alya. Assim, suas falhas serão perdoadas pelo amor.]");
    cortaDialogo();
    System.out.println("Os pedaços de papel que antes estavam espalhados, agora se juntam, formando um desenho amassado de uma criança de mãos dadas com sua mãe.");
    cortaDialogo();
    System.out.println("/Você recebeu - Desenho - mãe e filho");
    cortaDialogo();
    System.out.println("Pelas águas, debaixo da ponte, uma voz é escutada");
    cortaDialogo();
    System.out.println("Rino: ALYA!!! PULA AQUI!! ");
    cortaDialogo();
    System.out.println("/Você vai até a ponta da ponte");
    cortaDialogo();
    System.out.println("Alya: Rino?? que merda você tá fazendo aqui??");
    cortaDialogo();
    System.out.println("Rino: SABE NADAR ALUA???");
    cortaDialogo();
    System.out.println("Alya: É ALYA, E SIM, EU SEI, MAS POR QU---");
    cortaDialogo();
    System.out.println("  /UMA ONDA GIGANTE CAUSADA PELO REMO DO RINO TE ATINGE FORTEMENTE, TE JOGANDO ENSOPADA NO BARCO");
    cortaDialogo();
    System.out.println("Alya: MAS QUE...");
    cortaDialogo();
    System.out.println("Rino: CONSEGUIU???");
    cortaDialogo();
    System.out.println("Alya: Consegui?? CONSEGUI O QUE?");
    cortaDialogo();
    System.out.println("Rino: ACHAR A ÚLTIMA PESSOA A SER SALVA, ALYA");
    cortaDialogo();
    System.out.println("Alya: Como assim? São só duas?");
    cortaDialogo();
    System.out.println("Rino: VOCÊ QUE DEVIA ME DIZER");
    cortaDialogo();
    System.out.println("Alya: Mas eu não sei... Eu... Eu acho que ... Eu acho que entendi o que o velho quis dizer com problemas mas eu não lembro direito o que era");
    cortaDialogo();
    System.out.println("Rino: Então está na hora de lembrar.");
    cortaDialogo();
    System.out.println("Alya: Por que você falou normaAAAAAA-");
    cortaDialogo();
    System.out.println("/Rino te joga tudo no rio");
    cortaDialogo();
    System.out.println("Rino: A água vai trazer seu passado, Alya. Essa é minha última tentativa..");
    cortaDialogo();
    System.out.println("Alya: TENTATIVA DO QUE???");
    cortaDialogo();
    System.out.println("Rino: De te salvar... Como um verdadeiro guardião");
    cortaDialogo();
    System.out.println("                Tudo apaga...");
    cortaDialogo();
    System.out.println("Durante um tempo a voz de Rino ecoa pela escuridão iminente.");
    cortaDialogo();
    System.out.println("Alya, por meio do Yzac, consegui despertar alguma coisa do seu passado com toda essa encenação de você ser uma Guardiã. EU sou o verdadeiro Guardião, e espero que essa minha última tentativa desesperada de te fazer se lembrar e se perdoar... valha a pena o meu esforço.");
    cortaDialogo();
    System.out.println("Alya: Então eu que sou a pessoa a ser salva?");
    cortaDialogo();
    System.out.println("        /Uma figura da escuridão sai");
    cortaDialogo();
    System.out.println("Yzac: Alya...");
    cortaDialogo();
    System.out.println("Alya: Yzac? Você não tinha..?");
    cortaDialogo();
    System.out.println("Yzac: Eu não sou alguém a ser salvo realmente, eu sou só o jeito que você vê a culpa.");
    cortaDialogo();
    System.out.println("Alya: Culpa.. do que?");
    cortaDialogo();
    System.out.println("Yzac: Da morte da sua mãe, de você, mesmo nem estando presente, se culpar tanto pelo acontecido. \nSua mãe foi um monstro por ter te deixado com toda essa culpa ou você é um monstro por culpar ela por tudo isso?");
    cortaDialogo();
    System.out.println("Alya, tente lembrar!!");
    cortaDialogo();
    System.out.println("(Tire maior que 10 no dado de 20 lados)");
    cortaDialogo();

    boolean rodouDadoCerto = false;

    // codigo para dado
    
    while (rodouDadoCerto == false) {
      System.out.println("(Aperte enter para rodar)");
      cortaDialogo();
      int dadoFunc = ra.nextInt(20);
      if (dadoFunc >= 10) {
        System.out.println("Caiu no número " + dadoFunc);
        cortaDialogo();
        System.out.println("Você vê as sombras de uma figura amorosa surgindo aos poucos.");
        cortaDialogo();
        rodouDadoCerto = true;
      } else {
        System.out.println("Caiu no número " + dadoFunc);
        cortaDialogo();
        System.out.println("VOCÊ VAI CONSEGUIR ALYA EU SEI QUE PODE");
        cortaDialogo();
      }

    }

    // final while

    System.out.println("Continue rodando pra se lembrar");
    cortaDialogo();
    boolean rodouDadoCerto2 = false;
      
    while (rodouDadoCerto2 == false) {
      System.out.println("(Aperte enter para rodar)");
      cortaDialogo();
      int dadoFunc = ra.nextInt(20);
      if (dadoFunc >= 10) {
        System.out.println("Caiu no número " + dadoFunc);
        cortaDialogo();
        System.out.println("você se lembra.");
        cortaDialogo();
        rodouDadoCerto2 = true;
      } else {
        System.out.println("Caiu no número " + dadoFunc);
        cortaDialogo();
        System.out.println("VOCÊ VAI CONSEGUIR ALYA EU SEI QUE PODE");
        cortaDialogo();
      }
    }

    System.out.println("{{Memórias da Alya:");
    cortaDialogo();
    System.out.println("A sombra de uma mulher amorosa se forma a sua frente");
    cortaDialogo();
    System.out.println("Mãe: Alya, minha querida, quer algo do mercado?");
    cortaDialogo();
    System.out.println("Alya: Me traz sorvete mamãe!");
    cortaDialogo();
    System.out.println("Mãe: claro, meu anjo.");
    cortaDialogo();
    System.out.println("  / Ela sai da casa, com passos lentos e um andar delicado.");
    cortaDialogo();
    System.out.println("  /Essa foi a última vez que você a viu… não há vestígio de memória que encontre outra cena com ela presente. \nApenas fotos… fotos de vocês duas juntas na sua festa de aniversário similar a foto do velho com o idoso, fotos de, vocês duas desenhando juntas assim como o desenho de Yzac e fotos de vocês brincando de faz de conta com um cajado-estrela feito a mão.");
    cortaDialogo();
    System.out.println("/A cena na sua cabeça muda para uma roda de sombras lhe cercando, as vozes dos seus irmãos.");
    cortaDialogo();
    System.out.println("Irmãos: ELA NÃO TERIA MORRIDO SE VOCÊ NÃO TIVESSE PEDIDO A DROGA DO SORVETE. ELA NÃO TERIA VOLTADO SÓ PORQUE SE ESQUECEU DE UMA MERDA DE SORVETE E NÃO TERIA BATIDO A PORRA DO CARRO");
    cortaDialogo();
    System.out.println("V O C Ê M A T O U E L A, A L Y A");
    cortaDialogo();
    System.out.println("  /Alya sai correndo pela casa, chorando amargurada pelas palavras crueis. Mas a queda lhe pega na escadaria.");
    cortaDialogo();
    System.out.println("/Alya bate a cabeça nos degraus e desacorda estirada no chão.}}");
    cortaDialogo();
    System.out.println("/Alya cai no chão a medida que a figura de Yzac desaparece de cena");
    cortaDialogo();
    System.out.println("Alya: Então… Fui eu? Mas eu era… só uma criança.");
    cortaDialogo();
    System.out.println("  /Uma mão toca seu ombro");
    cortaDialogo();
    System.out.println("Rino: Você se lembrou.");
    cortaDialogo();
    System.out.println("Alya: Eu… Eu matei a única pessoa que me amava…");
    cortaDialogo();
    System.out.println("  /Rino estende a mão e abre uma espécie de portal roxo flutuante.");
    cortaDialogo();
    System.out.println("Rino: Lembrar é um dos passos mais importantes pra se perdoar, mas não é o mais importante");
    cortaDialogo();
    System.out.println("Alya: O que… O que você quer que eu faça então?");
    cortaDialogo();
    System.out.println("Rino: Apenas se permita entender.");
    cortaDialogo();
    System.out.println("Alya: Entender o que?");
    cortaDialogo();
    System.out.println("Rino: Que não foi sua culpa…");
    cortaDialogo();
    System.out.println("  /Ele olha para o portal");
    cortaDialogo();
    System.out.println("Rino: A escolha é sua");
    cortaDialogo();
    System.out.println("Entrar? S/N");
    cortaDialogo();

    char respostaPortal = sc.next().charAt(0);
    if (respostaPortal == 'n'){
      System.out.println("Você se perde em escuridão…");
      cortaDialogo();
      System.out.println("Essa realidade não mais existe…");
      cortaDialogo();
      System.out.println("Você não mais existe.");
      cortaDialogo();
      System.out.println("Alya não resistiu");
      cortaDialogo();
      System.out.println("Fim de jogo.");
      cortaDialogo();
      menuInicial();
    }
    System.out.println("  /Você entra no portal. Essa é… A sua casa?");
    cortaDialogo();
    System.out.println("Mãe: Então você finalmente veio, Alya…");
    cortaDialogo();
    System.out.println("Alya: Mãe…");
    cortaDialogo();
    System.out.println("  /Uma criança passa correndo, literalmente atravessando você, como se você fosse só uma ilusão naquela cena");
    cortaDialogo();
    System.out.println("Alya criança: EU SEI, EU SEI, DA PRÓXIMA VEZ EU ARRUMO O QUARTO ANTES DE SAIR");
    cortaDialogo();
    System.out.println("Mãe: Não se preocupe, Alya. Eu não estou brava.");
    cortaDialogo();
    System.out.println("Alya Criança: Eu sei que não tá, mãe.");
    cortaDialogo();
    System.out.println("Mãe: Alya… Você não teve culpa.");
    cortaDialogo();
    System.out.println("/O cenário vai se desconstruindo em pequenos cacos aos poucos. Sua mãe olha exatamente aonde você está.");
    cortaDialogo();
    System.out.println("Mãe: Como você cresceu.");
    cortaDialogo();
    System.out.println("Mãe: Como você cresceu.");
    cortaDialogo();
    System.out.println("Alya: Você… Tá viva?");
    cortaDialogo();
    System.out.println("Mãe: Você sempre me deixou viva, minha pequena.");
    cortaDialogo();
    System.out.println("Alya: EU NÃO QUERIA, SE EU SOUBESSE QUE TUDO AQUILO ACONTECERIA EU NUNCA TERIA PEDIDO, EU ERA SÓ UMA CRIANÇA, MÃE. \nAGORA TODOS ME CULPAM POR VOCÊ TER IDO, DESCONTANDO A PORRA DE TODA A RAIVA DELES EM MI–");
    cortaDialogo();
    System.out.println("  /Você é abraçada por sua mãe");
    cortaDialogo();
    System.out.println("Mãe: Não há o que se perdoar aqui, Alya. Para agradar a minha menina, eu faria tudo de novo.");
    cortaDialogo();
    System.out.println("  /As figuras de Yzac, Moa, Velho e Rino surgem ao redor de vocês.");
    cortaDialogo();
    System.out.println("Mãe: Veja o que você fez consigo mesma, garota. Você não precisa justificar o que não precisa ser justificado.");
    cortaDialogo();
    System.out.println("  /Ela segura a sua mão");
    cortaDialogo();
    System.out.println("  Alya: Mas mãe… por causa de algo besta você…");
    cortaDialogo();
    System.out.println("Mãe: E se fosse algo sério… você se perdoaria?");
    cortaDialogo();
    System.out.println("Alya: …");
    cortaDialogo();
    System.out.println("Mãe: Mas se te alivia…");
    cortaDialogo();
    System.out.println("/Todos ao longo da sua jornada a abraçam");
    cortaDialogo();
    System.out.println("Mãe: Se sinta perdoada.");
    cortaDialogo();
    System.out.println("Rino: Você se sente perdoada, Alya?");
    cortaDialogo();
    System.out.println("1 - Por que deveria me sentir? \n 2 - Eu… Quero voltar…");
    cortaDialogo();

    int ultimaEscolha = sc.nextInt();
    if (ultimaEscolha == 1){
        System.out.println("Rino: Porque você está resistindo lá fora.");
        cortaDialogo();
        System.out.println("(Uma visão clara resplandece pela escuridão.)");
        cortaDialogo();
        System.out.println("(Você está numa cama de hospital, dormindo profundamente, resistindo… e resistindo…)");
        cortaDialogo();
        System.out.println("Rino: Para de se prender dentro da sua cabeça, da sua imaginação. Você sabe que a culpa não é sua, e… Apenas por isso você ainda vive na realidade.");
        cortaDialogo();
        System.out.println("Alya: E QUEM É VOCÊ PRA DIZER ISSO??");
        cortaDialogo();
        System.out.println("Rino: A sua vontade de viver. O Guardião da sua vida.");
        cortaDialogo();
        System.out.println("1 - Viver \n2 - Morrer");
        cortaDialogo();
        int ultimaEscolhaReal = sc.nextInt();
        
        if (ultimaEscolhaReal == 2) {
        System.out.println("No fundo. A escolha sempre foi sua.");
        cortaDialogo();
        System.out.println("E agora, se é isso que te liberta… Não há nada que possa ser feito.");
        cortaDialogo();
        System.out.println("As máquinas da realidade desligam.");
        cortaDialogo();
        System.out.println("Alya, infelizmente, se entregou a queda e não resistiu…");
        cortaDialogo();
        System.out.println("Fim de jogo");
        cortaDialogo();
        menuInicial();
        } else {
          System.out.println("Rino: Então você lembrou o que houve depois do seu acidente…");
          cortaDialogo();
          System.out.println("(Uma visão clara resplandece pela escuridão.)");
          cortaDialogo();
          System.out.println("(Você está numa cama de hospital, dormindo profundamente, resistindo… e resistindo…)");
          cortaDialogo();
          System.out.println("Rino: Como apenas uma figura da sua cabeça representando a sua vontade de viver, o Guardião da sua vida. Eu, Rino, te digo…");
          cortaDialogo();
          System.out.println("Você está salva.");
          cortaDialogo();
          System.out.println("Alya: MÃE!!!");
          cortaDialogo();
          System.out.println("Fim de jogo");
          cortaDialogo();
          menuInicial();
          
        }
      
    } else {
        System.out.println("Rino: Então você lembrou o que houve depois do seu acidente…");
        cortaDialogo();
        System.out.println("(Uma visão clara resplandece pela escuridão.)");
        cortaDialogo();
        System.out.println("(Você está numa cama de hospital, dormindo profundamente, resistindo… e resistindo…)");
        cortaDialogo();
        System.out.println("Rino: Como apenas uma figura da sua cabeça representando a sua vontade de viver, o Guardião da sua vida. Eu, Rino, te digo…");
        cortaDialogo();
        System.out.println("Você está salva.");
        cortaDialogo();
        System.out.println("Alya: MÃE!!!");
        cortaDialogo();
        System.out.println("Fim de jogo");
        cortaDialogo();
        menuInicial();
    }
  }

  // Funcao que roda o codigo no console
	
  public static void main(String[] args) {
		menuInicial();
	}
  
}
