# tpEngsoftPedagio

Para se compilar o programa basta rodar o comando mvn clean install  na pasta raís( Para executar este passo deve-se ter o apache maven instalado na máquina, 
e o valor do bin configurado no path de forma a permitir que o comando mvn funcione). O processo também pode ser executado usando a IDE Eclipse usando o 
build as maven project.

Para executar o código pode-se usar o Eclipse, com o Run as Java Application, devendo-se chamar a url localhost:8080/payment/instanciateDB primeiro, para instanciar 
os status, para não serem feitos manualmente. As url localhost:8080/payment/:identificadorSmartcard ou localhost:8080/payment/placa/:identificadorPlaca podem ser chamadas
substituindo o query string pelo valor que deve ser enviado para cobrança. Para executar o codigo pela linha de comando, após ser compilado com o maven, basta-se rodar o comando
java -jar .\Pedagio-0.0.1-SNAPSHOT.jar na pasta target gerada, e a aplicação será subida para a porta localgost:8080. É necessário a versão do java 11 ou superior para a execução 
deste código.