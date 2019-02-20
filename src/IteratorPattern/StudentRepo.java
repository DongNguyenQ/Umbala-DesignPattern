/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author dongnq
 */
public class StudentRepo implements Container{
    
    public String students[] = {"abc", "kdb", "sbas", "qwed"};

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }
    
    
    private class StudentIterator implements Iterator {

        int pos;
        
        @Override
        public boolean hasNext() {
            if(pos < students.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext())
                return students[pos++];
            return null;
        }
        
    }
    
    
}
