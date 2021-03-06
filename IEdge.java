package edu.sdsu.cs;

public interface IEdge<E> {
    boolean equals(IEdge<E> edge);

    IVertex getStartVertex();

    IVertex getEndVertex();

    E getCost();
}