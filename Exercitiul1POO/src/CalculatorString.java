public class CalculatorString extends CalculatorStiintific{
    public CalculatorString(){
    }
    public String concatenare(String text, String text2){//-concateneaza 2 stringuri
        return text.concat(text2);
    }
    public int contineCaracter(String text, char a){//-contine caracterul
        return text.indexOf(a);
    }
    public int adunareStringuri(String text,String text2){//-aduna 2 stringuri
        return text.length()+text2.length();
    }
    public boolean stringParImpar(String text){//-Verifica daca stringul e impar sau par
        if(text.length()%2==0){
            return true;
        }else {
            return false;
        }
    }
        public char[] sirCaractere(String text2){ //-transforma stringul intr-un array
            return text2.toCharArray();
        }
    public boolean vocala(String text){ //- verifica daca stringul incepe cu o vocala
        char primaLitera=text.charAt(0);
        if(primaLitera=='a'|| primaLitera=='e'||primaLitera=='i'||primaLitera=='o'||primaLitera=='u'){
            return true;
        }else{
            return false;
        }
    }
    public int spatiiString(String text){ //-numara spatiile dintr-un string
        int nrSpatii=0;
        for(int cursor=0;cursor<text.length(); cursor++){
            if (text.charAt(cursor)==' '){
                nrSpatii++;
            }
        }
        return nrSpatii;
    }
}
