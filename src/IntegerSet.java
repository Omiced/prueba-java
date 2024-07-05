public class IntegerSet {
    private boolean[] set;

    public IntegerSet() {
        set = new boolean[101];
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    public static IntegerSet interseccion(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        } else {
            throw new IllegalArgumentException("El valor debe estar entre 0 y 100.");
        }
    }

    // Método deleteElement
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        } else {
            throw new IllegalArgumentException("El valor debe estar entre 0 y 100.");
        }
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        return isEmpty ? "-" : sb.toString().trim();
    }

    public boolean equalTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

}
