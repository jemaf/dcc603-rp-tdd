import java.util.HashMap;
import java.util.Map;

class Bank {
    private final Map<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        return from.equals(to) ? 1 : rates.get(new Pair(from, to));
    }

    // pequeno record para usar como chave no mapa
    private record Pair(String from, String to) { }
}
