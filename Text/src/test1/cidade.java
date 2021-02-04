package test1;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cidade {

    public static void main(String[] args) throws IOException {
        List<Cidade> cidade = lerArquivo("C:\\\\Users\\\\Particular\\\\Downloads\\\\populacao.csv", ";"); 
       System.out.println("10 maiores cidades: " + Arrays.toString(dezMaioresPopu(lerArquivo(null, null))));
    }

    public static List<Cidade> lerArquivo(String arquivo, String separador) throws IOException {
        return Files
                .readAllLines(new File(arquivo).toPath(), StandardCharsets.UTF_8)
                .stream()
                .skip(1)
                .map(s -> Cidade.parse(s, separador))
                .collect(Collectors.toList());
    }

    public static int[] dezMenoresPopu(List<Cidade> Cidade, Function<? super Cidade, ? extends IntStream> popuTotal) {
        return Cidade.stream().flatMapToInt(popuTotal).limit(10).map(x -> -x).toArray();
    }
    
    public static int[] dezMaioresPopu(List<Cidade> Cidade) {
        return Cidade.stream().mapToInt(null).map(x -> -x).sorted().limit(10).map(x -> -x).toArray();
    }

	public static class Cidade {
        private final String UF;
        private final String municipio;
        private final int popuTotal;
        private final int homens;
        private final int mulheres;
	

        public Cidade( String UF, String municipio, int popuTotal, int homens, int mulheres) {
            this.UF = UF;
            this.municipio = municipio;
            this.popuTotal = popuTotal;
            this.homens = homens;
            this.mulheres = mulheres;
        }

        public static Cidade parse(String linha, String separador) {
            String[] partes = linha.split(separador);
            if (partes.length != 5) {
                throw new IllegalArgumentException("Linha de jogador mal-formada: " + linha);
            }
            try {
                return new Cidade(
                    partes[3].trim(),
                    partes[1].trim(),
                    Integer.parseInt(partes[2].trim()),
                    Integer.parseInt(partes[0].trim()),
                    Integer.parseInt(partes[4].trim()));
            } catch (NumberFormatException x) {
                throw new IllegalArgumentException("Linha de jogador mal-formada: " + linha);
            }
        }

        public String getUF() { return UF; }
        public String getMunicipio() { return municipio; }
        public int getPopuTotal() { return popuTotal; }
        public int getHomens() { return homens; }
        public int getmulheres() { return mulheres; }
    }
}
