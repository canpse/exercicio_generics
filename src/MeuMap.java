import java.util.ArrayList;

class MeuMap<V> {
    private ArrayList<String> chaves;
    private ArrayList<V> valores;

    public MeuMap() {
        chaves = new ArrayList<>();
        valores = new ArrayList<>();
    }

    public boolean add(String key, V value) {
        if (!chaves.contains(key)) {
            chaves.add(key);
            valores.add(value);
            return true;
        }
        return false;
    }

    public V getValor(String key) {
        int index = chaves.indexOf(key);
        if (index != -1) {
            return valores.get(index);
        }
        return null;
    }
}
