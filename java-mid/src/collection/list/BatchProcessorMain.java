package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        Batchprocessor processor = new Batchprocessor(list);
        processor.logic(50000);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        Batchprocessor processor2 = new Batchprocessor(list2);
        processor2.logic(50000);
    }
}
