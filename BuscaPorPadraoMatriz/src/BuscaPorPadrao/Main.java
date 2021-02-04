package BuscaPorPadrao;
import  MatrixPatterns.Factories.MatrixPatternFactory ;

public  class  Main {

    public  static  void  main ( String [] args ) {

        tente {
            String fileLocation =  " src / matrixToFindPattern.txt " ; // args [0];
            int patternIndex =  1 ; // Integer.parseInt (args [1]);

            Leitor MatrixFileReader =  novo  MatrixFileReader ();
            byte [] [] matriz =  leitor . GetMatrix (fileLocation);

            MatrixPatternFinder patternFinder =  new  MatrixPatternFinder ( MatrixPatternFactory . Create (patternIndex));
            MatrixPatternFinderLoggerCollector registador =  patternFinder . FindPatternInMatrix (matriz);

            Sistema . fora . print (logger . toString ());
        } catch ( exceção exceto) {
            Sistema . err . print (exceto . getMessage ());
        }
    }
}