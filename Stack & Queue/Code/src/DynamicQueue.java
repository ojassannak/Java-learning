public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        //this takes care ot it being full
        if (isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //call the previous item in new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        // at this point we know that array is not full
        //insert item

        return super.insert(item);
    }
}
