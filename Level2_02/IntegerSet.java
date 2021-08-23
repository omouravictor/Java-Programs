package Level2_02;

public class IntegerSet {

    private int maxValue;
    private int size;
    private boolean set[];

    public IntegerSet(int maxValue) {
        this.maxValue = maxValue;
        this.size = maxValue + 1;
        this.set = new boolean[size];
    }

    public void insertElement(int num) {
        if (num >= 0 && num <= maxValue) {
            set[num] = true;
        }
    }

    public void deleteElement(int num) {
        if (num >= 0 && num <= maxValue) {
            set[num] = false;
        }
    }

    public boolean[] getUnionSet(IntegerSet inSet) {
        int unionSize = size + inSet.getSize();
        boolean unionSet[] = new boolean[unionSize];
        System.arraycopy(set, 0, unionSet, 0, size);
        for (int i = 0; i < inSet.getSize(); i++) {
            if (!unionSet[i] && inSet.getSet()[i]) {
                unionSet[i] = true;
            }
        }
        return unionSet;
    }

    public boolean[] getIntersectionSet(IntegerSet inSet) {
        int intersectionSize = size > inSet.getSize() ? inSet.getSize() : size;
        boolean intersectionSet[] = new boolean[size];
        for (int i = 0; i < intersectionSize; i++) {
            if (set[i] && inSet.getSet()[i]) {
                intersectionSet[i] = true;
            }
        }
        return intersectionSet;
    }

    public boolean[] getDifferenceSet(IntegerSet inSet) {
        boolean differenceSet[] = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (set[i] && !inSet.getSet()[i]) {
                differenceSet[i] = true;
            }
        }
        return differenceSet;
    }

    public String setToString(boolean set[]) {
        String setString = "{ ";
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                setString += String.valueOf(i);
                setString += " ";
            }
        }
        setString += "}";
        return setString;
    }

    @Override
    public String toString() {
        return setToString(set);
    }

    public boolean[] getSet() {
        return set;
    }

    public int getSize() {
        return size;
    }

}
