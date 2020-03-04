public class RegraINSS {

    public boolean aposentado(int i, int s) {
        int calculo;

        if (s == 1)
            calculo = 65 - i;
        else
            calculo = 60 - i;

        if (calculo <= 0)
            return true;
        else
            return false;

    }

    public int pendencia(int i, int s) {
        int calculo;

        if (s == 1)
            calculo = 65 - i;
        else
            calculo = 60 - i;

        return calculo;
    }
}