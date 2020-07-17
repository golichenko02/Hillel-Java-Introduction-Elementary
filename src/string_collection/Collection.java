package string_collection;

public interface Collection {

    boolean add(Object o); //++

    boolean add(int index, Object o);// ++

    boolean delete(Object o);// ++

    Object get(int index); // ++

    boolean contains(Object o); //++

    boolean equals(Collection str);//++

    boolean clear(); // ++

    int size();// ++
}
