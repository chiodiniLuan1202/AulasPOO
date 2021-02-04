package TrabalhoJunior;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorCSV {

public List<Populacao> lerArquivo(){
List<Populacao> populacao = new ArrayList<Populacao>();


File arquivoCSV = new File("C:\\Users\\Particular\\Downloads\\populacao.csv");

try {

String linhasDoArquivoCSV = new String();

Scanner leitorCSV = new Scanner(arquivoCSV);

boolean primeiraLinha = true;

while (leitorCSV.hasNext()) {

linhasDoArquivoCSV = leitorCSV.nextLine();

if(primeiraLinha) {
primeiraLinha = false;
continue;
}

String[] valor = linhasDoArquivoCSV.split(";");

Populacao coluna = new Populacao();

coluna.setUF(valor[0]);
coluna.setMunicipios(valor[1]);
coluna.setPopTotal(Integer.parseInt(valor[2]));
coluna.setHomens(Integer.parseInt(valor[3]));
coluna.setMulheres(Integer.parseInt(valor[4]));


populacao.add(coluna);

}

} catch(FileNotFoundException e) {

}

return populacao;
}

}

