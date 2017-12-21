package cn.designmodel.iterator;

public class TestArrayList<T> implements TestList<T> {
    private static final int defaultCapacity=10;
    private Object[] list={};
    private int size;
    @Override
    public void add(T t) {
        if(size == list.length){
            if(list.length == 0){
                list = new Object[defaultCapacity];
            }else{
                Object[] temList = new Object[list.length*2];
                System.arraycopy(list,0,temList,0,list.length);
                list = temList;
            }
        }
        list[size++]=t;
    }

    @Override
    public T get(int index) {
        return (T) list[index];
    }

    public TestIterator getIterator(){
        return new TestIteratorInner();
    }

    private class TestIteratorInner implements TestIterator{
        private int position;
        @Override
        public boolean hasNext() {
            return position < TestArrayList.this.size;
        }

        @Override
        public T next() {
            return (T)TestArrayList.this.list[position++];
        }
    }
}
