package edu.sdsu.cs;


public class GraphVertex<V extends Comparable<V>> implements IVertex<V>, Comparable<IVertex<V>> {
    private V name;
    private int distanceFromStart;
    private IVertex<V> last;
    public IVertex<V> previous;

    @Override
    public void setPrevious(IVertex<V> prev)
    {
        this.previous = prev;
    }

    public IVertex<V> getPrevious()
    {
        return this.previous;

    }
    @Override
    public int getDistance() {
        return distanceFromStart;
    }

    @Override
    public IVertex<V> getLast() {
        return this.last;
    }

    @Override
    public void setLast(IVertex<V> last) {
        this.last = last;
    }

    //TODO needs a distance from start variable
    public GraphVertex(V name) {
        this.name = name;
        this.distanceFromStart = Integer.MAX_VALUE;
        this.last = null;
    }

    @Override
    public V getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString();
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(IVertex<V> vertex) {
        return name.equals(((GraphVertex<V>) vertex).name);
    }


    @Override
    public void setDistance(int distance) {
        this.distanceFromStart = distance;
    }

    @Override
    public int compareTo(IVertex<V> o) {
        Integer temp = (Integer) distanceFromStart;
        return temp.compareTo(o.getDistance());
    }
}